# AnswerView

A library mimics the circles used in optic forms.

## Screenshot
![Image](https://raw.githubusercontent.com/buraktamturk/AnswerView/master/screenshots/screen1.png)

## Usage

It's simple

    <org.buraktamturk.answerview.AnswerView
        android:id="@+id/av"
        android:layout_width="336dp"
        android:layout_height="wrap_content"
        android:padding="5dp"
        app:aw_changeOnClick="true" // if it's set to true the answer will change when user clicked on it, if not callback will make decision (default value is true)
        app:aw_canCancelAnswer="false" // can user cancel the answer that previosly answered by clicking the answer twice (default value is true)
        app:aw_ShowNumber="true" // show number of the question (default value is false)
        app:aw_NumberOfAnswers="6" // Number of answers (A B C D E F) (default value is 5)
    />

You will be notified when user changes the Answer by OnAnswerChange interface, you can set it by calling onAnswerChange function of the view.

## Download

```groovy
compile 'org.buraktamturk:answerview:1.0.1'
```

# The MIT License (MIT)

Copyright (c) 2015 Burak Tamtürk

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
