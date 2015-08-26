package com.kagami.averagegridlayout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by kagami on 15/8/26.
 */
public class AverageGridLayout extends ViewGroup {
    private int mRow=3, mColumn=3;

    public AverageGridLayout(Context context) {
        super(context);
    }

    public AverageGridLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public AverageGridLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        final int sizeWidth = MeasureSpec.getSize(widthMeasureSpec);
        final int sizeHeight = MeasureSpec.getSize(heightMeasureSpec);
        final int count = this.getChildCount();
        final int childWidth=(sizeWidth- this.getPaddingRight() - this.getPaddingLeft())/ mColumn;
        final int childHeight=(sizeHeight-this.getPaddingTop() - this.getPaddingBottom())/ mRow;
        for (int i = 0; i < count; i++) {
            final View child = this.getChildAt(i);
            final LayoutParams lp = (LayoutParams) child.getLayoutParams();
            child.measure(
                    getChildMeasureSpec(widthMeasureSpec,0, childWidth-lp.leftMargin-lp.rightMargin),
                    getChildMeasureSpec(heightMeasureSpec, 0, childHeight-lp.topMargin-lp.bottomMargin)
            );
        }
        setMeasuredDimension(sizeWidth, sizeHeight);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        final int count = this.getChildCount();
        int xOffset=getLeftPaddingOffset(),yOffset=getTopPaddingOffset();
        int unitW=(r-l-getPaddingLeft()-getPaddingRight())/mColumn;
        int unitH=(b-t-getPaddingTop()-getPaddingBottom())/mRow;
        for (int i = 0; i < count; i++) {
            View child = this.getChildAt(i);
            final LayoutParams lp = (LayoutParams) child.getLayoutParams();
            xOffset+=unitW;
            if(i%mColumn==0){
                xOffset=getLeftPaddingOffset();
                if(i!=0)
                    yOffset+=unitH;
            }
            child.layout(xOffset + lp.leftMargin, yOffset + lp.topMargin, xOffset + unitW - lp.leftMargin, yOffset + unitH - lp.bottomMargin);
        }
    }

    public void setRowCount(int rowCount){
        mRow=rowCount;
        requestLayout();
    }
    public void setColumnCount(int columnCount){
        mColumn=columnCount;
        requestLayout();
    }

    @Override
    protected boolean checkLayoutParams(ViewGroup.LayoutParams p) {
        return p instanceof LayoutParams;
    }

    @Override
    protected LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
    }

    @Override
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(this.getContext(), attributeSet);
    }

    @Override
    protected LayoutParams generateLayoutParams(ViewGroup.LayoutParams p) {
        return new LayoutParams(p);
    }
    public static class LayoutParams extends MarginLayoutParams{

        public LayoutParams(Context c, AttributeSet attrs) {
            super(c, attrs);
        }

        public LayoutParams(int width, int height) {
            super(width, height);
        }

        public LayoutParams(MarginLayoutParams source) {
            super(source);
        }

        public LayoutParams(ViewGroup.LayoutParams source) {
            super(source);
        }
    }
}
