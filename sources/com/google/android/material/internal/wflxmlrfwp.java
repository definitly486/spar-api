package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wflxmlrfwp {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final Comparator f23002iobyxmoadg = new iobyxmoadg();

    class iobyxmoadg implements Comparator {
        iobyxmoadg() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            return view.getTop() - view2.getTop();
        }
    }

    public static TextView eablkybsjg(Toolbar toolbar) {
        List listWkgbmnqykc = wkgbmnqykc(toolbar, toolbar.getTitle());
        if (listWkgbmnqykc.isEmpty()) {
            return null;
        }
        return (TextView) Collections.min(listWkgbmnqykc, f23002iobyxmoadg);
    }

    private static ImageView iobyxmoadg(Toolbar toolbar, Drawable drawable) {
        ImageView imageView;
        Drawable drawable2;
        if (drawable == null) {
            return null;
        }
        for (int i13 = 0; i13 < toolbar.getChildCount(); i13++) {
            View childAt = toolbar.getChildAt(i13);
            if ((childAt instanceof ImageView) && (drawable2 = (imageView = (ImageView) childAt).getDrawable()) != null && drawable2.getConstantState() != null && drawable2.getConstantState().equals(drawable.getConstantState())) {
                return imageView;
            }
        }
        return null;
    }

    public static TextView ppxfxbqfkf(Toolbar toolbar) {
        List listWkgbmnqykc = wkgbmnqykc(toolbar, toolbar.getSubtitle());
        if (listWkgbmnqykc.isEmpty()) {
            return null;
        }
        return (TextView) Collections.max(listWkgbmnqykc, f23002iobyxmoadg);
    }

    private static List wkgbmnqykc(Toolbar toolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < toolbar.getChildCount(); i13++) {
            View childAt = toolbar.getChildAt(i13);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static ImageView zoijcleaow(Toolbar toolbar) {
        return iobyxmoadg(toolbar, toolbar.getLogo());
    }
}
