package pe;

import android.os.SystemClock;
import com.google.android.gms.internal.mlkit_vision_text_common.zzep;
import com.google.android.gms.internal.mlkit_vision_text_common.zzeq;
import com.google.android.gms.internal.mlkit_vision_text_common.zzes;
import com.google.android.gms.internal.mlkit_vision_text_common.zznw;
import com.google.android.gms.internal.mlkit_vision_text_common.zzoa;
import com.google.android.gms.internal.mlkit_vision_text_common.zzob;
import com.google.android.gms.internal.mlkit_vision_text_common.zzoh;
import com.google.android.gms.internal.mlkit_vision_text_common.zzot;
import com.google.android.gms.internal.mlkit_vision_text_common.zzou;
import com.google.android.gms.internal.mlkit_vision_text_common.zzov;
import com.google.android.gms.internal.mlkit_vision_text_common.zzow;
import com.google.android.gms.internal.mlkit_vision_text_common.zzrx;
import com.google.android.gms.internal.mlkit_vision_text_common.zzrz;
import com.google.android.gms.internal.mlkit_vision_text_common.zzsa;
import com.google.android.gms.internal.mlkit_vision_text_common.zztr;
import com.google.android.gms.internal.mlkit_vision_text_common.zzub;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuc;
import com.google.android.gms.internal.mlkit_vision_text_common.zzue;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuf;
import com.google.mlkit.common.MlKitException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class wkgbmnqykc extends ge.gxszxtbevo {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    static boolean f76466dxjokdxxww = true;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final zzuc f76468eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final zzue f76469gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final oe.wkgbmnqykc f76470lqeggnwhkg;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ojitshcjhn f76471wkgbmnqykc;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private static final ne.wkgbmnqykc f76465btonecajqb = ne.wkgbmnqykc.zoijcleaow();

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final ge.ojitshcjhn f76467nufgyqmvbu = new ge.ojitshcjhn();

    wkgbmnqykc(zzuc zzucVar, ojitshcjhn ojitshcjhnVar, oe.wkgbmnqykc wkgbmnqykcVar) {
        super((wkgbmnqykcVar.nufgyqmvbu() == 8 || wkgbmnqykcVar.nufgyqmvbu() == 7) ? new ge.ojitshcjhn() : f76467nufgyqmvbu);
        this.f76468eablkybsjg = zzucVar;
        this.f76471wkgbmnqykc = ojitshcjhnVar;
        this.f76469gxszxtbevo = zzue.zza(ge.dxjokdxxww.ppxfxbqfkf().zoijcleaow());
        this.f76470lqeggnwhkg = wkgbmnqykcVar;
    }

    private final void wflxmlrfwp(final zzou zzouVar, long j13, final me.iobyxmoadg iobyxmoadgVar) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - j13;
        this.f76468eablkybsjg.zzf(new zzub() { // from class: pe.kcexrzcfyt
            @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzub
            public final zztr zza() {
                return this.f76451iobyxmoadg.btonecajqb(jElapsedRealtime, zzouVar, iobyxmoadgVar);
            }
        }, zzov.ON_DEVICE_TEXT_DETECT);
        zzeq zzeqVar = new zzeq();
        zzeqVar.zza(zzouVar);
        zzeqVar.zzb(Boolean.valueOf(f76466dxjokdxxww));
        zzsa zzsaVar = new zzsa();
        zzsaVar.zza(iobyxmoadg.iobyxmoadg(this.f76470lqeggnwhkg.nufgyqmvbu()));
        zzeqVar.zzc(zzsaVar.zzc());
        final zzes zzesVarZzd = zzeqVar.zzd();
        final zdlpuopuiu zdlpuopuiuVar = new zdlpuopuiu(this);
        final zzov zzovVar = zzov.AGGREGATED_ON_DEVICE_TEXT_DETECTION;
        Executor executorWkgbmnqykc = ge.lqeggnwhkg.wkgbmnqykc();
        final zzuc zzucVar = this.f76468eablkybsjg;
        executorWkgbmnqykc.execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zzua
            @Override // java.lang.Runnable
            public final void run() {
                zzucVar.zzh(zzovVar, zzesVarZzd, jElapsedRealtime, zdlpuopuiuVar);
            }
        });
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f76469gxszxtbevo.zzc(this.f76470lqeggnwhkg.eablkybsjg(), zzouVar.zza(), jCurrentTimeMillis - jElapsedRealtime, jCurrentTimeMillis);
    }

    final /* synthetic */ zztr btonecajqb(long j13, zzou zzouVar, me.iobyxmoadg iobyxmoadgVar) {
        zzob zzobVar;
        zzrx zzrxVar = new zzrx();
        zzoh zzohVar = new zzoh();
        zzohVar.zzc(Long.valueOf(j13));
        zzohVar.zzd(zzouVar);
        zzohVar.zze(Boolean.valueOf(f76466dxjokdxxww));
        Boolean bool = Boolean.TRUE;
        zzohVar.zza(bool);
        zzohVar.zzb(bool);
        zzrxVar.zzd(zzohVar.zzf());
        ne.wkgbmnqykc wkgbmnqykcVar = f76465btonecajqb;
        int iPpxfxbqfkf = wkgbmnqykcVar.ppxfxbqfkf(iobyxmoadgVar);
        int iWkgbmnqykc = wkgbmnqykcVar.wkgbmnqykc(iobyxmoadgVar);
        zzoa zzoaVar = new zzoa();
        if (iPpxfxbqfkf == -1) {
            zzobVar = zzob.BITMAP;
        } else if (iPpxfxbqfkf == 35) {
            zzobVar = zzob.YUV_420_888;
        } else if (iPpxfxbqfkf == 842094169) {
            zzobVar = zzob.YV12;
        } else if (iPpxfxbqfkf != 16) {
            zzobVar = iPpxfxbqfkf != 17 ? zzob.UNKNOWN_FORMAT : zzob.NV21;
        } else {
            zzobVar = zzob.NV16;
        }
        zzoaVar.zza(zzobVar);
        zzoaVar.zzb(Integer.valueOf(iWkgbmnqykc));
        zzrxVar.zzc(zzoaVar.zzd());
        zzsa zzsaVar = new zzsa();
        zzsaVar.zza(iobyxmoadg.iobyxmoadg(this.f76470lqeggnwhkg.nufgyqmvbu()));
        zzrxVar.zze(zzsaVar.zzc());
        zzrz zzrzVarZzf = zzrxVar.zzf();
        zzow zzowVar = new zzow();
        zzowVar.zze(this.f76470lqeggnwhkg.wkgbmnqykc() ? zzot.TYPE_THICK : zzot.TYPE_THIN);
        zzowVar.zzh(zzrzVarZzf);
        return zzuf.zzf(zzowVar);
    }

    @Override // ge.gxszxtbevo
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public final synchronized oe.iobyxmoadg dxjokdxxww(me.iobyxmoadg iobyxmoadgVar) {
        oe.iobyxmoadg iobyxmoadgVarIobyxmoadg;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            iobyxmoadgVarIobyxmoadg = this.f76471wkgbmnqykc.iobyxmoadg(iobyxmoadgVar);
            wflxmlrfwp(zzou.NO_ERROR, jElapsedRealtime, iobyxmoadgVar);
            f76466dxjokdxxww = false;
        } catch (MlKitException e13) {
            wflxmlrfwp(e13.iobyxmoadg() == 14 ? zzou.MODEL_NOT_DOWNLOADED : zzou.UNKNOWN_ERROR, jElapsedRealtime, iobyxmoadgVar);
            throw e13;
        }
        return iobyxmoadgVarIobyxmoadg;
    }

    final /* synthetic */ zztr gtknphoqwx(zzes zzesVar, int i13, zznw zznwVar) {
        zzow zzowVar = new zzow();
        zzowVar.zze(this.f76470lqeggnwhkg.wkgbmnqykc() ? zzot.TYPE_THICK : zzot.TYPE_THIN);
        zzep zzepVar = new zzep();
        zzepVar.zza(Integer.valueOf(i13));
        zzepVar.zzc(zzesVar);
        zzepVar.zzb(zznwVar);
        zzowVar.zzd(zzepVar.zze());
        return zzuf.zzf(zzowVar);
    }

    @Override // ge.gtknphoqwx
    public final synchronized void wkgbmnqykc() {
        f76466dxjokdxxww = true;
        this.f76471wkgbmnqykc.zzc();
    }

    @Override // ge.gtknphoqwx
    public final synchronized void zoijcleaow() {
        this.f76471wkgbmnqykc.zzb();
    }
}
