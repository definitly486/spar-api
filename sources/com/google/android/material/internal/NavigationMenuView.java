package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public class NavigationMenuView extends RecyclerView implements androidx.appcompat.view.menu.gtknphoqwx {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.gtknphoqwx
    public void iobyxmoadg(androidx.appcompat.view.menu.eablkybsjg eablkybsjgVar) {
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        setLayoutManager(new LinearLayoutManager(context, 1, false));
    }
}
