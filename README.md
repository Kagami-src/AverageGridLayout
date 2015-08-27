# AverageGridLayout
a simple GridLayout for Android


#### use layout xml
```xml
<com.kagami.averagegridlayout.AverageGridLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:background="#00ff00"
        android:id="@+id/view">
        <View
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:background="#ff0000"
            android:layout_margin="6dp"
            />
        <View
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:background="#ff0000"
            />
        <View
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:background="#0000ff"
            />
        <View
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:background="#0000ff"
            />
        <FrameLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent">
            <Button
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:id="@+id/button"
                android:text="4 Column"/>
        </FrameLayout>
    </com.kagami.averagegridlayout.AverageGridLayout>
```
License
-------
    The MIT License (MIT)

    Copyright (c) 2015 Kagami

    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:

    The above copyright notice and this permission notice shall be included in all
    copies or substantial portions of the Software.
    
    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
    SOFTWARE.
