package le;

import android.os.SystemClock;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzfq;
import com.google.android.gms.internal.mlkit_vision_barcode.zzfr;
import com.google.android.gms.internal.mlkit_vision_barcode.zzft;
import com.google.android.gms.internal.mlkit_vision_barcode.zzqd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzqh;
import com.google.android.gms.internal.mlkit_vision_barcode.zzqi;
import com.google.android.gms.internal.mlkit_vision_barcode.zzqo;
import com.google.android.gms.internal.mlkit_vision_barcode.zzra;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwe;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwo;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwr;
import com.google.android.gms.internal.mlkit_vision_barcode.zzws;
import com.google.mlkit.common.MlKitException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class draadjrbmk extends ge.gxszxtbevo {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private static final ne.wkgbmnqykc f62153btonecajqb = ne.wkgbmnqykc.zoijcleaow();

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    static boolean f62154gtknphoqwx = true;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private boolean f62155dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final wflxmlrfwp f62156eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final zzwp f62157gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final zzwr f62158lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final ne.iobyxmoadg f62159nufgyqmvbu = new ne.iobyxmoadg();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ie.zoijcleaow f62160wkgbmnqykc;

    public draadjrbmk(ge.dxjokdxxww dxjokdxxwwVar, ie.zoijcleaow zoijcleaowVar, wflxmlrfwp wflxmlrfwpVar, zzwp zzwpVar) {
        Preconditions.checkNotNull(dxjokdxxwwVar, "MlKitContext can not be null");
        Preconditions.checkNotNull(zoijcleaowVar, "BarcodeScannerOptions can not be null");
        this.f62160wkgbmnqykc = zoijcleaowVar;
        this.f62156eablkybsjg = wflxmlrfwpVar;
        this.f62157gxszxtbevo = zzwpVar;
        this.f62158lqeggnwhkg = zzwr.zza(dxjokdxxwwVar.zoijcleaow());
    }

    private final void wflxmlrfwp(final zzrb zzrbVar, long j13, final me.iobyxmoadg iobyxmoadgVar, List list) {
        final zzcp zzcpVar = new zzcp();
        final zzcp zzcpVar2 = new zzcp();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                je.iobyxmoadg iobyxmoadgVar2 = (je.iobyxmoadg) it.next();
                zzcpVar.zzd(zoijcleaow.iobyxmoadg(iobyxmoadgVar2.zoijcleaow()));
                zzcpVar2.zzd(zoijcleaow.zoijcleaow(iobyxmoadgVar2.wkgbmnqykc()));
            }
        }
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - j13;
        this.f62157gxszxtbevo.zzf(new zzwo() { // from class: le.btonecajqb
            @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwo
            public final zzwe zza() {
                return this.f62149iobyxmoadg.btonecajqb(jElapsedRealtime, zzrbVar, zzcpVar, zzcpVar2, iobyxmoadgVar);
            }
        }, zzrc.ON_DEVICE_BARCODE_DETECT);
        zzfr zzfrVar = new zzfr();
        zzfrVar.zze(zzrbVar);
        zzfrVar.zzf(Boolean.valueOf(f62154gtknphoqwx));
        zzfrVar.zzg(zoijcleaow.ppxfxbqfkf(this.f62160wkgbmnqykc));
        zzfrVar.zzc(zzcpVar.zzf());
        zzfrVar.zzd(zzcpVar2.zzf());
        final zzft zzftVarZzh = zzfrVar.zzh();
        final gtknphoqwx gtknphoqwxVar = new gtknphoqwx(this);
        final zzwp zzwpVar = this.f62157gxszxtbevo;
        final zzrc zzrcVar = zzrc.AGGREGATED_ON_DEVICE_BARCODE_DETECTION;
        ge.lqeggnwhkg.wkgbmnqykc().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzwn
            @Override // java.lang.Runnable
            public final void run() {
                zzwpVar.zzh(zzrcVar, zzftVarZzh, jElapsedRealtime, gtknphoqwxVar);
            }
        });
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f62158lqeggnwhkg.zzc(true != this.f62155dxjokdxxww ? 24301 : 24302, zzrbVar.zza(), jCurrentTimeMillis - jElapsedRealtime, jCurrentTimeMillis);
    }

    final /* synthetic */ zzwe btonecajqb(long j13, zzrb zzrbVar, zzcp zzcpVar, zzcp zzcpVar2, me.iobyxmoadg iobyxmoadgVar) {
        zzqi zzqiVar;
        zzrp zzrpVar = new zzrp();
        zzqo zzqoVar = new zzqo();
        zzqoVar.zzc(Long.valueOf(j13));
        zzqoVar.zzd(zzrbVar);
        zzqoVar.zze(Boolean.valueOf(f62154gtknphoqwx));
        Boolean bool = Boolean.TRUE;
        zzqoVar.zza(bool);
        zzqoVar.zzb(bool);
        zzrpVar.zzh(zzqoVar.zzf());
        zzrpVar.zzi(zoijcleaow.ppxfxbqfkf(this.f62160wkgbmnqykc));
        zzrpVar.zze(zzcpVar.zzf());
        zzrpVar.zzf(zzcpVar2.zzf());
        int iEablkybsjg = iobyxmoadgVar.eablkybsjg();
        int iWkgbmnqykc = f62153btonecajqb.wkgbmnqykc(iobyxmoadgVar);
        zzqh zzqhVar = new zzqh();
        if (iEablkybsjg == -1) {
            zzqiVar = zzqi.BITMAP;
        } else if (iEablkybsjg == 35) {
            zzqiVar = zzqi.YUV_420_888;
        } else if (iEablkybsjg == 842094169) {
            zzqiVar = zzqi.YV12;
        } else if (iEablkybsjg != 16) {
            zzqiVar = iEablkybsjg != 17 ? zzqi.UNKNOWN_FORMAT : zzqi.NV21;
        } else {
            zzqiVar = zzqi.NV16;
        }
        zzqhVar.zza(zzqiVar);
        zzqhVar.zzb(Integer.valueOf(iWkgbmnqykc));
        zzrpVar.zzg(zzqhVar.zzd());
        zzrd zzrdVar = new zzrd();
        zzrdVar.zze(this.f62155dxjokdxxww ? zzra.TYPE_THICK : zzra.TYPE_THIN);
        zzrdVar.zzg(zzrpVar.zzj());
        return zzws.zzf(zzrdVar);
    }

    @Override // ge.gxszxtbevo
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public final synchronized List dxjokdxxww(me.iobyxmoadg iobyxmoadgVar) {
        List listIobyxmoadg;
        ne.iobyxmoadg iobyxmoadgVar2 = this.f62159nufgyqmvbu;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        iobyxmoadgVar2.iobyxmoadg(iobyxmoadgVar);
        try {
            listIobyxmoadg = this.f62156eablkybsjg.iobyxmoadg(iobyxmoadgVar);
            wflxmlrfwp(zzrb.NO_ERROR, jElapsedRealtime, iobyxmoadgVar, listIobyxmoadg);
            f62154gtknphoqwx = false;
        } catch (MlKitException e13) {
            wflxmlrfwp(e13.iobyxmoadg() == 14 ? zzrb.MODEL_NOT_DOWNLOADED : zzrb.UNKNOWN_ERROR, jElapsedRealtime, iobyxmoadgVar, null);
            throw e13;
        }
        return listIobyxmoadg;
    }

    final /* synthetic */ zzwe gtknphoqwx(zzft zzftVar, int i13, zzqd zzqdVar) {
        zzrd zzrdVar = new zzrd();
        zzrdVar.zze(this.f62155dxjokdxxww ? zzra.TYPE_THICK : zzra.TYPE_THIN);
        zzfq zzfqVar = new zzfq();
        zzfqVar.zza(Integer.valueOf(i13));
        zzfqVar.zzc(zzftVar);
        zzfqVar.zzb(zzqdVar);
        zzrdVar.zzd(zzfqVar.zze());
        return zzws.zzf(zzrdVar);
    }

    @Override // ge.gtknphoqwx
    public final synchronized void wkgbmnqykc() {
        try {
            this.f62156eablkybsjg.zzb();
            f62154gtknphoqwx = true;
            zzrd zzrdVar = new zzrd();
            zzra zzraVar = this.f62155dxjokdxxww ? zzra.TYPE_THICK : zzra.TYPE_THIN;
            zzwp zzwpVar = this.f62157gxszxtbevo;
            zzrdVar.zze(zzraVar);
            zzrp zzrpVar = new zzrp();
            zzrpVar.zzi(zoijcleaow.ppxfxbqfkf(this.f62160wkgbmnqykc));
            zzrdVar.zzg(zzrpVar.zzj());
            zzwpVar.zzd(zzws.zzf(zzrdVar), zzrc.ON_DEVICE_BARCODE_CLOSE);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // ge.gtknphoqwx
    public final synchronized void zoijcleaow() {
        this.f62155dxjokdxxww = this.f62156eablkybsjg.zzc();
    }
}
