package t;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private long f109107iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final SparseLongArray f109110zoijcleaow = new SparseLongArray();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final SparseBooleanArray f109108ppxfxbqfkf = new SparseBooleanArray();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final List f109109wkgbmnqykc = new ArrayList();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f109105eablkybsjg = -1;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private int f109106gxszxtbevo = -1;

    private final long gxszxtbevo(int i13) {
        long jValueAt;
        int iIndexOfKey = this.f109110zoijcleaow.indexOfKey(i13);
        if (iIndexOfKey >= 0) {
            jValueAt = this.f109110zoijcleaow.valueAt(iIndexOfKey);
        } else {
            jValueAt = this.f109107iobyxmoadg;
            this.f109107iobyxmoadg = 1 + jValueAt;
            this.f109110zoijcleaow.put(i13, jValueAt);
        }
        return lereixgezr.iobyxmoadg(jValueAt);
    }

    private final void iobyxmoadg(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (this.f109110zoijcleaow.indexOfKey(pointerId) < 0) {
                SparseLongArray sparseLongArray = this.f109110zoijcleaow;
                long j13 = this.f109107iobyxmoadg;
                this.f109107iobyxmoadg = 1 + j13;
                sparseLongArray.put(pointerId, j13);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (this.f109110zoijcleaow.indexOfKey(pointerId2) < 0) {
            SparseLongArray sparseLongArray2 = this.f109110zoijcleaow;
            long j14 = this.f109107iobyxmoadg;
            this.f109107iobyxmoadg = 1 + j14;
            sparseLongArray2.put(pointerId2, j14);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.f109108ppxfxbqfkf.put(pointerId2, true);
            }
        }
    }

    private final boolean lqeggnwhkg(MotionEvent motionEvent, int i13) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i14 = 0; i14 < pointerCount; i14++) {
            if (motionEvent.getPointerId(i14) == i13) {
                return true;
            }
        }
        return false;
    }

    private final void nufgyqmvbu(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!this.f109108ppxfxbqfkf.get(pointerId, false)) {
                this.f109110zoijcleaow.delete(pointerId);
                this.f109108ppxfxbqfkf.delete(pointerId);
            }
        }
        if (this.f109110zoijcleaow.size() > motionEvent.getPointerCount()) {
            for (int size = this.f109110zoijcleaow.size() - 1; -1 < size; size--) {
                int iKeyAt = this.f109110zoijcleaow.keyAt(size);
                if (!lqeggnwhkg(motionEvent, iKeyAt)) {
                    this.f109110zoijcleaow.removeAt(size);
                    this.f109108ppxfxbqfkf.delete(iKeyAt);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0083  */
    /* JADX WARN: Code duplicated, block: B:14:0x0086  */
    /* JADX WARN: Code duplicated, block: B:16:0x0089  */
    /* JADX WARN: Code duplicated, block: B:18:0x008c  */
    /* JADX WARN: Code duplicated, block: B:20:0x008f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0098  */
    /* JADX WARN: Code duplicated, block: B:23:0x009f  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:29:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:34:0x0113  */
    /* JADX WARN: Code duplicated, block: B:38:0x0127  */
    /* JADX WARN: Code duplicated, block: B:39:0x014d  */
    private final cdpycssgdh wkgbmnqykc(dsvhmnatus dsvhmnatusVar, MotionEvent motionEvent, int i13, boolean z13) {
        long j13;
        long jOxmwwwfdhm;
        long jIobyxmoadg;
        long jWflxmlrfwp;
        int toolType;
        int iEablkybsjg;
        int historySize;
        int i14;
        long jPpxfxbqfkf;
        float historicalX;
        int i15 = i13;
        long jGxszxtbevo = gxszxtbevo(motionEvent.getPointerId(i13));
        float pressure = motionEvent.getPressure(i13);
        float x13 = motionEvent.getX(i13);
        long jEablkybsjg = g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(motionEvent.getY(i13))) & 4294967295L) | (Float.floatToRawIntBits(x13) << 32));
        long jLqeggnwhkg = g.eablkybsjg.lqeggnwhkg(jEablkybsjg, 0.0f, 0.0f, 3, null);
        if (i15 != 0) {
            if (Build.VERSION.SDK_INT >= 29) {
                jIobyxmoadg = gtknphoqwx.f109078iobyxmoadg.iobyxmoadg(motionEvent, i15);
                jWflxmlrfwp = dsvhmnatusVar.wflxmlrfwp(jIobyxmoadg);
            } else {
                j13 = jEablkybsjg;
                jOxmwwwfdhm = dsvhmnatusVar.oxmwwwfdhm(jEablkybsjg);
            }
            toolType = motionEvent.getToolType(i13);
            if (toolType != 0) {
                iEablkybsjg = cllcsxoeiz.f109054iobyxmoadg.eablkybsjg();
            } else if (toolType != 1) {
                iEablkybsjg = cllcsxoeiz.f109054iobyxmoadg.wkgbmnqykc();
            } else if (toolType != 2) {
                iEablkybsjg = cllcsxoeiz.f109054iobyxmoadg.ppxfxbqfkf();
            } else if (toolType != 3) {
                iEablkybsjg = cllcsxoeiz.f109054iobyxmoadg.zoijcleaow();
            } else if (toolType != 4) {
                iEablkybsjg = cllcsxoeiz.f109054iobyxmoadg.eablkybsjg();
            } else {
                iEablkybsjg = cllcsxoeiz.f109054iobyxmoadg.iobyxmoadg();
            }
            int i16 = iEablkybsjg;
            ArrayList arrayList = new ArrayList(motionEvent.getHistorySize());
            i14 = 0;
            for (historySize = motionEvent.getHistorySize(); i14 < historySize; historySize = historySize) {
                historicalX = motionEvent.getHistoricalX(i15, i14);
                float historicalY = motionEvent.getHistoricalY(i15, i14);
                if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040 && (Float.floatToRawIntBits(historicalY) & Integer.MAX_VALUE) < 2139095040) {
                    long jEablkybsjg2 = g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(historicalY)) & 4294967295L) | (Float.floatToRawIntBits(historicalX) << 32));
                    arrayList.add(new ppxfxbqfkf(motionEvent.getHistoricalEventTime(i14), jEablkybsjg2, jEablkybsjg2, null));
                }
                i14++;
                i15 = i13;
            }
            if (motionEvent.getActionMasked() == 8) {
                float axisValue = motionEvent.getAxisValue(10);
                jPpxfxbqfkf = g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + 0.0f)) & 4294967295L) | (Float.floatToRawIntBits(axisValue) << 32));
            } else {
                jPpxfxbqfkf = g.eablkybsjg.f35584zoijcleaow.ppxfxbqfkf();
            }
            return new cdpycssgdh(jGxszxtbevo, motionEvent.getEventTime(), jOxmwwwfdhm, j13, z13, pressure, i16, this.f109108ppxfxbqfkf.get(motionEvent.getPointerId(i13), false), arrayList, jPpxfxbqfkf, jLqeggnwhkg, null);
        }
        float rawX = motionEvent.getRawX();
        jIobyxmoadg = g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(motionEvent.getRawY())) & 4294967295L) | (Float.floatToRawIntBits(rawX) << 32));
        jWflxmlrfwp = dsvhmnatusVar.wflxmlrfwp(jIobyxmoadg);
        jOxmwwwfdhm = jIobyxmoadg;
        j13 = jWflxmlrfwp;
        toolType = motionEvent.getToolType(i13);
        if (toolType != 0) {
            iEablkybsjg = cllcsxoeiz.f109054iobyxmoadg.eablkybsjg();
        } else if (toolType != 1) {
            iEablkybsjg = cllcsxoeiz.f109054iobyxmoadg.wkgbmnqykc();
        } else if (toolType != 2) {
            iEablkybsjg = cllcsxoeiz.f109054iobyxmoadg.ppxfxbqfkf();
        } else if (toolType != 3) {
            iEablkybsjg = cllcsxoeiz.f109054iobyxmoadg.zoijcleaow();
        } else if (toolType != 4) {
            iEablkybsjg = cllcsxoeiz.f109054iobyxmoadg.eablkybsjg();
        } else {
            iEablkybsjg = cllcsxoeiz.f109054iobyxmoadg.iobyxmoadg();
        }
        int i17 = iEablkybsjg;
        ArrayList arrayList2 = new ArrayList(motionEvent.getHistorySize());
        i14 = 0;
        while (i14 < historySize) {
            historicalX = motionEvent.getHistoricalX(i15, i14);
            float historicalY2 = motionEvent.getHistoricalY(i15, i14);
            if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040) {
            }
            i14++;
            i15 = i13;
        }
        if (motionEvent.getActionMasked() == 8) {
            float axisValue2 = motionEvent.getAxisValue(10);
            jPpxfxbqfkf = g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + 0.0f)) & 4294967295L) | (Float.floatToRawIntBits(axisValue2) << 32));
        } else {
            jPpxfxbqfkf = g.eablkybsjg.f35584zoijcleaow.ppxfxbqfkf();
        }
        return new cdpycssgdh(jGxszxtbevo, motionEvent.getEventTime(), jOxmwwwfdhm, j13, z13, pressure, i17, this.f109108ppxfxbqfkf.get(motionEvent.getPointerId(i13), false), arrayList2, jPpxfxbqfkf, jLqeggnwhkg, null);
    }

    private final void zoijcleaow(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.f109105eablkybsjg && source == this.f109106gxszxtbevo) {
            return;
        }
        this.f109105eablkybsjg = toolType;
        this.f109106gxszxtbevo = source;
        this.f109108ppxfxbqfkf.clear();
        this.f109110zoijcleaow.clear();
    }

    public final void eablkybsjg(int i13) {
        this.f109108ppxfxbqfkf.delete(i13);
        this.f109110zoijcleaow.delete(i13);
    }

    public final istkbnxepw ppxfxbqfkf(MotionEvent motionEvent, dsvhmnatus dsvhmnatusVar) {
        int actionIndex;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3 || actionMasked == 4) {
            this.f109110zoijcleaow.clear();
            this.f109108ppxfxbqfkf.clear();
            return null;
        }
        zoijcleaow(motionEvent);
        iobyxmoadg(motionEvent);
        boolean z13 = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z14 = actionMasked == 8;
        if (z13) {
            this.f109108ppxfxbqfkf.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        if (actionMasked != 1) {
            actionIndex = actionMasked != 6 ? -1 : motionEvent.getActionIndex();
        } else {
            actionIndex = 0;
        }
        this.f109109wkgbmnqykc.clear();
        int pointerCount = motionEvent.getPointerCount();
        int i13 = 0;
        while (i13 < pointerCount) {
            this.f109109wkgbmnqykc.add(wkgbmnqykc(dsvhmnatusVar, motionEvent, i13, (z13 || i13 == actionIndex || (z14 && motionEvent.getButtonState() == 0)) ? false : true));
            i13++;
        }
        nufgyqmvbu(motionEvent);
        return new istkbnxepw(motionEvent.getEventTime(), this.f109109wkgbmnqykc, motionEvent);
    }
}
