/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder.stringbuilder;

/**
 *
 * @author HONGNHUNG
 */
public class MyStringBuilder {
    String str;

        public MyStringBuilder() {
        }
        public MyStringBuilder Str(String s)
        {
            this.str = s;
            return this;
        }

        public MyStringBuilder addString(String s)
        {
            this.str = str+s;
            return this;
        }
        public MyStringBuilder addFloat(float f)
        {
            this.str = str + f;
            return this;
        }
        public MyStringBuilder addBool(boolean b)
        {
            this.str = str+b;
            return this;
        }
        
        public MyStringBuilder build()
        {
            return new MyStringBuilder();
        }
        @Override
        public String toString() {
            return "MyStringBuilder{" + "string=" + str + '}';
        }
}
