package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class btonecajqb {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    iobyxmoadg f4033eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Object f4034iobyxmoadg = new Object();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final LongSparseArray f4037zoijcleaow = new LongSparseArray();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    Map f4035ppxfxbqfkf = new HashMap();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final LongSparseArray f4036wkgbmnqykc = new LongSparseArray();

    interface iobyxmoadg {
        void iobyxmoadg(draadjrbmk draadjrbmkVar, TotalCaptureResult totalCaptureResult, int i13);
    }

    btonecajqb() {
    }

    private void btonecajqb(LongSparseArray longSparseArray, long j13, Object obj) {
        List list = (List) longSparseArray.get(j13);
        if (list != null) {
            list.remove(obj);
            if (list.isEmpty()) {
                longSparseArray.remove(j13);
            }
        }
    }

    private void dxjokdxxww(draadjrbmk draadjrbmkVar, TotalCaptureResult totalCaptureResult) {
        iobyxmoadg iobyxmoadgVar;
        Integer num;
        synchronized (this.f4034iobyxmoadg) {
            try {
                iobyxmoadgVar = this.f4033eablkybsjg;
                if (iobyxmoadgVar != null) {
                    num = (Integer) this.f4035ppxfxbqfkf.get(totalCaptureResult);
                } else {
                    draadjrbmkVar.zoijcleaow();
                    iobyxmoadgVar = null;
                    num = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.iobyxmoadg(draadjrbmkVar, totalCaptureResult, num.intValue());
        }
    }

    private void gtknphoqwx() {
        synchronized (this.f4034iobyxmoadg) {
            try {
                if (this.f4036wkgbmnqykc.size() != 0 && this.f4037zoijcleaow.size() != 0) {
                    long jKeyAt = this.f4036wkgbmnqykc.keyAt(0);
                    Long lValueOf = Long.valueOf(jKeyAt);
                    long jKeyAt2 = this.f4037zoijcleaow.keyAt(0);
                    u1.nufgyqmvbu.iobyxmoadg(!Long.valueOf(jKeyAt2).equals(lValueOf));
                    if (jKeyAt2 > jKeyAt) {
                        for (int size = this.f4036wkgbmnqykc.size() - 1; size >= 0; size--) {
                            if (this.f4036wkgbmnqykc.keyAt(size) < jKeyAt2) {
                                Iterator it = ((List) this.f4036wkgbmnqykc.valueAt(size)).iterator();
                                while (it.hasNext()) {
                                    ((draadjrbmk) it.next()).zoijcleaow();
                                }
                                this.f4036wkgbmnqykc.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.f4037zoijcleaow.size() - 1; size2 >= 0; size2--) {
                            if (this.f4037zoijcleaow.keyAt(size2) < jKeyAt) {
                                this.f4037zoijcleaow.removeAt(size2);
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private long gxszxtbevo(TotalCaptureResult totalCaptureResult) {
        Long l13 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l13 != null) {
            return l13.longValue();
        }
        return -1L;
    }

    private void iobyxmoadg(LongSparseArray longSparseArray, long j13, Object obj) {
        List arrayList = (List) longSparseArray.get(j13);
        if (arrayList == null) {
            arrayList = new ArrayList();
            longSparseArray.put(j13, arrayList);
        }
        arrayList.add(obj);
    }

    private void nufgyqmvbu() {
        TotalCaptureResult totalCaptureResult;
        draadjrbmk draadjrbmkVar;
        synchronized (this.f4034iobyxmoadg) {
            try {
                int size = this.f4037zoijcleaow.size() - 1;
                while (true) {
                    if (size < 0) {
                        totalCaptureResult = null;
                        draadjrbmkVar = null;
                        break;
                    }
                    List list = (List) this.f4037zoijcleaow.valueAt(size);
                    if (!list.isEmpty()) {
                        totalCaptureResult = (TotalCaptureResult) list.get(0);
                        long jGxszxtbevo = gxszxtbevo(totalCaptureResult);
                        u1.nufgyqmvbu.nufgyqmvbu(jGxszxtbevo == this.f4037zoijcleaow.keyAt(size));
                        List list2 = (List) this.f4036wkgbmnqykc.get(jGxszxtbevo);
                        if (list2 != null && !list2.isEmpty()) {
                            draadjrbmkVar = (draadjrbmk) list2.get(0);
                            btonecajqb(this.f4036wkgbmnqykc, jGxszxtbevo, draadjrbmkVar);
                            list.remove(totalCaptureResult);
                            if (!list.isEmpty()) {
                                break;
                            }
                            this.f4037zoijcleaow.removeAt(size);
                            break;
                        }
                    }
                    size--;
                }
                gtknphoqwx();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (draadjrbmkVar == null || totalCaptureResult == null) {
            return;
        }
        dxjokdxxww(draadjrbmkVar, totalCaptureResult);
    }

    void draadjrbmk(iobyxmoadg iobyxmoadgVar) {
        synchronized (this.f4034iobyxmoadg) {
            this.f4033eablkybsjg = iobyxmoadgVar;
        }
    }

    void eablkybsjg() {
        synchronized (this.f4034iobyxmoadg) {
            this.f4033eablkybsjg = null;
        }
    }

    void lqeggnwhkg(draadjrbmk draadjrbmkVar) {
        synchronized (this.f4034iobyxmoadg) {
            iobyxmoadg(this.f4036wkgbmnqykc, draadjrbmkVar.get().getTimestamp(), draadjrbmkVar);
        }
        nufgyqmvbu();
    }

    void ppxfxbqfkf(TotalCaptureResult totalCaptureResult, int i13) {
        synchronized (this.f4034iobyxmoadg) {
            try {
                long jGxszxtbevo = gxszxtbevo(totalCaptureResult);
                if (jGxszxtbevo == -1) {
                    return;
                }
                iobyxmoadg(this.f4037zoijcleaow, jGxszxtbevo, totalCaptureResult);
                this.f4035ppxfxbqfkf.put(totalCaptureResult, Integer.valueOf(i13));
                nufgyqmvbu();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void wkgbmnqykc() {
        synchronized (this.f4034iobyxmoadg) {
            try {
                this.f4037zoijcleaow.clear();
                for (int i13 = 0; i13 < this.f4036wkgbmnqykc.size(); i13++) {
                    Iterator it = ((List) this.f4036wkgbmnqykc.get(this.f4036wkgbmnqykc.keyAt(i13))).iterator();
                    while (it.hasNext()) {
                        ((draadjrbmk) it.next()).zoijcleaow();
                    }
                }
                this.f4036wkgbmnqykc.clear();
                this.f4035ppxfxbqfkf.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void zoijcleaow(TotalCaptureResult totalCaptureResult) {
        ppxfxbqfkf(totalCaptureResult, 0);
    }
}
