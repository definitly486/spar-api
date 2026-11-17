package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
abstract class ojitshcjhn extends LinearLayoutManager {

    class iobyxmoadg extends androidx.recyclerview.widget.rgvfuqvkyq {
        iobyxmoadg(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.rgvfuqvkyq
        protected float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    ojitshcjhn(Context context, int i13, boolean z13) {
        super(context, i13, z13);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.rgvfuqvkyq
    public void b0(RecyclerView recyclerView, RecyclerView.zynmafqrjb zynmafqrjbVar, int i13) {
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg(recyclerView.getContext());
        iobyxmoadgVar.setTargetPosition(i13);
        c0(iobyxmoadgVar);
    }
}
