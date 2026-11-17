package oe;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbu;
import com.google.android.gms.internal.mlkit_vision_text_common.zzu;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuz;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvb;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvd;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvf;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvj;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f72694iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f72695zoijcleaow;

    public static class ppxfxbqfkf extends wkgbmnqykc {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final float f72700eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final float f72701gxszxtbevo;

        ppxfxbqfkf(zzvj zzvjVar, Matrix matrix) {
            super(zzvjVar.zzd(), zzvjVar.zzc(), zzvjVar.zze(), "", matrix);
            this.f72700eablkybsjg = zzvjVar.zzb();
            this.f72701gxszxtbevo = zzvjVar.zza();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static class wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f72702iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final Point[] f72703ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final String f72704wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Rect f72705zoijcleaow;

        wkgbmnqykc(String str, Rect rect, List list, String str2, Matrix matrix) {
            this.f72702iobyxmoadg = str;
            Rect rect2 = new Rect(rect);
            if (matrix != null) {
                ne.zoijcleaow.ppxfxbqfkf(rect2, matrix);
            }
            this.f72705zoijcleaow = rect2;
            Point[] pointArr = new Point[list.size()];
            for (int i13 = 0; i13 < list.size(); i13++) {
                pointArr[i13] = new Point((Point) list.get(i13));
            }
            if (matrix != null) {
                ne.zoijcleaow.zoijcleaow(pointArr, matrix);
            }
            this.f72703ppxfxbqfkf = pointArr;
            this.f72704wkgbmnqykc = str2;
        }

        public String iobyxmoadg() {
            return this.f72704wkgbmnqykc;
        }

        protected final String zoijcleaow() {
            String str = this.f72702iobyxmoadg;
            return str == null ? "" : str;
        }
    }

    public iobyxmoadg(zzvf zzvfVar, final Matrix matrix) {
        ArrayList arrayList = new ArrayList();
        this.f72694iobyxmoadg = arrayList;
        this.f72695zoijcleaow = zzvfVar.zza();
        arrayList.addAll(zzbu.zza(zzvfVar.zzb(), new zzu() { // from class: oe.eablkybsjg
            @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
            public final Object zza(Object obj) {
                return new iobyxmoadg.eablkybsjg((zzuz) obj, matrix);
            }
        }));
    }

    public List iobyxmoadg() {
        return Collections.unmodifiableList(this.f72694iobyxmoadg);
    }

    public iobyxmoadg(String str, List list) {
        ArrayList arrayList = new ArrayList();
        this.f72694iobyxmoadg = arrayList;
        arrayList.addAll(list);
        this.f72695zoijcleaow = str;
    }

    public static class eablkybsjg extends wkgbmnqykc {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final List f72696eablkybsjg;

        eablkybsjg(zzuz zzuzVar, final Matrix matrix) {
            super(zzuzVar.zzc(), zzuzVar.zza(), zzuzVar.zzd(), zzuzVar.zzb(), matrix);
            this.f72696eablkybsjg = zzbu.zza(zzuzVar.zze(), new zzu() { // from class: oe.nufgyqmvbu
                @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
                public final Object zza(Object obj) {
                    zzvd zzvdVar = (zzvd) obj;
                    return new iobyxmoadg.zoijcleaow(zzvdVar, matrix, zzvdVar.zzb(), zzvdVar.zza());
                }
            });
        }

        public String ppxfxbqfkf() {
            return zoijcleaow();
        }

        public eablkybsjg(String str, Rect rect, List list, String str2, Matrix matrix, List list2) {
            super(str, rect, list, str2, matrix);
            this.f72696eablkybsjg = list2;
        }
    }

    public static class zoijcleaow extends wkgbmnqykc {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final List f72706eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final float f72707gxszxtbevo;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private final float f72708lqeggnwhkg;

        zoijcleaow(zzvd zzvdVar, final Matrix matrix, float f13, float f14) {
            super(zzvdVar.zze(), zzvdVar.zzc(), zzvdVar.zzf(), zzvdVar.zzd(), matrix);
            this.f72706eablkybsjg = zzbu.zza(zzvdVar.zzg(), new zzu() { // from class: oe.lqeggnwhkg
                @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
                public final Object zza(Object obj) {
                    return new iobyxmoadg.C1577iobyxmoadg((zzvb) obj, matrix);
                }
            });
            this.f72707gxszxtbevo = f13;
            this.f72708lqeggnwhkg = f14;
        }

        public String ppxfxbqfkf() {
            return zoijcleaow();
        }

        public zoijcleaow(String str, Rect rect, List list, String str2, Matrix matrix, List list2, float f13, float f14) {
            super(str, rect, list, str2, matrix);
            this.f72706eablkybsjg = list2;
            this.f72707gxszxtbevo = f13;
            this.f72708lqeggnwhkg = f14;
        }
    }

    /* JADX INFO: renamed from: oe.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static class C1577iobyxmoadg extends wkgbmnqykc {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final List f72697eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private final float f72698gxszxtbevo;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private final float f72699lqeggnwhkg;

        C1577iobyxmoadg(zzvb zzvbVar, final Matrix matrix) {
            super(zzvbVar.zze(), zzvbVar.zzc(), zzvbVar.zzf(), zzvbVar.zzd(), matrix);
            this.f72698gxszxtbevo = zzvbVar.zzb();
            this.f72699lqeggnwhkg = zzvbVar.zza();
            List listZzg = zzvbVar.zzg();
            this.f72697eablkybsjg = zzbu.zza(listZzg == null ? new ArrayList() : listZzg, new zzu() { // from class: oe.gxszxtbevo
                @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
                public final Object zza(Object obj) {
                    return new iobyxmoadg.ppxfxbqfkf((zzvj) obj, matrix);
                }
            });
        }

        public C1577iobyxmoadg(String str, Rect rect, List list, String str2, Matrix matrix, float f13, float f14, List list2) {
            super(str, rect, list, str2, matrix);
            this.f72698gxszxtbevo = f13;
            this.f72699lqeggnwhkg = f14;
            this.f72697eablkybsjg = list2;
        }
    }
}
