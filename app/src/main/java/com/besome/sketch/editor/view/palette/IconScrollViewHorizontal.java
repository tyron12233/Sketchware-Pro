package com.besome.sketch.editor.view.palette;

import android.content.Context;
import com.besome.sketch.beans.LayoutBean;
import com.besome.sketch.beans.ViewBean;

public class IconScrollViewHorizontal extends IconBase {
    public IconScrollViewHorizontal(Context context) {
        super(context);
    }

    @Override // com.besome.sketch.lib.base.BaseWidget
    public void a(Context context) {
        super.a(context);
        setWidgetImage(2131166250);
        setWidgetName("Scroll(H)");
    }

    @Override // com.besome.sketch.editor.view.palette.IconBase
    public ViewBean getBean() {
        ViewBean viewBean = new ViewBean();
        viewBean.type = 2;
        LayoutBean layoutBean = viewBean.layout;
        layoutBean.width = -1;
        layoutBean.paddingLeft = 8;
        layoutBean.paddingTop = 8;
        layoutBean.paddingRight = 8;
        layoutBean.paddingBottom = 8;
        viewBean.convert = "HorizontalScrollView";
        return viewBean;
    }
}
