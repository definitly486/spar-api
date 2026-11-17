package com.google.android.gms.common.data;

/* JADX INFO: loaded from: classes2.dex */
public interface DataBufferObserver {

    public interface Observable {
        void addObserver(DataBufferObserver dataBufferObserver);

        void removeObserver(DataBufferObserver dataBufferObserver);
    }

    void onDataChanged();

    void onDataRangeChanged(int i13, int i14);

    void onDataRangeInserted(int i13, int i14);

    void onDataRangeMoved(int i13, int i14, int i15);

    void onDataRangeRemoved(int i13, int i14);
}
