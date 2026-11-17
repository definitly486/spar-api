package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public abstract class EntityBuffer<T> extends AbstractDataBuffer<T> {
    private boolean zaa;
    private ArrayList zab;

    @KeepForSdk
    protected EntityBuffer(DataHolder dataHolder) {
        super(dataHolder);
        this.zaa = false;
    }

    private final void zab() {
        synchronized (this) {
            try {
                if (!this.zaa) {
                    int count = ((DataHolder) Preconditions.checkNotNull(this.mDataHolder)).getCount();
                    ArrayList arrayList = new ArrayList();
                    this.zab = arrayList;
                    if (count > 0) {
                        arrayList.add(0);
                        String primaryDataMarkerColumn = getPrimaryDataMarkerColumn();
                        String string = this.mDataHolder.getString(primaryDataMarkerColumn, 0, this.mDataHolder.getWindowIndex(0));
                        for (int i13 = 1; i13 < count; i13++) {
                            int windowIndex = this.mDataHolder.getWindowIndex(i13);
                            String string2 = this.mDataHolder.getString(primaryDataMarkerColumn, i13, windowIndex);
                            if (string2 == null) {
                                throw new NullPointerException("Missing value for markerColumn: " + primaryDataMarkerColumn + ", at row: " + i13 + ", for window: " + windowIndex);
                            }
                            if (!string2.equals(string)) {
                                this.zab.add(Integer.valueOf(i13));
                                string = string2;
                            }
                        }
                    }
                    this.zaa = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public final T get(int i13) {
        int iIntValue;
        int iIntValue2;
        zab();
        int iZaa = zaa(i13);
        int i14 = 0;
        if (i13 >= 0 && i13 != this.zab.size()) {
            if (i13 == this.zab.size() - 1) {
                iIntValue = ((DataHolder) Preconditions.checkNotNull(this.mDataHolder)).getCount();
                iIntValue2 = ((Integer) this.zab.get(i13)).intValue();
            } else {
                iIntValue = ((Integer) this.zab.get(i13 + 1)).intValue();
                iIntValue2 = ((Integer) this.zab.get(i13)).intValue();
            }
            int i15 = iIntValue - iIntValue2;
            if (i15 == 1) {
                int iZaa2 = zaa(i13);
                int windowIndex = ((DataHolder) Preconditions.checkNotNull(this.mDataHolder)).getWindowIndex(iZaa2);
                String childDataMarkerColumn = getChildDataMarkerColumn();
                if (childDataMarkerColumn == null || this.mDataHolder.getString(childDataMarkerColumn, iZaa2, windowIndex) != null) {
                    i14 = 1;
                }
            } else {
                i14 = i15;
            }
        }
        return getEntry(iZaa, i14);
    }

    @KeepForSdk
    protected String getChildDataMarkerColumn() {
        return null;
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @KeepForSdk
    public int getCount() {
        zab();
        return this.zab.size();
    }

    @KeepForSdk
    protected abstract T getEntry(int i13, int i14);

    @KeepForSdk
    protected abstract String getPrimaryDataMarkerColumn();

    final int zaa(int i13) {
        if (i13 >= 0 && i13 < this.zab.size()) {
            return ((Integer) this.zab.get(i13)).intValue();
        }
        throw new IllegalArgumentException("Position " + i13 + " is out of bounds for this buffer");
    }
}
