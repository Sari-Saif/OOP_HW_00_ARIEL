package HW0;

import java.util.Stack;

public class UndoableStringBuilder implements IUndoableStringBuilder
{
    private StringBuilder _str;
    private Stack<String> _stack;


    public UndoableStringBuilder()
    {
        this._str = new StringBuilder();
        this._stack = new Stack<String>();

    }

    @Override
    public UndoableStringBuilder append(String str)
    {
        this._str.append(str);
        this._stack.push(this._str.toString());
        return this;
    }

    @Override
    public UndoableStringBuilder delete(int start, int end)
    {
        this._str.delete(start ,end);
        this._stack.push(this._str.toString());
        return this;

    }

    @Override
    public UndoableStringBuilder insert(int offset, String str)
    {
        this._str.insert(offset,str);
        this._stack.push(this._str.toString());
        return this;
    }

    @Override
    public UndoableStringBuilder replace(int start, int end, String str)
    {
        this._str.replace(start ,end ,str);
        this._stack.push(this._str.toString());
        return this;
    }

    @Override
    public UndoableStringBuilder reverse() {
        this._str.reverse();
        this._stack.push(this._str.toString());
        return this;
    }

    @Override
    public UndoableStringBuilder undo()
    {

        if(this._stack.empty())
        {
            return this;
        }

        this._stack.pop();

        this._str.delete(0, _str.length());

        if(!this._stack.empty())
        {
            _str.append(_stack.peek());
        }
      return this;
    }

    @Override
    public String toString()
    {
        return this._str.toString();
    }
}
