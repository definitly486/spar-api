package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.protobuf.DescriptorProtos;
import g3.h0;
import io.appmetrica.analytics.impl.C4007z9;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
final class rlfsiqarku implements Handler.Callback, androidx.media3.exoplayer.source.vdvldrhtss.iobyxmoadg, o3.cdpycssgdh.iobyxmoadg, dvvnrvtcbc.wkgbmnqykc, gtknphoqwx.iobyxmoadg, igdgnonuha.iobyxmoadg, androidx.media3.exoplayer.lqeggnwhkg.iobyxmoadg {

    /* JADX INFO: renamed from: roivzttewh, reason: collision with root package name */
    private static final long f10947roivzttewh = y2.stevsuqkhv.t(DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM);

    /* JADX INFO: renamed from: bfopjjpdmp, reason: collision with root package name */
    private ExoPlaybackException f10948bfopjjpdmp;

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final v2.cdpycssgdh.ppxfxbqfkf f10949cdpycssgdh;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private final f3.wwaezpbzkn f10950cllcsxoeiz;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final o3.yadqdtsiqt f10951cqumvgiudr;

    /* JADX INFO: renamed from: crxdokpmqz, reason: collision with root package name */
    private eablkybsjg f10952crxdokpmqz;

    /* JADX INFO: renamed from: czzsidtyhn, reason: collision with root package name */
    private boolean f10953czzsidtyhn;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private final long f10954dsvhmnatus;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final czzsidtyhn f10955esjtqupxsv;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private final gxszxtbevo f10956hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private final dvvnrvtcbc f10957hkdspvbjdz;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private final long f10959iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final Looper f10960istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final o3.cdpycssgdh f10961iwizpuwonk;

    /* JADX INFO: renamed from: jhduphickx, reason: collision with root package name */
    private boolean f10963jhduphickx;

    /* JADX INFO: renamed from: jlmebxxoox, reason: collision with root package name */
    private boolean f10964jlmebxxoox;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private final zfvoamnweg f10965jpowsppfya;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final boolean[] f10966jyumaefscl;

    /* JADX INFO: renamed from: jztzpxfvev, reason: collision with root package name */
    private int f10967jztzpxfvev;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    private final g3.iobyxmoadg f10968kegysxyocb;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final p3.wkgbmnqykc f10969lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private final boolean f10970lmojexxdyd;

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    private final boolean f10972mbcevpiqjq;

    /* JADX INFO: renamed from: metgxyhuhe, reason: collision with root package name */
    private boolean f10973metgxyhuhe;

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
    private final androidx.media3.exoplayer.lqeggnwhkg f10974ntlheqmsrt;

    /* JADX INFO: renamed from: nuxfzjnpeb, reason: collision with root package name */
    private boolean f10975nuxfzjnpeb;

    /* JADX INFO: renamed from: oipsdeybqn, reason: collision with root package name */
    private boolean f10976oipsdeybqn;

    /* JADX INFO: renamed from: okpsazkaxt, reason: collision with root package name */
    private boolean f10977okpsazkaxt;

    /* JADX INFO: renamed from: opjhrmiecq, reason: collision with root package name */
    private long f10978opjhrmiecq;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private final y2.dxjokdxxww f10979pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final y2.ojitshcjhn f10980pmvmpeiblj;

    /* JADX INFO: renamed from: ribwqtqdhb, reason: collision with root package name */
    private boolean f10981ribwqtqdhb;

    /* JADX INFO: renamed from: rlfsiqarku, reason: collision with root package name */
    private boolean f10982rlfsiqarku;

    /* JADX INFO: renamed from: sflfametgt, reason: collision with root package name */
    private long f10983sflfametgt;

    /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name */
    private skhdrjzrfn f10984sopmlzcsov;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    private final boolean f10985stevsuqkhv;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    private final y2.ojitshcjhn f10987tzroggbefp;

    /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name */
    private f3.hkdspvbjdz f10988ulzqkzuiru;

    /* JADX INFO: renamed from: uwvvkdfqfp, reason: collision with root package name */
    private int f10989uwvvkdfqfp;

    /* JADX INFO: renamed from: vipkmwdibw, reason: collision with root package name */
    private boolean f10990vipkmwdibw;

    /* JADX INFO: renamed from: weqkydbzbr, reason: collision with root package name */
    private ExoPlayer.ppxfxbqfkf f10991weqkydbzbr;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private final gtknphoqwx f10992wwaezpbzkn;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private final h0 f10993wypolnanlu;

    /* JADX INFO: renamed from: xrmfcynszj, reason: collision with root package name */
    private boolean f10994xrmfcynszj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private final v2.cdpycssgdh.zoijcleaow f10995yadqdtsiqt;

    /* JADX INFO: renamed from: ydmasvzmpa, reason: collision with root package name */
    private long f10996ydmasvzmpa;

    /* JADX INFO: renamed from: yfnezrywwk, reason: collision with root package name */
    private nufgyqmvbu f10997yfnezrywwk;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final hszhottldk[] f10998yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private final ArrayList f10999ylkuphrtab;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final fiwbwshyhd[] f11000zdlpuopuiu;

    /* JADX INFO: renamed from: zfvoamnweg, reason: collision with root package name */
    private int f11002zfvoamnweg;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final f3.pkzmftpjix f11003zynmafqrjb;

    /* JADX INFO: renamed from: zeieaojujs, reason: collision with root package name */
    private long f11001zeieaojujs = -9223372036854775807L;

    /* JADX INFO: renamed from: tbqsvytpvh, reason: collision with root package name */
    private float f10986tbqsvytpvh = 1.0f;

    /* JADX INFO: renamed from: iyctptxqzt, reason: collision with root package name */
    private long f10962iyctptxqzt = -9223372036854775807L;

    /* JADX INFO: renamed from: ikoacuggdj, reason: collision with root package name */
    private long f10958ikoacuggdj = -9223372036854775807L;

    /* JADX INFO: renamed from: lrnfpwlwnk, reason: collision with root package name */
    private v2.cdpycssgdh f10971lrnfpwlwnk = v2.cdpycssgdh.f115259iobyxmoadg;

    public static final class eablkybsjg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public int f11004eablkybsjg;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private boolean f11005iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public int f11006ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public boolean f11007wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public skhdrjzrfn f11008zoijcleaow;

        public eablkybsjg(skhdrjzrfn skhdrjzrfnVar) {
            this.f11008zoijcleaow = skhdrjzrfnVar;
        }

        public void ppxfxbqfkf(skhdrjzrfn skhdrjzrfnVar) {
            this.f11005iobyxmoadg |= this.f11008zoijcleaow != skhdrjzrfnVar;
            this.f11008zoijcleaow = skhdrjzrfnVar;
        }

        public void wkgbmnqykc(int i13) {
            if (this.f11007wkgbmnqykc && this.f11004eablkybsjg != 5) {
                y2.iobyxmoadg.iobyxmoadg(i13 == 5);
                return;
            }
            this.f11005iobyxmoadg = true;
            this.f11007wkgbmnqykc = true;
            this.f11004eablkybsjg = i13;
        }

        public void zoijcleaow(int i13) {
            this.f11005iobyxmoadg |= i13 > 0;
            this.f11006ppxfxbqfkf += i13;
        }
    }

    public interface gxszxtbevo {
        void iobyxmoadg(eablkybsjg eablkybsjgVar);
    }

    class iobyxmoadg implements wizcaqwiak.iobyxmoadg {
        iobyxmoadg() {
        }

        @Override // androidx.media3.exoplayer.wizcaqwiak.iobyxmoadg
        public void iobyxmoadg() {
            rlfsiqarku.this.f10982rlfsiqarku = true;
        }

        @Override // androidx.media3.exoplayer.wizcaqwiak.iobyxmoadg
        public void zoijcleaow() {
            if (rlfsiqarku.this.f10985stevsuqkhv || rlfsiqarku.this.f10953czzsidtyhn) {
                rlfsiqarku.this.f10980pmvmpeiblj.nufgyqmvbu(2);
            }
        }
    }

    private static final class lqeggnwhkg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        public final boolean f11010eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        public final boolean f11011gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow f11012iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final long f11013ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public final boolean f11014wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final long f11015zoijcleaow;

        public lqeggnwhkg(androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar, long j13, long j14, boolean z13, boolean z14, boolean z15) {
            this.f11012iobyxmoadg = zoijcleaowVar;
            this.f11015zoijcleaow = j13;
            this.f11013ppxfxbqfkf = j14;
            this.f11014wkgbmnqykc = z13;
            this.f11010eablkybsjg = z14;
            this.f11011gxszxtbevo = z15;
        }
    }

    private static final class nufgyqmvbu {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final v2.cdpycssgdh f11016iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final long f11017ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final int f11018zoijcleaow;

        public nufgyqmvbu(v2.cdpycssgdh cdpycssgdhVar, int i13, long j13) {
            this.f11016iobyxmoadg = cdpycssgdhVar;
            this.f11018zoijcleaow = i13;
            this.f11017ppxfxbqfkf = j13;
        }
    }

    private static class ppxfxbqfkf {
    }

    private static final class wkgbmnqykc implements Comparable {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        public Object f11019iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        public long f11020jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        public int f11021yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public final igdgnonuha f11022zdlpuopuiu;

        public wkgbmnqykc(igdgnonuha igdgnonuhaVar) {
            this.f11022zdlpuopuiu = igdgnonuhaVar;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public int compareTo(wkgbmnqykc wkgbmnqykcVar) {
            Object obj = this.f11019iwizpuwonk;
            if ((obj == null) != (wkgbmnqykcVar.f11019iwizpuwonk == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i13 = this.f11021yggfygwlhe - wkgbmnqykcVar.f11021yggfygwlhe;
            return i13 != 0 ? i13 : y2.stevsuqkhv.wflxmlrfwp(this.f11020jyumaefscl, wkgbmnqykcVar.f11020jyumaefscl);
        }

        public void zoijcleaow(int i13, long j13, Object obj) {
            this.f11021yggfygwlhe = i13;
            this.f11020jyumaefscl = j13;
            this.f11019iwizpuwonk = obj;
        }
    }

    private static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f11023iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final int f11024ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final long f11025wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final m3.kcexrzcfyt f11026zoijcleaow;

        /* synthetic */ zoijcleaow(List list, m3.kcexrzcfyt kcexrzcfytVar, int i13, long j13, iobyxmoadg iobyxmoadgVar) {
            this(list, kcexrzcfytVar, i13, j13);
        }

        private zoijcleaow(List list, m3.kcexrzcfyt kcexrzcfytVar, int i13, long j13) {
            this.f11023iobyxmoadg = list;
            this.f11026zoijcleaow = kcexrzcfytVar;
            this.f11024ppxfxbqfkf = i13;
            this.f11025wkgbmnqykc = j13;
        }
    }

    public rlfsiqarku(Context context, wizcaqwiak[] wizcaqwiakVarArr, wizcaqwiak[] wizcaqwiakVarArr2, o3.cdpycssgdh cdpycssgdhVar, o3.yadqdtsiqt yadqdtsiqtVar, czzsidtyhn czzsidtyhnVar, p3.wkgbmnqykc wkgbmnqykcVar, int i13, boolean z13, g3.iobyxmoadg iobyxmoadgVar, f3.hkdspvbjdz hkdspvbjdzVar, f3.wwaezpbzkn wwaezpbzknVar, long j13, boolean z14, boolean z15, Looper looper, y2.dxjokdxxww dxjokdxxwwVar, gxszxtbevo gxszxtbevoVar, h0 h0Var, f3.pkzmftpjix pkzmftpjixVar, ExoPlayer.ppxfxbqfkf ppxfxbqfkfVar) {
        this.f10956hcddaimhww = gxszxtbevoVar;
        this.f10961iwizpuwonk = cdpycssgdhVar;
        this.f10951cqumvgiudr = yadqdtsiqtVar;
        this.f10955esjtqupxsv = czzsidtyhnVar;
        this.f10969lereixgezr = wkgbmnqykcVar;
        this.f10967jztzpxfvev = i13;
        this.f10994xrmfcynszj = z13;
        this.f10988ulzqkzuiru = hkdspvbjdzVar;
        this.f10950cllcsxoeiz = wwaezpbzknVar;
        this.f10954dsvhmnatus = j13;
        this.f10978opjhrmiecq = j13;
        this.f10981ribwqtqdhb = z14;
        this.f10985stevsuqkhv = z15;
        this.f10979pkzmftpjix = dxjokdxxwwVar;
        this.f10993wypolnanlu = h0Var;
        this.f10991weqkydbzbr = ppxfxbqfkfVar;
        this.f10968kegysxyocb = iobyxmoadgVar;
        this.f10959iozdgvuglv = czzsidtyhnVar.wkgbmnqykc(h0Var);
        this.f10970lmojexxdyd = czzsidtyhnVar.zoijcleaow(h0Var);
        skhdrjzrfn skhdrjzrfnVarGtknphoqwx = skhdrjzrfn.gtknphoqwx(yadqdtsiqtVar);
        this.f10984sopmlzcsov = skhdrjzrfnVarGtknphoqwx;
        this.f10952crxdokpmqz = new eablkybsjg(skhdrjzrfnVarGtknphoqwx);
        this.f10998yggfygwlhe = new hszhottldk[wizcaqwiakVarArr.length];
        this.f10966jyumaefscl = new boolean[wizcaqwiakVarArr.length];
        hszhottldk.iobyxmoadg iobyxmoadgVarWkgbmnqykc = cdpycssgdhVar.wkgbmnqykc();
        this.f11000zdlpuopuiu = new fiwbwshyhd[wizcaqwiakVarArr.length];
        boolean z16 = false;
        for (int i14 = 0; i14 < wizcaqwiakVarArr.length; i14++) {
            wizcaqwiakVarArr[i14].wwaezpbzkn(i14, h0Var, dxjokdxxwwVar);
            this.f10998yggfygwlhe[i14] = wizcaqwiakVarArr[i14].ylkuphrtab();
            if (iobyxmoadgVarWkgbmnqykc != null) {
                this.f10998yggfygwlhe[i14].pkzmftpjix(iobyxmoadgVarWkgbmnqykc);
            }
            wizcaqwiak wizcaqwiakVar = wizcaqwiakVarArr2[i14];
            if (wizcaqwiakVar != null) {
                wizcaqwiakVar.wwaezpbzkn(wizcaqwiakVarArr.length + i14, h0Var, dxjokdxxwwVar);
                z16 = true;
            }
            this.f11000zdlpuopuiu[i14] = new fiwbwshyhd(wizcaqwiakVarArr[i14], wizcaqwiakVarArr2[i14], i14);
        }
        this.f10972mbcevpiqjq = z16;
        this.f10992wwaezpbzkn = new gtknphoqwx(this, dxjokdxxwwVar);
        this.f10999ylkuphrtab = new ArrayList();
        this.f10949cdpycssgdh = new v2.cdpycssgdh.ppxfxbqfkf();
        this.f10995yadqdtsiqt = new v2.cdpycssgdh.zoijcleaow();
        cdpycssgdhVar.eablkybsjg(this, wkgbmnqykcVar);
        this.f10976oipsdeybqn = true;
        y2.ojitshcjhn ojitshcjhnVarIobyxmoadg = dxjokdxxwwVar.iobyxmoadg(looper, null);
        this.f10987tzroggbefp = ojitshcjhnVarIobyxmoadg;
        this.f10965jpowsppfya = new zfvoamnweg(iobyxmoadgVar, ojitshcjhnVarIobyxmoadg, new yfnezrywwk.iobyxmoadg() { // from class: androidx.media3.exoplayer.xrmfcynszj
            @Override // androidx.media3.exoplayer.yfnezrywwk.iobyxmoadg
            public final yfnezrywwk iobyxmoadg(ydmasvzmpa ydmasvzmpaVar, long j14) {
                return this.f11623iobyxmoadg.jyumaefscl(ydmasvzmpaVar, j14);
            }
        }, ppxfxbqfkfVar);
        this.f10957hkdspvbjdz = new dvvnrvtcbc(this, iobyxmoadgVar, ojitshcjhnVarIobyxmoadg, h0Var);
        f3.pkzmftpjix pkzmftpjixVar2 = pkzmftpjixVar == null ? new f3.pkzmftpjix() : pkzmftpjixVar;
        this.f11003zynmafqrjb = pkzmftpjixVar2;
        Looper looperIobyxmoadg = pkzmftpjixVar2.iobyxmoadg();
        this.f10960istkbnxepw = looperIobyxmoadg;
        this.f10980pmvmpeiblj = dxjokdxxwwVar.iobyxmoadg(looperIobyxmoadg, this);
        this.f10974ntlheqmsrt = new androidx.media3.exoplayer.lqeggnwhkg(context, looperIobyxmoadg, this);
    }

    private void A(int i13) {
        skhdrjzrfn skhdrjzrfnVar = this.f10984sopmlzcsov;
        if (skhdrjzrfnVar.f11038eablkybsjg != i13) {
            if (i13 != 2) {
                this.f10962iyctptxqzt = -9223372036854775807L;
            }
            this.f10984sopmlzcsov = skhdrjzrfnVar.nufgyqmvbu(i13);
        }
    }

    private void C(Object obj, AtomicBoolean atomicBoolean) {
        for (fiwbwshyhd fiwbwshyhdVar : this.f11000zdlpuopuiu) {
            fiwbwshyhdVar.tzroggbefp(obj);
        }
        int i13 = this.f10984sopmlzcsov.f11038eablkybsjg;
        if (i13 == 3 || i13 == 2) {
            this.f10980pmvmpeiblj.nufgyqmvbu(2);
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    private void D(float f13) {
        this.f10986tbqsvytpvh = f13;
        float fGxszxtbevo = f13 * this.f10974ntlheqmsrt.gxszxtbevo();
        for (fiwbwshyhd fiwbwshyhdVar : this.f11000zdlpuopuiu) {
            fiwbwshyhdVar.mbcevpiqjq(fGxszxtbevo);
        }
    }

    private boolean E() {
        yfnezrywwk yfnezrywwkVarYggfygwlhe;
        yfnezrywwk yfnezrywwkVarGtknphoqwx;
        return G() && !this.f10990vipkmwdibw && (yfnezrywwkVarYggfygwlhe = this.f10965jpowsppfya.yggfygwlhe()) != null && (yfnezrywwkVarGtknphoqwx = yfnezrywwkVarYggfygwlhe.gtknphoqwx()) != null && this.f10996ydmasvzmpa >= yfnezrywwkVarGtknphoqwx.agtfadlqog() && yfnezrywwkVarGtknphoqwx.f11638dxjokdxxww;
    }

    private boolean F() {
        if (!vipkmwdibw(this.f10965jpowsppfya.agtfadlqog())) {
            return false;
        }
        yfnezrywwk yfnezrywwkVarAgtfadlqog = this.f10965jpowsppfya.agtfadlqog();
        long jHkdspvbjdz = hkdspvbjdz(yfnezrywwkVarAgtfadlqog.draadjrbmk());
        czzsidtyhn.iobyxmoadg iobyxmoadgVar = new czzsidtyhn.iobyxmoadg(this.f10993wypolnanlu, this.f10984sopmlzcsov.f11041iobyxmoadg, yfnezrywwkVarAgtfadlqog.f11644nufgyqmvbu.f11629iobyxmoadg, yfnezrywwkVarAgtfadlqog == this.f10965jpowsppfya.yggfygwlhe() ? yfnezrywwkVarAgtfadlqog.istkbnxepw(this.f10996ydmasvzmpa) : yfnezrywwkVarAgtfadlqog.istkbnxepw(this.f10996ydmasvzmpa) - yfnezrywwkVarAgtfadlqog.f11644nufgyqmvbu.f11634zoijcleaow, jHkdspvbjdz, this.f10992wwaezpbzkn.lqeggnwhkg().f115310iobyxmoadg, this.f10984sopmlzcsov.f11036draadjrbmk, this.f10963jhduphickx, I(this.f10984sopmlzcsov.f11041iobyxmoadg, yfnezrywwkVarAgtfadlqog.f11644nufgyqmvbu.f11629iobyxmoadg) ? this.f10950cllcsxoeiz.ppxfxbqfkf() : -9223372036854775807L, this.f10958ikoacuggdj);
        boolean zNufgyqmvbu = this.f10955esjtqupxsv.nufgyqmvbu(iobyxmoadgVar);
        yfnezrywwk yfnezrywwkVarYggfygwlhe = this.f10965jpowsppfya.yggfygwlhe();
        if (zNufgyqmvbu || !yfnezrywwkVarYggfygwlhe.f11641gxszxtbevo || jHkdspvbjdz >= 500000) {
            return zNufgyqmvbu;
        }
        if (this.f10959iozdgvuglv <= 0 && !this.f10970lmojexxdyd) {
            return zNufgyqmvbu;
        }
        yfnezrywwkVarYggfygwlhe.f11642iobyxmoadg.zdlpuopuiu(this.f10984sopmlzcsov.f11042kcexrzcfyt, false);
        return this.f10955esjtqupxsv.nufgyqmvbu(iobyxmoadgVar);
    }

    private boolean G() {
        skhdrjzrfn skhdrjzrfnVar = this.f10984sopmlzcsov;
        return skhdrjzrfnVar.f11036draadjrbmk && skhdrjzrfnVar.f11034agtfadlqog == 0;
    }

    private boolean H(boolean z13) {
        if (this.f10989uwvvkdfqfp == 0) {
            return jhduphickx();
        }
        boolean z14 = false;
        if (!z13) {
            return false;
        }
        if (!this.f10984sopmlzcsov.f11043lqeggnwhkg) {
            return true;
        }
        yfnezrywwk yfnezrywwkVarYggfygwlhe = this.f10965jpowsppfya.yggfygwlhe();
        long jPpxfxbqfkf = I(this.f10984sopmlzcsov.f11041iobyxmoadg, yfnezrywwkVarYggfygwlhe.f11644nufgyqmvbu.f11629iobyxmoadg) ? this.f10950cllcsxoeiz.ppxfxbqfkf() : -9223372036854775807L;
        yfnezrywwk yfnezrywwkVarAgtfadlqog = this.f10965jpowsppfya.agtfadlqog();
        boolean z15 = yfnezrywwkVarAgtfadlqog.kcexrzcfyt() && yfnezrywwkVarAgtfadlqog.f11644nufgyqmvbu.f11625btonecajqb;
        if (yfnezrywwkVarAgtfadlqog.f11644nufgyqmvbu.f11629iobyxmoadg.zoijcleaow() && !yfnezrywwkVarAgtfadlqog.f11641gxszxtbevo) {
            z14 = true;
        }
        if (z15 || z14) {
            return true;
        }
        return this.f10955esjtqupxsv.iobyxmoadg(new czzsidtyhn.iobyxmoadg(this.f10993wypolnanlu, this.f10984sopmlzcsov.f11041iobyxmoadg, yfnezrywwkVarYggfygwlhe.f11644nufgyqmvbu.f11629iobyxmoadg, yfnezrywwkVarYggfygwlhe.istkbnxepw(this.f10996ydmasvzmpa), hkdspvbjdz(yfnezrywwkVarAgtfadlqog.btonecajqb()), this.f10992wwaezpbzkn.lqeggnwhkg().f115310iobyxmoadg, this.f10984sopmlzcsov.f11036draadjrbmk, this.f10963jhduphickx, jPpxfxbqfkf, this.f10958ikoacuggdj));
    }

    private boolean I(v2.cdpycssgdh cdpycssgdhVar, androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar) {
        if (zoijcleaowVar.zoijcleaow() || cdpycssgdhVar.vdvldrhtss()) {
            return false;
        }
        cdpycssgdhVar.agtfadlqog(cdpycssgdhVar.nufgyqmvbu(zoijcleaowVar.f11262iobyxmoadg, this.f10995yadqdtsiqt).f115304ppxfxbqfkf, this.f10949cdpycssgdh);
        if (!this.f10949cdpycssgdh.gxszxtbevo()) {
            return false;
        }
        v2.cdpycssgdh.ppxfxbqfkf ppxfxbqfkfVar = this.f10949cdpycssgdh;
        return ppxfxbqfkfVar.f115282dxjokdxxww && ppxfxbqfkfVar.f115285gxszxtbevo != -9223372036854775807L;
    }

    private void J() {
        yfnezrywwk yfnezrywwkVarYggfygwlhe = this.f10965jpowsppfya.yggfygwlhe();
        if (yfnezrywwkVarYggfygwlhe == null) {
            return;
        }
        o3.yadqdtsiqt yadqdtsiqtVarRgvfuqvkyq = yfnezrywwkVarYggfygwlhe.rgvfuqvkyq();
        for (int i13 = 0; i13 < this.f11000zdlpuopuiu.length; i13++) {
            if (yadqdtsiqtVarRgvfuqvkyq.ppxfxbqfkf(i13)) {
                this.f11000zdlpuopuiu[i13].ntlheqmsrt();
            }
        }
    }

    private void L(boolean z13, boolean z14) {
        fyldjkxazc(z13 || !this.f10973metgxyhuhe, false, true, false);
        this.f10952crxdokpmqz.zoijcleaow(z14 ? 1 : 0);
        this.f10955esjtqupxsv.btonecajqb(this.f10993wypolnanlu);
        this.f10974ntlheqmsrt.ojitshcjhn(this.f10984sopmlzcsov.f11036draadjrbmk, 1);
        A(1);
    }

    private void M() {
        this.f10992wwaezpbzkn.nufgyqmvbu();
        for (fiwbwshyhd fiwbwshyhdVar : this.f11000zdlpuopuiu) {
            fiwbwshyhdVar.sopmlzcsov();
        }
    }

    private void N() {
        yfnezrywwk yfnezrywwkVarAgtfadlqog = this.f10965jpowsppfya.agtfadlqog();
        boolean z13 = this.f10977okpsazkaxt || (yfnezrywwkVarAgtfadlqog != null && yfnezrywwkVarAgtfadlqog.f11642iobyxmoadg.ppxfxbqfkf());
        skhdrjzrfn skhdrjzrfnVar = this.f10984sopmlzcsov;
        if (z13 != skhdrjzrfnVar.f11043lqeggnwhkg) {
            this.f10984sopmlzcsov = skhdrjzrfnVar.zoijcleaow(z13);
        }
    }

    private void O(androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar, m3.iwizpuwonk iwizpuwonkVar, o3.yadqdtsiqt yadqdtsiqtVar) {
        yfnezrywwk yfnezrywwkVar = (yfnezrywwk) y2.iobyxmoadg.eablkybsjg(this.f10965jpowsppfya.agtfadlqog());
        this.f10955esjtqupxsv.dxjokdxxww(new czzsidtyhn.iobyxmoadg(this.f10993wypolnanlu, this.f10984sopmlzcsov.f11041iobyxmoadg, zoijcleaowVar, yfnezrywwkVar == this.f10965jpowsppfya.yggfygwlhe() ? yfnezrywwkVar.istkbnxepw(this.f10996ydmasvzmpa) : yfnezrywwkVar.istkbnxepw(this.f10996ydmasvzmpa) - yfnezrywwkVar.f11644nufgyqmvbu.f11634zoijcleaow, hkdspvbjdz(yfnezrywwkVar.btonecajqb()), this.f10992wwaezpbzkn.lqeggnwhkg().f115310iobyxmoadg, this.f10984sopmlzcsov.f11036draadjrbmk, this.f10963jhduphickx, I(this.f10984sopmlzcsov.f11041iobyxmoadg, yfnezrywwkVar.f11644nufgyqmvbu.f11629iobyxmoadg) ? this.f10950cllcsxoeiz.ppxfxbqfkf() : -9223372036854775807L, this.f10958ikoacuggdj), iwizpuwonkVar, yadqdtsiqtVar.f71903ppxfxbqfkf);
    }

    private void P(int i13, int i14, List list) throws Throwable {
        this.f10952crxdokpmqz.zoijcleaow(1);
        mbcevpiqjq(this.f10957hkdspvbjdz.yadqdtsiqt(i13, i14, list), false);
    }

    private void Q() throws ExoPlaybackException {
        if (this.f10984sopmlzcsov.f11041iobyxmoadg.vdvldrhtss() || !this.f10957hkdspvbjdz.zdlpuopuiu()) {
            return;
        }
        boolean zOipsdeybqn = oipsdeybqn();
        weqkydbzbr();
        lrnfpwlwnk();
        zeieaojujs();
        opjhrmiecq();
        iyctptxqzt(zOipsdeybqn);
    }

    private static int R(int i13, int i14) {
        if (i13 == -1) {
            return 2;
        }
        if (i14 == 2) {
            return 1;
        }
        return i14;
    }

    private void S() {
        skhdrjzrfn skhdrjzrfnVar = this.f10984sopmlzcsov;
        T(skhdrjzrfnVar.f11036draadjrbmk, skhdrjzrfnVar.f11034agtfadlqog, skhdrjzrfnVar.f11050wflxmlrfwp);
    }

    private void T(boolean z13, int i13, int i14) {
        U(z13, this.f10974ntlheqmsrt.ojitshcjhn(z13, this.f10984sopmlzcsov.f11038eablkybsjg), i13, i14);
    }

    private void U(boolean z13, int i13, int i14, int i15) {
        boolean z14 = z13 && i13 != -1;
        int iR = R(i13, i15);
        int iX = X(i13, i14);
        skhdrjzrfn skhdrjzrfnVar = this.f10984sopmlzcsov;
        if (skhdrjzrfnVar.f11036draadjrbmk == z14 && skhdrjzrfnVar.f11034agtfadlqog == iX && skhdrjzrfnVar.f11050wflxmlrfwp == iR) {
            return;
        }
        this.f10984sopmlzcsov = skhdrjzrfnVar.eablkybsjg(z14, iR, iX);
        Y(false, false);
        uawqvzlxes(z14);
        if (!G()) {
            M();
            V();
            this.f10965jpowsppfya.jpowsppfya(this.f10996ydmasvzmpa);
            return;
        }
        int i16 = this.f10984sopmlzcsov.f11038eablkybsjg;
        if (i16 == 3) {
            this.f10992wwaezpbzkn.gxszxtbevo();
            J();
            this.f10980pmvmpeiblj.nufgyqmvbu(2);
        } else if (i16 == 2) {
            this.f10980pmvmpeiblj.nufgyqmvbu(2);
        }
    }

    private void V() {
        yfnezrywwk yfnezrywwkVarYggfygwlhe = this.f10965jpowsppfya.yggfygwlhe();
        if (yfnezrywwkVarYggfygwlhe == null) {
            return;
        }
        long jBtonecajqb = yfnezrywwkVarYggfygwlhe.f11641gxszxtbevo ? yfnezrywwkVarYggfygwlhe.f11642iobyxmoadg.btonecajqb() : -9223372036854775807L;
        if (jBtonecajqb != -9223372036854775807L) {
            if (!yfnezrywwkVarYggfygwlhe.kcexrzcfyt()) {
                this.f10965jpowsppfya.dsvhmnatus(yfnezrywwkVarYggfygwlhe);
                kegysxyocb(false);
                metgxyhuhe();
            }
            grlcpdaxtj(jBtonecajqb);
            if (jBtonecajqb != this.f10984sopmlzcsov.f11042kcexrzcfyt) {
                skhdrjzrfn skhdrjzrfnVar = this.f10984sopmlzcsov;
                this.f10984sopmlzcsov = crxdokpmqz(skhdrjzrfnVar.f11053zoijcleaow, jBtonecajqb, skhdrjzrfnVar.f11047ppxfxbqfkf, jBtonecajqb, true, 5);
            }
        } else {
            long jDxjokdxxww = this.f10992wwaezpbzkn.dxjokdxxww(yfnezrywwkVarYggfygwlhe != this.f10965jpowsppfya.esjtqupxsv());
            this.f10996ydmasvzmpa = jDxjokdxxww;
            long jIstkbnxepw = yfnezrywwkVarYggfygwlhe.istkbnxepw(jDxjokdxxww);
            zfvoamnweg(this.f10984sopmlzcsov.f11042kcexrzcfyt, jIstkbnxepw);
            if (this.f10992wwaezpbzkn.iwizpuwonk()) {
                boolean z13 = !this.f10952crxdokpmqz.f11007wkgbmnqykc;
                skhdrjzrfn skhdrjzrfnVar2 = this.f10984sopmlzcsov;
                this.f10984sopmlzcsov = crxdokpmqz(skhdrjzrfnVar2.f11053zoijcleaow, jIstkbnxepw, skhdrjzrfnVar2.f11047ppxfxbqfkf, jIstkbnxepw, z13, 6);
            } else {
                this.f10984sopmlzcsov.ojitshcjhn(jIstkbnxepw);
            }
        }
        this.f10984sopmlzcsov.f11049vdvldrhtss = this.f10965jpowsppfya.agtfadlqog().btonecajqb();
        this.f10984sopmlzcsov.f11046oxmwwwfdhm = jpowsppfya();
        skhdrjzrfn skhdrjzrfnVar3 = this.f10984sopmlzcsov;
        if (skhdrjzrfnVar3.f11036draadjrbmk && skhdrjzrfnVar3.f11038eablkybsjg == 3 && I(skhdrjzrfnVar3.f11041iobyxmoadg, skhdrjzrfnVar3.f11053zoijcleaow) && this.f10984sopmlzcsov.f11045ojitshcjhn.f115310iobyxmoadg == 1.0f) {
            float fZoijcleaow = this.f10950cllcsxoeiz.zoijcleaow(lmojexxdyd(), this.f10984sopmlzcsov.f11046oxmwwwfdhm);
            if (this.f10992wwaezpbzkn.lqeggnwhkg().f115310iobyxmoadg != fZoijcleaow) {
                k(this.f10984sopmlzcsov.f11045ojitshcjhn.zoijcleaow(fZoijcleaow));
                ulzqkzuiru(this.f10984sopmlzcsov.f11045ojitshcjhn, this.f10992wwaezpbzkn.lqeggnwhkg().f115310iobyxmoadg, false, false);
            }
        }
    }

    private void W(v2.cdpycssgdh cdpycssgdhVar, androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar, v2.cdpycssgdh cdpycssgdhVar2, androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar2, long j13, boolean z13) {
        if (!I(cdpycssgdhVar, zoijcleaowVar)) {
            v2.cqumvgiudr cqumvgiudrVar = zoijcleaowVar.zoijcleaow() ? v2.cqumvgiudr.f115309wkgbmnqykc : this.f10984sopmlzcsov.f11045ojitshcjhn;
            if (this.f10992wwaezpbzkn.lqeggnwhkg().equals(cqumvgiudrVar)) {
                return;
            }
            k(cqumvgiudrVar);
            ulzqkzuiru(this.f10984sopmlzcsov.f11045ojitshcjhn, cqumvgiudrVar.f115310iobyxmoadg, false, false);
            return;
        }
        cdpycssgdhVar.agtfadlqog(cdpycssgdhVar.nufgyqmvbu(zoijcleaowVar.f11262iobyxmoadg, this.f10995yadqdtsiqt).f115304ppxfxbqfkf, this.f10949cdpycssgdh);
        this.f10950cllcsxoeiz.iobyxmoadg((v2.kcexrzcfyt.lqeggnwhkg) y2.stevsuqkhv.nufgyqmvbu(this.f10949cdpycssgdh.f115280btonecajqb));
        if (j13 != -9223372036854775807L) {
            this.f10950cllcsxoeiz.eablkybsjg(wwaezpbzkn(cdpycssgdhVar, zoijcleaowVar.f11262iobyxmoadg, j13));
            return;
        }
        if (!Objects.equals(!cdpycssgdhVar2.vdvldrhtss() ? cdpycssgdhVar2.agtfadlqog(cdpycssgdhVar2.nufgyqmvbu(zoijcleaowVar2.f11262iobyxmoadg, this.f10995yadqdtsiqt).f115304ppxfxbqfkf, this.f10949cdpycssgdh).f115286iobyxmoadg : null, this.f10949cdpycssgdh.f115286iobyxmoadg) || z13) {
            this.f10950cllcsxoeiz.eablkybsjg(-9223372036854775807L);
        }
    }

    private static int X(int i13, int i14) {
        if (i13 == 0) {
            return 1;
        }
        if (i14 == 1) {
            return 0;
        }
        return i14;
    }

    private void Y(boolean z13, boolean z14) {
        this.f10963jhduphickx = z13;
        this.f10958ikoacuggdj = (!z13 || z14) ? -9223372036854775807L : this.f10979pkzmftpjix.elapsedRealtime();
    }

    private boolean Z() throws ExoPlaybackException {
        yfnezrywwk yfnezrywwkVarEsjtqupxsv = this.f10965jpowsppfya.esjtqupxsv();
        o3.yadqdtsiqt yadqdtsiqtVarRgvfuqvkyq = yfnezrywwkVarEsjtqupxsv.rgvfuqvkyq();
        boolean z13 = true;
        int i13 = 0;
        while (true) {
            fiwbwshyhd[] fiwbwshyhdVarArr = this.f11000zdlpuopuiu;
            if (i13 >= fiwbwshyhdVarArr.length) {
                break;
            }
            int iNufgyqmvbu = fiwbwshyhdVarArr[i13].nufgyqmvbu();
            int iPkzmftpjix = this.f11000zdlpuopuiu[i13].pkzmftpjix(yfnezrywwkVarEsjtqupxsv, yadqdtsiqtVarRgvfuqvkyq, this.f10992wwaezpbzkn);
            if ((iPkzmftpjix & 2) != 0 && this.f10953czzsidtyhn) {
                n(false);
            }
            this.f10989uwvvkdfqfp -= iNufgyqmvbu - this.f11000zdlpuopuiu[i13].nufgyqmvbu();
            z13 &= (iPkzmftpjix & 1) != 0;
            i13++;
        }
        if (z13) {
            for (int i14 = 0; i14 < this.f11000zdlpuopuiu.length; i14++) {
                if (yadqdtsiqtVarRgvfuqvkyq.ppxfxbqfkf(i14) && !this.f11000zdlpuopuiu[i14].iwizpuwonk(yfnezrywwkVarEsjtqupxsv)) {
                    zynmafqrjb(yfnezrywwkVarEsjtqupxsv, i14, false, yfnezrywwkVarEsjtqupxsv.agtfadlqog());
                }
            }
        }
        return z13;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00ac A[Catch: all -> 0x00af, TryCatch #1 {all -> 0x00af, blocks: (B:22:0x00a2, B:24:0x00ac, B:29:0x00b6, B:31:0x00bc, B:32:0x00bf, B:34:0x00c5, B:36:0x00cf, B:38:0x00d7, B:42:0x00df, B:44:0x00e9, B:46:0x00f9, B:50:0x0103, B:54:0x0115, B:58:0x011e), top: B:74:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b6 A[Catch: all -> 0x00af, TryCatch #1 {all -> 0x00af, blocks: (B:22:0x00a2, B:24:0x00ac, B:29:0x00b6, B:31:0x00bc, B:32:0x00bf, B:34:0x00c5, B:36:0x00cf, B:38:0x00d7, B:42:0x00df, B:44:0x00e9, B:46:0x00f9, B:50:0x0103, B:54:0x0115, B:58:0x011e), top: B:74:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00bc A[Catch: all -> 0x00af, TryCatch #1 {all -> 0x00af, blocks: (B:22:0x00a2, B:24:0x00ac, B:29:0x00b6, B:31:0x00bc, B:32:0x00bf, B:34:0x00c5, B:36:0x00cf, B:38:0x00d7, B:42:0x00df, B:44:0x00e9, B:46:0x00f9, B:50:0x0103, B:54:0x0115, B:58:0x011e), top: B:74:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00c5 A[Catch: all -> 0x00af, TryCatch #1 {all -> 0x00af, blocks: (B:22:0x00a2, B:24:0x00ac, B:29:0x00b6, B:31:0x00bc, B:32:0x00bf, B:34:0x00c5, B:36:0x00cf, B:38:0x00d7, B:42:0x00df, B:44:0x00e9, B:46:0x00f9, B:50:0x0103, B:54:0x0115, B:58:0x011e), top: B:74:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00cf A[Catch: all -> 0x00af, TryCatch #1 {all -> 0x00af, blocks: (B:22:0x00a2, B:24:0x00ac, B:29:0x00b6, B:31:0x00bc, B:32:0x00bf, B:34:0x00c5, B:36:0x00cf, B:38:0x00d7, B:42:0x00df, B:44:0x00e9, B:46:0x00f9, B:50:0x0103, B:54:0x0115, B:58:0x011e), top: B:74:0x00a2 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:53:0x0114  */
    /* JADX WARN: Code duplicated, block: B:56:0x011b  */
    /* JADX WARN: Code duplicated, block: B:57:0x011d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0127  */
    private void a(nufgyqmvbu nufgyqmvbuVar) throws Throwable {
        long jLongValue;
        long j13;
        boolean z13;
        androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar;
        long jLqeggnwhkg;
        long j14;
        long j15;
        long jYggfygwlhe;
        boolean z14;
        long jB;
        long j16;
        yfnezrywwk yfnezrywwkVarYggfygwlhe;
        skhdrjzrfn skhdrjzrfnVar;
        int i13;
        this.f10952crxdokpmqz.zoijcleaow(1);
        Pair pairEzmngbhpjk = ezmngbhpjk(this.f10984sopmlzcsov.f11041iobyxmoadg, nufgyqmvbuVar, true, this.f10967jztzpxfvev, this.f10994xrmfcynszj, this.f10949cdpycssgdh, this.f10995yadqdtsiqt);
        try {
            if (pairEzmngbhpjk != null) {
                Object obj = pairEzmngbhpjk.first;
                jLongValue = ((Long) pairEzmngbhpjk.second).longValue();
                long j17 = nufgyqmvbuVar.f11017ppxfxbqfkf == -9223372036854775807L ? -9223372036854775807L : jLongValue;
                androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVarKegysxyocb = this.f10965jpowsppfya.kegysxyocb(this.f10984sopmlzcsov.f11041iobyxmoadg, obj, jLongValue);
                if (zoijcleaowVarKegysxyocb.zoijcleaow()) {
                    this.f10984sopmlzcsov.f11041iobyxmoadg.nufgyqmvbu(zoijcleaowVarKegysxyocb.f11262iobyxmoadg, this.f10995yadqdtsiqt);
                    jLqeggnwhkg = this.f10995yadqdtsiqt.gtknphoqwx(zoijcleaowVarKegysxyocb.f11265zoijcleaow) == zoijcleaowVarKegysxyocb.f11263ppxfxbqfkf ? this.f10995yadqdtsiqt.lqeggnwhkg() : 0L;
                    j14 = j17;
                    zoijcleaowVar = zoijcleaowVarKegysxyocb;
                    z13 = true;
                } else {
                    j13 = j17;
                    z13 = nufgyqmvbuVar.f11017ppxfxbqfkf == -9223372036854775807L;
                    zoijcleaowVar = zoijcleaowVarKegysxyocb;
                }
                if (this.f10984sopmlzcsov.f11041iobyxmoadg.vdvldrhtss()) {
                    if (pairEzmngbhpjk == null) {
                        if (this.f10984sopmlzcsov.f11038eablkybsjg != 1) {
                            A(4);
                        }
                        fyldjkxazc(false, true, false, true);
                    } else {
                        if (zoijcleaowVar.equals(this.f10984sopmlzcsov.f11053zoijcleaow)) {
                            yfnezrywwkVarYggfygwlhe = this.f10965jpowsppfya.yggfygwlhe();
                            if (yfnezrywwkVarYggfygwlhe == null && yfnezrywwkVarYggfygwlhe.f11641gxszxtbevo && jLqeggnwhkg != 0) {
                                jYggfygwlhe = yfnezrywwkVarYggfygwlhe.f11642iobyxmoadg.yggfygwlhe(jLqeggnwhkg, this.f10988ulzqkzuiru);
                            } else {
                                jYggfygwlhe = jLqeggnwhkg;
                            }
                            if (y2.stevsuqkhv.t(jYggfygwlhe) == y2.stevsuqkhv.t(this.f10984sopmlzcsov.f11042kcexrzcfyt) && ((i13 = (skhdrjzrfnVar = this.f10984sopmlzcsov).f11038eablkybsjg) == 2 || i13 == 3)) {
                                long j18 = skhdrjzrfnVar.f11042kcexrzcfyt;
                                this.f10984sopmlzcsov = crxdokpmqz(zoijcleaowVar, j18, j14, j18, z13, 2);
                                return;
                            }
                        } else {
                            jYggfygwlhe = jLqeggnwhkg;
                        }
                        if (this.f10984sopmlzcsov.f11038eablkybsjg == 4) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        jB = b(zoijcleaowVar, jYggfygwlhe, z14);
                        z13 |= jLqeggnwhkg != jB;
                        try {
                            skhdrjzrfn skhdrjzrfnVar2 = this.f10984sopmlzcsov;
                            v2.cdpycssgdh cdpycssgdhVar = skhdrjzrfnVar2.f11041iobyxmoadg;
                            W(cdpycssgdhVar, zoijcleaowVar, cdpycssgdhVar, skhdrjzrfnVar2.f11053zoijcleaow, j14, true);
                            j16 = jB;
                        } catch (Throwable th2) {
                            th = th2;
                            j15 = jB;
                            this.f10984sopmlzcsov = crxdokpmqz(zoijcleaowVar, j15, j14, j15, z13, 2);
                            throw th;
                        }
                    }
                    this.f10984sopmlzcsov = crxdokpmqz(zoijcleaowVar, j16, j14, j16, z13, 2);
                    return;
                }
                this.f10997yfnezrywwk = nufgyqmvbuVar;
                j16 = jLqeggnwhkg;
                this.f10984sopmlzcsov = crxdokpmqz(zoijcleaowVar, j16, j14, j16, z13, 2);
                return;
            }
            Pair pairPkzmftpjix = pkzmftpjix(this.f10984sopmlzcsov.f11041iobyxmoadg);
            zoijcleaowVar = (androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow) pairPkzmftpjix.first;
            jLongValue = ((Long) pairPkzmftpjix.second).longValue();
            z13 = !this.f10984sopmlzcsov.f11041iobyxmoadg.vdvldrhtss();
            j13 = -9223372036854775807L;
            if (this.f10984sopmlzcsov.f11041iobyxmoadg.vdvldrhtss()) {
                if (pairEzmngbhpjk == null) {
                    if (this.f10984sopmlzcsov.f11038eablkybsjg != 1) {
                        A(4);
                    }
                    fyldjkxazc(false, true, false, true);
                } else {
                    if (zoijcleaowVar.equals(this.f10984sopmlzcsov.f11053zoijcleaow)) {
                        yfnezrywwkVarYggfygwlhe = this.f10965jpowsppfya.yggfygwlhe();
                        if (yfnezrywwkVarYggfygwlhe == null) {
                            jYggfygwlhe = jLqeggnwhkg;
                        } else {
                            jYggfygwlhe = jLqeggnwhkg;
                        }
                        if (y2.stevsuqkhv.t(jYggfygwlhe) == y2.stevsuqkhv.t(this.f10984sopmlzcsov.f11042kcexrzcfyt)) {
                            long j19 = skhdrjzrfnVar.f11042kcexrzcfyt;
                            this.f10984sopmlzcsov = crxdokpmqz(zoijcleaowVar, j19, j14, j19, z13, 2);
                            return;
                        }
                    } else {
                        jYggfygwlhe = jLqeggnwhkg;
                    }
                    if (this.f10984sopmlzcsov.f11038eablkybsjg == 4) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    jB = b(zoijcleaowVar, jYggfygwlhe, z14);
                    z13 |= jLqeggnwhkg != jB;
                    skhdrjzrfn skhdrjzrfnVar3 = this.f10984sopmlzcsov;
                    v2.cdpycssgdh cdpycssgdhVar2 = skhdrjzrfnVar3.f11041iobyxmoadg;
                    W(cdpycssgdhVar2, zoijcleaowVar, cdpycssgdhVar2, skhdrjzrfnVar3.f11053zoijcleaow, j14, true);
                    j16 = jB;
                }
                this.f10984sopmlzcsov = crxdokpmqz(zoijcleaowVar, j16, j14, j16, z13, 2);
                return;
            }
            this.f10997yfnezrywwk = nufgyqmvbuVar;
            j16 = jLqeggnwhkg;
            this.f10984sopmlzcsov = crxdokpmqz(zoijcleaowVar, j16, j14, j16, z13, 2);
            return;
        } catch (Throwable th3) {
            th = th3;
            j15 = jLqeggnwhkg;
        }
        jLqeggnwhkg = jLongValue;
        j14 = j13;
    }

    private void a0(float f13) {
        for (yfnezrywwk yfnezrywwkVarYggfygwlhe = this.f10965jpowsppfya.yggfygwlhe(); yfnezrywwkVarYggfygwlhe != null; yfnezrywwkVarYggfygwlhe = yfnezrywwkVarYggfygwlhe.gtknphoqwx()) {
            for (o3.esjtqupxsv esjtqupxsvVar : yfnezrywwkVarYggfygwlhe.rgvfuqvkyq().f71903ppxfxbqfkf) {
                if (esjtqupxsvVar != null) {
                    esjtqupxsvVar.wkgbmnqykc(f13);
                }
            }
        }
    }

    private void ageimvtcrz() throws ExoPlaybackException {
        fiwbwshyhd();
        krqnebusok(true);
    }

    private void auzgnhcxok() {
        for (yfnezrywwk yfnezrywwkVarYggfygwlhe = this.f10965jpowsppfya.yggfygwlhe(); yfnezrywwkVarYggfygwlhe != null; yfnezrywwkVarYggfygwlhe = yfnezrywwkVarYggfygwlhe.gtknphoqwx()) {
            for (o3.esjtqupxsv esjtqupxsvVar : yfnezrywwkVarYggfygwlhe.rgvfuqvkyq().f71903ppxfxbqfkf) {
                if (esjtqupxsvVar != null) {
                    esjtqupxsvVar.wflxmlrfwp();
                }
            }
        }
    }

    private long b(androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar, long j13, boolean z13) {
        return c(zoijcleaowVar, j13, this.f10965jpowsppfya.yggfygwlhe() != this.f10965jpowsppfya.esjtqupxsv(), z13);
    }

    private synchronized void b0(xa.vdvldrhtss vdvldrhtssVar, long j13) {
        long jElapsedRealtime = this.f10979pkzmftpjix.elapsedRealtime() + j13;
        boolean z13 = false;
        while (!((Boolean) vdvldrhtssVar.get()).booleanValue() && j13 > 0) {
            try {
                this.f10979pkzmftpjix.zoijcleaow();
                wait(j13);
            } catch (InterruptedException unused) {
                z13 = true;
            }
            j13 = jElapsedRealtime - this.f10979pkzmftpjix.elapsedRealtime();
        }
        if (z13) {
            Thread.currentThread().interrupt();
        }
    }

    private void bfopjjpdmp() {
        yfnezrywwk yfnezrywwkVarYggfygwlhe;
        boolean z13;
        if (this.f10965jpowsppfya.yggfygwlhe() == this.f10965jpowsppfya.esjtqupxsv() && (yfnezrywwkVarYggfygwlhe = this.f10965jpowsppfya.yggfygwlhe()) != null) {
            o3.yadqdtsiqt yadqdtsiqtVarRgvfuqvkyq = yfnezrywwkVarYggfygwlhe.rgvfuqvkyq();
            boolean z14 = false;
            int i13 = 0;
            boolean z15 = false;
            while (true) {
                if (i13 >= this.f11000zdlpuopuiu.length) {
                    z13 = true;
                    break;
                }
                if (yadqdtsiqtVarRgvfuqvkyq.ppxfxbqfkf(i13)) {
                    if (this.f11000zdlpuopuiu[i13].wflxmlrfwp() != 1) {
                        z13 = false;
                        break;
                    } else if (yadqdtsiqtVarRgvfuqvkyq.f71905zoijcleaow[i13].f32665iobyxmoadg != 0) {
                        z15 = true;
                    }
                }
                i13++;
            }
            if (z15 && z13) {
                z14 = true;
            }
            n(z14);
        }
    }

    private long c(androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar, long j13, boolean z13, boolean z14) throws ExoPlaybackException {
        M();
        Y(false, true);
        if (z14 || this.f10984sopmlzcsov.f11038eablkybsjg == 3) {
            A(2);
        }
        yfnezrywwk yfnezrywwkVarYggfygwlhe = this.f10965jpowsppfya.yggfygwlhe();
        yfnezrywwk yfnezrywwkVarGtknphoqwx = yfnezrywwkVarYggfygwlhe;
        while (yfnezrywwkVarGtknphoqwx != null && !zoijcleaowVar.equals(yfnezrywwkVarGtknphoqwx.f11644nufgyqmvbu.f11629iobyxmoadg)) {
            yfnezrywwkVarGtknphoqwx = yfnezrywwkVarGtknphoqwx.gtknphoqwx();
        }
        if (z13 || yfnezrywwkVarYggfygwlhe != yfnezrywwkVarGtknphoqwx || (yfnezrywwkVarGtknphoqwx != null && yfnezrywwkVarGtknphoqwx.cdpycssgdh(j13) < 0)) {
            lereixgezr();
            if (yfnezrywwkVarGtknphoqwx != null) {
                while (this.f10965jpowsppfya.yggfygwlhe() != yfnezrywwkVarGtknphoqwx) {
                    this.f10965jpowsppfya.zoijcleaow();
                }
                this.f10965jpowsppfya.dsvhmnatus(yfnezrywwkVarGtknphoqwx);
                yfnezrywwkVarGtknphoqwx.zynmafqrjb(1000000000000L);
                istkbnxepw();
                yfnezrywwkVarGtknphoqwx.f11638dxjokdxxww = true;
            }
        }
        cqumvgiudr();
        if (yfnezrywwkVarGtknphoqwx != null) {
            this.f10965jpowsppfya.dsvhmnatus(yfnezrywwkVarGtknphoqwx);
            if (!yfnezrywwkVarGtknphoqwx.f11641gxszxtbevo) {
                yfnezrywwkVarGtknphoqwx.f11644nufgyqmvbu = yfnezrywwkVarGtknphoqwx.f11644nufgyqmvbu.zoijcleaow(j13);
            } else if (yfnezrywwkVarGtknphoqwx.f11643lqeggnwhkg) {
                j13 = yfnezrywwkVarGtknphoqwx.f11642iobyxmoadg.dxjokdxxww(j13);
                yfnezrywwkVarGtknphoqwx.f11642iobyxmoadg.zdlpuopuiu(j13 - this.f10959iozdgvuglv, this.f10970lmojexxdyd);
            }
            grlcpdaxtj(j13);
            metgxyhuhe();
        } else {
            this.f10965jpowsppfya.lqeggnwhkg();
            grlcpdaxtj(j13);
        }
        kegysxyocb(false);
        this.f10980pmvmpeiblj.nufgyqmvbu(2);
        return j13;
    }

    private void cdpycssgdh(boolean[] zArr, long j13) throws ExoPlaybackException {
        yfnezrywwk yfnezrywwkVarEsjtqupxsv = this.f10965jpowsppfya.esjtqupxsv();
        o3.yadqdtsiqt yadqdtsiqtVarRgvfuqvkyq = yfnezrywwkVarEsjtqupxsv.rgvfuqvkyq();
        for (int i13 = 0; i13 < this.f11000zdlpuopuiu.length; i13++) {
            if (!yadqdtsiqtVarRgvfuqvkyq.ppxfxbqfkf(i13)) {
                this.f11000zdlpuopuiu[i13].jpowsppfya();
            }
        }
        for (int i14 = 0; i14 < this.f11000zdlpuopuiu.length; i14++) {
            if (yadqdtsiqtVarRgvfuqvkyq.ppxfxbqfkf(i14) && !this.f11000zdlpuopuiu[i14].iwizpuwonk(yfnezrywwkVarEsjtqupxsv)) {
                zynmafqrjb(yfnezrywwkVarEsjtqupxsv, i14, zArr[i14], j13);
            }
        }
    }

    private void cllcsxoeiz(int i13) {
        skhdrjzrfn skhdrjzrfnVar = this.f10984sopmlzcsov;
        U(skhdrjzrfnVar.f11036draadjrbmk, i13, skhdrjzrfnVar.f11034agtfadlqog, skhdrjzrfnVar.f11050wflxmlrfwp);
    }

    private void cqumvgiudr() {
        if (this.f10972mbcevpiqjq && zdlpuopuiu()) {
            for (fiwbwshyhd fiwbwshyhdVar : this.f11000zdlpuopuiu) {
                int iNufgyqmvbu = fiwbwshyhdVar.nufgyqmvbu();
                fiwbwshyhdVar.ppxfxbqfkf(this.f10992wwaezpbzkn);
                this.f10989uwvvkdfqfp -= iNufgyqmvbu - fiwbwshyhdVar.nufgyqmvbu();
            }
            this.f11001zeieaojujs = -9223372036854775807L;
        }
    }

    private skhdrjzrfn crxdokpmqz(androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar, long j13, long j14, long j15, boolean z13, int i13) {
        List listZynmafqrjb;
        m3.iwizpuwonk iwizpuwonkVar;
        o3.yadqdtsiqt yadqdtsiqtVar;
        this.f10976oipsdeybqn = (!this.f10976oipsdeybqn && j13 == this.f10984sopmlzcsov.f11042kcexrzcfyt && zoijcleaowVar.equals(this.f10984sopmlzcsov.f11053zoijcleaow)) ? false : true;
        ipoelvxyzq();
        skhdrjzrfn skhdrjzrfnVar = this.f10984sopmlzcsov;
        m3.iwizpuwonk iwizpuwonkVar2 = skhdrjzrfnVar.f11044nufgyqmvbu;
        o3.yadqdtsiqt yadqdtsiqtVar2 = skhdrjzrfnVar.f11037dxjokdxxww;
        List list = skhdrjzrfnVar.f11035btonecajqb;
        if (this.f10957hkdspvbjdz.zdlpuopuiu()) {
            yfnezrywwk yfnezrywwkVarYggfygwlhe = this.f10965jpowsppfya.yggfygwlhe();
            m3.iwizpuwonk iwizpuwonkVarOjitshcjhn = yfnezrywwkVarYggfygwlhe == null ? m3.iwizpuwonk.f65035wkgbmnqykc : yfnezrywwkVarYggfygwlhe.ojitshcjhn();
            o3.yadqdtsiqt yadqdtsiqtVarRgvfuqvkyq = yfnezrywwkVarYggfygwlhe == null ? this.f10951cqumvgiudr : yfnezrywwkVarYggfygwlhe.rgvfuqvkyq();
            com.google.common.collect.zdlpuopuiu zdlpuopuiuVarIozdgvuglv = iozdgvuglv(yadqdtsiqtVarRgvfuqvkyq.f71903ppxfxbqfkf);
            if (yfnezrywwkVarYggfygwlhe != null) {
                ydmasvzmpa ydmasvzmpaVar = yfnezrywwkVarYggfygwlhe.f11644nufgyqmvbu;
                if (ydmasvzmpaVar.f11632ppxfxbqfkf != j14) {
                    yfnezrywwkVarYggfygwlhe.f11644nufgyqmvbu = ydmasvzmpaVar.iobyxmoadg(j14);
                }
            }
            bfopjjpdmp();
            iwizpuwonkVar = iwizpuwonkVarOjitshcjhn;
            yadqdtsiqtVar = yadqdtsiqtVarRgvfuqvkyq;
            listZynmafqrjb = zdlpuopuiuVarIozdgvuglv;
        } else if (zoijcleaowVar.equals(this.f10984sopmlzcsov.f11053zoijcleaow)) {
            listZynmafqrjb = list;
            iwizpuwonkVar = iwizpuwonkVar2;
            yadqdtsiqtVar = yadqdtsiqtVar2;
        } else {
            iwizpuwonkVar = m3.iwizpuwonk.f65035wkgbmnqykc;
            yadqdtsiqtVar = this.f10951cqumvgiudr;
            listZynmafqrjb = com.google.common.collect.zdlpuopuiu.zynmafqrjb();
        }
        if (z13) {
            this.f10952crxdokpmqz.wkgbmnqykc(i13);
        }
        return this.f10984sopmlzcsov.wkgbmnqykc(zoijcleaowVar, j13, j14, j15, jpowsppfya(), iwizpuwonkVar, yadqdtsiqtVar, listZynmafqrjb);
    }

    private void czzsidtyhn() {
        for (fiwbwshyhd fiwbwshyhdVar : this.f11000zdlpuopuiu) {
            fiwbwshyhdVar.cdpycssgdh();
        }
    }

    private void d(igdgnonuha igdgnonuhaVar) {
        if (igdgnonuhaVar.eablkybsjg() == -9223372036854775807L) {
            e(igdgnonuhaVar);
            return;
        }
        if (this.f10984sopmlzcsov.f11041iobyxmoadg.vdvldrhtss()) {
            this.f10999ylkuphrtab.add(new wkgbmnqykc(igdgnonuhaVar));
            return;
        }
        wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc(igdgnonuhaVar);
        v2.cdpycssgdh cdpycssgdhVar = this.f10984sopmlzcsov.f11041iobyxmoadg;
        if (!ixidwrxhsl(wkgbmnqykcVar, cdpycssgdhVar, cdpycssgdhVar, this.f10967jztzpxfvev, this.f10994xrmfcynszj, this.f10949cdpycssgdh, this.f10995yadqdtsiqt)) {
            igdgnonuhaVar.btonecajqb(false);
        } else {
            this.f10999ylkuphrtab.add(wkgbmnqykcVar);
            Collections.sort(this.f10999ylkuphrtab);
        }
    }

    private void dsvhmnatus() {
        D(this.f10986tbqsvytpvh);
    }

    private void e(igdgnonuha igdgnonuhaVar) {
        if (igdgnonuhaVar.zoijcleaow() != this.f10960istkbnxepw) {
            this.f10980pmvmpeiblj.wkgbmnqykc(15, igdgnonuhaVar).iobyxmoadg();
            return;
        }
        iwizpuwonk(igdgnonuhaVar);
        int i13 = this.f10984sopmlzcsov.f11038eablkybsjg;
        if (i13 == 3 || i13 == 2) {
            this.f10980pmvmpeiblj.nufgyqmvbu(2);
        }
    }

    private void esjtqupxsv(int i13) {
        int iNufgyqmvbu = this.f11000zdlpuopuiu[i13].nufgyqmvbu();
        this.f11000zdlpuopuiu[i13].zoijcleaow(this.f10992wwaezpbzkn);
        sflfametgt(i13, false);
        this.f10989uwvvkdfqfp -= iNufgyqmvbu;
    }

    private static Pair ezmngbhpjk(v2.cdpycssgdh cdpycssgdhVar, nufgyqmvbu nufgyqmvbuVar, boolean z13, int i13, boolean z14, v2.cdpycssgdh.ppxfxbqfkf ppxfxbqfkfVar, v2.cdpycssgdh.zoijcleaow zoijcleaowVar) {
        int iRhgxfdycjh;
        v2.cdpycssgdh cdpycssgdhVar2 = nufgyqmvbuVar.f11016iobyxmoadg;
        if (cdpycssgdhVar.vdvldrhtss()) {
            return null;
        }
        v2.cdpycssgdh cdpycssgdhVar3 = cdpycssgdhVar2.vdvldrhtss() ? cdpycssgdhVar : cdpycssgdhVar2;
        try {
            Pair pairBtonecajqb = cdpycssgdhVar3.btonecajqb(ppxfxbqfkfVar, zoijcleaowVar, nufgyqmvbuVar.f11018zoijcleaow, nufgyqmvbuVar.f11017ppxfxbqfkf);
            if (cdpycssgdhVar.equals(cdpycssgdhVar3)) {
                return pairBtonecajqb;
            }
            if (cdpycssgdhVar.zoijcleaow(pairBtonecajqb.first) != -1) {
                return (cdpycssgdhVar3.nufgyqmvbu(pairBtonecajqb.first, zoijcleaowVar).f115301gxszxtbevo && cdpycssgdhVar3.agtfadlqog(zoijcleaowVar.f115304ppxfxbqfkf, ppxfxbqfkfVar).f115279agtfadlqog == cdpycssgdhVar3.zoijcleaow(pairBtonecajqb.first)) ? cdpycssgdhVar.btonecajqb(ppxfxbqfkfVar, zoijcleaowVar, cdpycssgdhVar.nufgyqmvbu(pairBtonecajqb.first, zoijcleaowVar).f115304ppxfxbqfkf, nufgyqmvbuVar.f11017ppxfxbqfkf) : pairBtonecajqb;
            }
            if (z13 && (iRhgxfdycjh = rhgxfdycjh(ppxfxbqfkfVar, zoijcleaowVar, i13, z14, pairBtonecajqb.first, cdpycssgdhVar3, cdpycssgdhVar)) != -1) {
                return cdpycssgdhVar.btonecajqb(ppxfxbqfkfVar, zoijcleaowVar, iRhgxfdycjh, -9223372036854775807L);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    private void f(final igdgnonuha igdgnonuhaVar) {
        Looper looperZoijcleaow = igdgnonuhaVar.zoijcleaow();
        if (looperZoijcleaow.getThread().isAlive()) {
            this.f10979pkzmftpjix.iobyxmoadg(looperZoijcleaow, null).lqeggnwhkg(new Runnable() { // from class: androidx.media3.exoplayer.metgxyhuhe
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10877zdlpuopuiu.xrmfcynszj(igdgnonuhaVar);
                }
            });
        } else {
            y2.kcexrzcfyt.nufgyqmvbu("TAG", "Trying to send message on a dead thread.");
            igdgnonuhaVar.btonecajqb(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void fiwbwshyhd() throws ExoPlaybackException {
        boolean z13;
        float f13 = this.f10992wwaezpbzkn.lqeggnwhkg().f115310iobyxmoadg;
        yfnezrywwk yfnezrywwkVarYggfygwlhe = this.f10965jpowsppfya.yggfygwlhe();
        yfnezrywwk yfnezrywwkVarEsjtqupxsv = this.f10965jpowsppfya.esjtqupxsv();
        int i13 = 1;
        o3.yadqdtsiqt yadqdtsiqtVar = null;
        boolean z14 = true;
        while (yfnezrywwkVarYggfygwlhe != null && yfnezrywwkVarYggfygwlhe.f11641gxszxtbevo) {
            skhdrjzrfn skhdrjzrfnVar = this.f10984sopmlzcsov;
            o3.yadqdtsiqt yadqdtsiqtVarLereixgezr = yfnezrywwkVarYggfygwlhe.lereixgezr(f13, skhdrjzrfnVar.f11041iobyxmoadg, skhdrjzrfnVar.f11036draadjrbmk);
            if (yfnezrywwkVarYggfygwlhe == this.f10965jpowsppfya.yggfygwlhe()) {
                yadqdtsiqtVar = yadqdtsiqtVarLereixgezr;
            }
            if (!yadqdtsiqtVarLereixgezr.iobyxmoadg(yfnezrywwkVarYggfygwlhe.rgvfuqvkyq())) {
                if (z14) {
                    yfnezrywwk yfnezrywwkVarYggfygwlhe2 = this.f10965jpowsppfya.yggfygwlhe();
                    boolean z15 = (this.f10965jpowsppfya.dsvhmnatus(yfnezrywwkVarYggfygwlhe2) & i13) != 0 ? i13 : false;
                    boolean[] zArr = new boolean[this.f11000zdlpuopuiu.length];
                    long jZoijcleaow = yfnezrywwkVarYggfygwlhe2.zoijcleaow((o3.yadqdtsiqt) y2.iobyxmoadg.eablkybsjg(yadqdtsiqtVar), this.f10984sopmlzcsov.f11042kcexrzcfyt, z15, zArr);
                    skhdrjzrfn skhdrjzrfnVar2 = this.f10984sopmlzcsov;
                    int i14 = (skhdrjzrfnVar2.f11038eablkybsjg == 4 || jZoijcleaow == skhdrjzrfnVar2.f11042kcexrzcfyt) ? 0 : i13;
                    skhdrjzrfn skhdrjzrfnVar3 = this.f10984sopmlzcsov;
                    this.f10984sopmlzcsov = crxdokpmqz(skhdrjzrfnVar3.f11053zoijcleaow, jZoijcleaow, skhdrjzrfnVar3.f11047ppxfxbqfkf, skhdrjzrfnVar3.f11051wkgbmnqykc, i14, 5);
                    if (i14 != 0) {
                        grlcpdaxtj(jZoijcleaow);
                    }
                    cqumvgiudr();
                    boolean[] zArr2 = new boolean[this.f11000zdlpuopuiu.length];
                    int i15 = 0;
                    while (true) {
                        fiwbwshyhd[] fiwbwshyhdVarArr = this.f11000zdlpuopuiu;
                        if (i15 >= fiwbwshyhdVarArr.length) {
                            break;
                        }
                        int iNufgyqmvbu = fiwbwshyhdVarArr[i15].nufgyqmvbu();
                        zArr2[i15] = this.f11000zdlpuopuiu[i15].cqumvgiudr();
                        this.f11000zdlpuopuiu[i15].zynmafqrjb(yfnezrywwkVarYggfygwlhe2.f11646ppxfxbqfkf[i15], this.f10992wwaezpbzkn, this.f10996ydmasvzmpa, zArr[i15]);
                        if (iNufgyqmvbu - this.f11000zdlpuopuiu[i15].nufgyqmvbu() > 0) {
                            sflfametgt(i15, false);
                        }
                        this.f10989uwvvkdfqfp -= iNufgyqmvbu - this.f11000zdlpuopuiu[i15].nufgyqmvbu();
                        i15++;
                    }
                    cdpycssgdh(zArr2, this.f10996ydmasvzmpa);
                    yfnezrywwkVarYggfygwlhe2.f11638dxjokdxxww = true;
                    z13 = true;
                } else {
                    this.f10965jpowsppfya.dsvhmnatus(yfnezrywwkVarYggfygwlhe);
                    if (yfnezrywwkVarYggfygwlhe.f11641gxszxtbevo) {
                        long jMax = Math.max(yfnezrywwkVarYggfygwlhe.f11644nufgyqmvbu.f11634zoijcleaow, yfnezrywwkVarYggfygwlhe.istkbnxepw(this.f10996ydmasvzmpa));
                        if (this.f10972mbcevpiqjq && zdlpuopuiu() && this.f10965jpowsppfya.cqumvgiudr() == yfnezrywwkVarYggfygwlhe) {
                            cqumvgiudr();
                        }
                        yfnezrywwkVarYggfygwlhe.iobyxmoadg(yadqdtsiqtVarLereixgezr, jMax, false);
                    }
                    z13 = true;
                }
                kegysxyocb(z13);
                if (this.f10984sopmlzcsov.f11038eablkybsjg != 4) {
                    metgxyhuhe();
                    V();
                    this.f10980pmvmpeiblj.nufgyqmvbu(2);
                    return;
                }
                return;
            }
            int i16 = i13;
            if (yfnezrywwkVarYggfygwlhe == yfnezrywwkVarEsjtqupxsv) {
                z14 = false;
            }
            yfnezrywwkVarYggfygwlhe = yfnezrywwkVarYggfygwlhe.gtknphoqwx();
            i13 = i16;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0150  */
    /* JADX WARN: Code duplicated, block: B:52:0x016e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0184  */
    /* JADX WARN: Code duplicated, block: B:69:0x019d  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:78:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:82:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d9  */
    private static lqeggnwhkg fmlbqenlif(v2.cdpycssgdh cdpycssgdhVar, skhdrjzrfn skhdrjzrfnVar, nufgyqmvbu nufgyqmvbuVar, zfvoamnweg zfvoamnwegVar, int i13, boolean z13, v2.cdpycssgdh.ppxfxbqfkf ppxfxbqfkfVar, v2.cdpycssgdh.zoijcleaow zoijcleaowVar) {
        androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar2;
        int i14;
        androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar3;
        int i15;
        long jLongValue;
        boolean z14;
        boolean z15;
        boolean z16;
        int iIobyxmoadg;
        boolean z17;
        long j13;
        androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVarKegysxyocb;
        int i16;
        boolean z18;
        boolean z19;
        androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar4;
        int i17;
        int iIobyxmoadg2;
        boolean z23;
        boolean z24;
        boolean z25;
        if (cdpycssgdhVar.vdvldrhtss()) {
            return new lqeggnwhkg(skhdrjzrfn.draadjrbmk(), 0L, -9223372036854775807L, false, true, false);
        }
        androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar5 = skhdrjzrfnVar.f11053zoijcleaow;
        Object obj = zoijcleaowVar5.f11262iobyxmoadg;
        boolean zIkoacuggdj = ikoacuggdj(skhdrjzrfnVar, zoijcleaowVar);
        long j14 = (skhdrjzrfnVar.f11053zoijcleaow.zoijcleaow() || zIkoacuggdj) ? skhdrjzrfnVar.f11047ppxfxbqfkf : skhdrjzrfnVar.f11042kcexrzcfyt;
        if (nufgyqmvbuVar != null) {
            zoijcleaowVar2 = zoijcleaowVar5;
            i14 = -1;
            Pair pairEzmngbhpjk = ezmngbhpjk(cdpycssgdhVar, nufgyqmvbuVar, true, i13, z13, ppxfxbqfkfVar, zoijcleaowVar);
            if (pairEzmngbhpjk == null) {
                iIobyxmoadg2 = cdpycssgdhVar.iobyxmoadg(z13);
                jLongValue = j14;
                z23 = false;
                z24 = false;
                z25 = true;
            } else {
                if (nufgyqmvbuVar.f11017ppxfxbqfkf == -9223372036854775807L) {
                    iIobyxmoadg2 = cdpycssgdhVar.nufgyqmvbu(pairEzmngbhpjk.first, zoijcleaowVar).f115304ppxfxbqfkf;
                    jLongValue = j14;
                    z23 = false;
                } else {
                    obj = pairEzmngbhpjk.first;
                    jLongValue = ((Long) pairEzmngbhpjk.second).longValue();
                    iIobyxmoadg2 = -1;
                    z23 = true;
                }
                z24 = skhdrjzrfnVar.f11038eablkybsjg == 4;
                z25 = false;
            }
            z16 = z23;
            z14 = z24;
            z15 = z25;
            i15 = iIobyxmoadg2;
        } else {
            zoijcleaowVar2 = zoijcleaowVar5;
            i14 = -1;
            if (!skhdrjzrfnVar.f11041iobyxmoadg.vdvldrhtss()) {
                if (cdpycssgdhVar.zoijcleaow(obj) == -1) {
                    int iRhgxfdycjh = rhgxfdycjh(ppxfxbqfkfVar, zoijcleaowVar, i13, z13, obj, skhdrjzrfnVar.f11041iobyxmoadg, cdpycssgdhVar);
                    if (iRhgxfdycjh == -1) {
                        iRhgxfdycjh = cdpycssgdhVar.iobyxmoadg(z13);
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    i15 = iRhgxfdycjh;
                    z15 = z17;
                    jLongValue = j14;
                    z14 = false;
                    z16 = false;
                } else if (j14 == -9223372036854775807L) {
                    iIobyxmoadg = cdpycssgdhVar.nufgyqmvbu(obj, zoijcleaowVar).f115304ppxfxbqfkf;
                } else if (zIkoacuggdj) {
                    zoijcleaowVar3 = zoijcleaowVar2;
                    skhdrjzrfnVar.f11041iobyxmoadg.nufgyqmvbu(zoijcleaowVar3.f11262iobyxmoadg, zoijcleaowVar);
                    if (skhdrjzrfnVar.f11041iobyxmoadg.agtfadlqog(zoijcleaowVar.f115304ppxfxbqfkf, ppxfxbqfkfVar).f115279agtfadlqog == skhdrjzrfnVar.f11041iobyxmoadg.zoijcleaow(zoijcleaowVar3.f11262iobyxmoadg)) {
                        Pair pairBtonecajqb = cdpycssgdhVar.btonecajqb(ppxfxbqfkfVar, zoijcleaowVar, cdpycssgdhVar.nufgyqmvbu(obj, zoijcleaowVar).f115304ppxfxbqfkf, j14 + zoijcleaowVar.agtfadlqog());
                        obj = pairBtonecajqb.first;
                        jLongValue = ((Long) pairBtonecajqb.second).longValue();
                    } else {
                        jLongValue = j14;
                    }
                    i15 = -1;
                    z14 = false;
                    z15 = false;
                    z16 = true;
                } else {
                    zoijcleaowVar3 = zoijcleaowVar2;
                    i15 = -1;
                    jLongValue = j14;
                    z14 = false;
                    z15 = false;
                    z16 = false;
                }
                if (i15 != i14) {
                    Pair pairBtonecajqb2 = cdpycssgdhVar.btonecajqb(ppxfxbqfkfVar, zoijcleaowVar, i15, -9223372036854775807L);
                    obj = pairBtonecajqb2.first;
                    jLongValue = ((Long) pairBtonecajqb2.second).longValue();
                    j13 = -9223372036854775807L;
                } else {
                    j13 = jLongValue;
                }
                zoijcleaowVarKegysxyocb = zfvoamnwegVar.kegysxyocb(cdpycssgdhVar, obj, jLongValue);
                i16 = zoijcleaowVarKegysxyocb.f11261eablkybsjg;
                if (i16 != i14 || ((i17 = zoijcleaowVar3.f11261eablkybsjg) != i14 && i16 >= i17)) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = (zoijcleaowVar3.f11262iobyxmoadg.equals(obj) || zoijcleaowVar3.zoijcleaow() || zoijcleaowVarKegysxyocb.zoijcleaow() || !z18) ? false : true;
                zoijcleaowVar4 = zoijcleaowVar3;
                boolean zRibwqtqdhb = ribwqtqdhb(zIkoacuggdj, zoijcleaowVar3, j14, zoijcleaowVarKegysxyocb, cdpycssgdhVar.nufgyqmvbu(obj, zoijcleaowVar), j13);
                if (z19 || zRibwqtqdhb) {
                    zoijcleaowVarKegysxyocb = zoijcleaowVar4;
                }
                if (zoijcleaowVarKegysxyocb.zoijcleaow()) {
                    if (zoijcleaowVarKegysxyocb.equals(zoijcleaowVar4)) {
                        jLongValue = skhdrjzrfnVar.f11042kcexrzcfyt;
                    } else {
                        cdpycssgdhVar.nufgyqmvbu(zoijcleaowVarKegysxyocb.f11262iobyxmoadg, zoijcleaowVar);
                        if (zoijcleaowVarKegysxyocb.f11263ppxfxbqfkf == zoijcleaowVar.gtknphoqwx(zoijcleaowVarKegysxyocb.f11265zoijcleaow)) {
                            jLongValue = zoijcleaowVar.lqeggnwhkg();
                        } else {
                            jLongValue = 0;
                        }
                    }
                }
                return new lqeggnwhkg(zoijcleaowVarKegysxyocb, jLongValue, j13, z14, z15, z16);
            }
            iIobyxmoadg = cdpycssgdhVar.iobyxmoadg(z13);
            i15 = iIobyxmoadg;
            jLongValue = j14;
            z14 = false;
            z15 = false;
            z16 = false;
        }
        zoijcleaowVar3 = zoijcleaowVar2;
        if (i15 != i14) {
            Pair pairBtonecajqb3 = cdpycssgdhVar.btonecajqb(ppxfxbqfkfVar, zoijcleaowVar, i15, -9223372036854775807L);
            obj = pairBtonecajqb3.first;
            jLongValue = ((Long) pairBtonecajqb3.second).longValue();
            j13 = -9223372036854775807L;
        } else {
            j13 = jLongValue;
        }
        zoijcleaowVarKegysxyocb = zfvoamnwegVar.kegysxyocb(cdpycssgdhVar, obj, jLongValue);
        i16 = zoijcleaowVarKegysxyocb.f11261eablkybsjg;
        if (i16 != i14) {
            z18 = true;
        } else {
            z18 = true;
        }
        if (zoijcleaowVar3.f11262iobyxmoadg.equals(obj)) {
        }
        zoijcleaowVar4 = zoijcleaowVar3;
        boolean zRibwqtqdhb2 = ribwqtqdhb(zIkoacuggdj, zoijcleaowVar3, j14, zoijcleaowVarKegysxyocb, cdpycssgdhVar.nufgyqmvbu(obj, zoijcleaowVar), j13);
        if (z19) {
            zoijcleaowVarKegysxyocb = zoijcleaowVar4;
        } else {
            zoijcleaowVarKegysxyocb = zoijcleaowVar4;
        }
        if (zoijcleaowVarKegysxyocb.zoijcleaow()) {
            if (zoijcleaowVarKegysxyocb.equals(zoijcleaowVar4)) {
                jLongValue = skhdrjzrfnVar.f11042kcexrzcfyt;
            } else {
                cdpycssgdhVar.nufgyqmvbu(zoijcleaowVarKegysxyocb.f11262iobyxmoadg, zoijcleaowVar);
                if (zoijcleaowVarKegysxyocb.f11263ppxfxbqfkf == zoijcleaowVar.gtknphoqwx(zoijcleaowVarKegysxyocb.f11265zoijcleaow)) {
                    jLongValue = zoijcleaowVar.lqeggnwhkg();
                } else {
                    jLongValue = 0;
                }
            }
        }
        return new lqeggnwhkg(zoijcleaowVarKegysxyocb, jLongValue, j13, z14, z15, z16);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0093 A[PHI: r2 r6 r8
      0x0093: PHI (r2v2 androidx.media3.exoplayer.source.oxmwwwfdhm$zoijcleaow) = 
      (r2v1 androidx.media3.exoplayer.source.oxmwwwfdhm$zoijcleaow)
      (r2v11 androidx.media3.exoplayer.source.oxmwwwfdhm$zoijcleaow)
     binds: [B:25:0x0068, B:27:0x008d] A[DONT_GENERATE, DONT_INLINE]
      0x0093: PHI (r6v3 long) = (r6v2 long), (r6v10 long) binds: [B:25:0x0068, B:27:0x008d] A[DONT_GENERATE, DONT_INLINE]
      0x0093: PHI (r8v2 long) = (r8v1 long), (r8v5 long) binds: [B:25:0x0068, B:27:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x00db A[PHI: r0
      0x00db: PHI (r0v11 v2.cdpycssgdh) = (r0v10 v2.cdpycssgdh), (r0v10 v2.cdpycssgdh), (r0v16 v2.cdpycssgdh), (r0v16 v2.cdpycssgdh) binds: [B:31:0x00a0, B:33:0x00a4, B:35:0x00b5, B:37:0x00cc] A[DONT_GENERATE, DONT_INLINE]] */
    private void fyldjkxazc(boolean z13, boolean z14, boolean z15, boolean z16) {
        boolean z17;
        v2.cdpycssgdh cdpycssgdhVar;
        androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar;
        this.f10980pmvmpeiblj.gtknphoqwx(2);
        this.f10948bfopjjpdmp = null;
        Y(false, true);
        this.f10992wwaezpbzkn.nufgyqmvbu();
        this.f10996ydmasvzmpa = 1000000000000L;
        try {
            lereixgezr();
        } catch (ExoPlaybackException | RuntimeException e13) {
            y2.kcexrzcfyt.wkgbmnqykc("ExoPlayerImplInternal", "Disable failed.", e13);
        }
        if (z13) {
            for (fiwbwshyhd fiwbwshyhdVar : this.f11000zdlpuopuiu) {
                try {
                    fiwbwshyhdVar.jpowsppfya();
                } catch (RuntimeException e14) {
                    y2.kcexrzcfyt.wkgbmnqykc("ExoPlayerImplInternal", "Reset failed.", e14);
                }
            }
        }
        this.f10989uwvvkdfqfp = 0;
        skhdrjzrfn skhdrjzrfnVar = this.f10984sopmlzcsov;
        androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar2 = skhdrjzrfnVar.f11053zoijcleaow;
        long jLongValue = skhdrjzrfnVar.f11042kcexrzcfyt;
        long j13 = (this.f10984sopmlzcsov.f11053zoijcleaow.zoijcleaow() || ikoacuggdj(this.f10984sopmlzcsov, this.f10995yadqdtsiqt)) ? this.f10984sopmlzcsov.f11047ppxfxbqfkf : this.f10984sopmlzcsov.f11042kcexrzcfyt;
        if (z14) {
            this.f10997yfnezrywwk = null;
            Pair pairPkzmftpjix = pkzmftpjix(this.f10984sopmlzcsov.f11041iobyxmoadg);
            zoijcleaowVar2 = (androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow) pairPkzmftpjix.first;
            jLongValue = ((Long) pairPkzmftpjix.second).longValue();
            j13 = -9223372036854775807L;
            z17 = zoijcleaowVar2.equals(this.f10984sopmlzcsov.f11053zoijcleaow) ? false : true;
        }
        long j14 = jLongValue;
        long j15 = j13;
        this.f10965jpowsppfya.lqeggnwhkg();
        this.f10977okpsazkaxt = false;
        v2.cdpycssgdh cdpycssgdhVarYadqdtsiqt = this.f10984sopmlzcsov.f11041iobyxmoadg;
        if (z15 && (cdpycssgdhVarYadqdtsiqt instanceof lxfrhoxuzk)) {
            cdpycssgdhVarYadqdtsiqt = ((lxfrhoxuzk) cdpycssgdhVarYadqdtsiqt).yadqdtsiqt(this.f10957hkdspvbjdz.vdvldrhtss());
            if (zoijcleaowVar2.f11265zoijcleaow != -1) {
                cdpycssgdhVarYadqdtsiqt.nufgyqmvbu(zoijcleaowVar2.f11262iobyxmoadg, this.f10995yadqdtsiqt);
                if (cdpycssgdhVarYadqdtsiqt.agtfadlqog(this.f10995yadqdtsiqt.f115304ppxfxbqfkf, this.f10949cdpycssgdh).gxszxtbevo()) {
                    cdpycssgdhVar = cdpycssgdhVarYadqdtsiqt;
                    zoijcleaowVar = new androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow(zoijcleaowVar2.f11262iobyxmoadg, zoijcleaowVar2.f11264wkgbmnqykc);
                } else {
                    cdpycssgdhVar = cdpycssgdhVarYadqdtsiqt;
                    zoijcleaowVar = zoijcleaowVar2;
                }
            } else {
                cdpycssgdhVar = cdpycssgdhVarYadqdtsiqt;
                zoijcleaowVar = zoijcleaowVar2;
            }
        } else {
            cdpycssgdhVar = cdpycssgdhVarYadqdtsiqt;
            zoijcleaowVar = zoijcleaowVar2;
        }
        skhdrjzrfn skhdrjzrfnVar2 = this.f10984sopmlzcsov;
        int i13 = skhdrjzrfnVar2.f11038eablkybsjg;
        ExoPlaybackException exoPlaybackException = z16 ? null : skhdrjzrfnVar2.f11040gxszxtbevo;
        m3.iwizpuwonk iwizpuwonkVar = z17 ? m3.iwizpuwonk.f65035wkgbmnqykc : skhdrjzrfnVar2.f11044nufgyqmvbu;
        o3.yadqdtsiqt yadqdtsiqtVar = z17 ? this.f10951cqumvgiudr : skhdrjzrfnVar2.f11037dxjokdxxww;
        List listZynmafqrjb = z17 ? com.google.common.collect.zdlpuopuiu.zynmafqrjb() : skhdrjzrfnVar2.f11035btonecajqb;
        skhdrjzrfn skhdrjzrfnVar3 = this.f10984sopmlzcsov;
        this.f10984sopmlzcsov = new skhdrjzrfn(cdpycssgdhVar, zoijcleaowVar, j15, j14, i13, exoPlaybackException, false, iwizpuwonkVar, yadqdtsiqtVar, listZynmafqrjb, zoijcleaowVar, skhdrjzrfnVar3.f11036draadjrbmk, skhdrjzrfnVar3.f11050wflxmlrfwp, skhdrjzrfnVar3.f11034agtfadlqog, skhdrjzrfnVar3.f11045ojitshcjhn, j14, 0L, j14, 0L, false);
        if (z15) {
            this.f10965jpowsppfya.cllcsxoeiz();
            this.f10957hkdspvbjdz.esjtqupxsv();
        }
    }

    private void g(long j13) {
        for (fiwbwshyhd fiwbwshyhdVar : this.f11000zdlpuopuiu) {
            fiwbwshyhdVar.cllcsxoeiz(j13);
        }
    }

    private void grlcpdaxtj(long j13) {
        yfnezrywwk yfnezrywwkVarYggfygwlhe = this.f10965jpowsppfya.yggfygwlhe();
        long jCdpycssgdh = yfnezrywwkVarYggfygwlhe == null ? j13 + 1000000000000L : yfnezrywwkVarYggfygwlhe.cdpycssgdh(j13);
        this.f10996ydmasvzmpa = jCdpycssgdh;
        this.f10992wwaezpbzkn.ppxfxbqfkf(jCdpycssgdh);
        for (fiwbwshyhd fiwbwshyhdVar : this.f11000zdlpuopuiu) {
            fiwbwshyhdVar.hkdspvbjdz(yfnezrywwkVarYggfygwlhe, this.f10996ydmasvzmpa);
        }
        roivzttewh();
    }

    private long hkdspvbjdz(long j13) {
        yfnezrywwk yfnezrywwkVarAgtfadlqog = this.f10965jpowsppfya.agtfadlqog();
        if (yfnezrywwkVarAgtfadlqog == null) {
            return 0L;
        }
        return Math.max(0L, j13 - yfnezrywwkVarAgtfadlqog.istkbnxepw(this.f10996ydmasvzmpa));
    }

    private void hszhottldk(int i13, int i14, m3.kcexrzcfyt kcexrzcfytVar) throws Throwable {
        this.f10952crxdokpmqz.zoijcleaow(1);
        mbcevpiqjq(this.f10957hkdspvbjdz.pmvmpeiblj(i13, i14, kcexrzcfytVar), false);
    }

    private void i(v2.ppxfxbqfkf ppxfxbqfkfVar, boolean z13) {
        this.f10961iwizpuwonk.draadjrbmk(ppxfxbqfkfVar);
        androidx.media3.exoplayer.lqeggnwhkg lqeggnwhkgVar = this.f10974ntlheqmsrt;
        if (!z13) {
            ppxfxbqfkfVar = null;
        }
        lqeggnwhkgVar.draadjrbmk(ppxfxbqfkfVar);
        S();
    }

    private static boolean ikoacuggdj(skhdrjzrfn skhdrjzrfnVar, v2.cdpycssgdh.zoijcleaow zoijcleaowVar) {
        androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar2 = skhdrjzrfnVar.f11053zoijcleaow;
        v2.cdpycssgdh cdpycssgdhVar = skhdrjzrfnVar.f11041iobyxmoadg;
        return cdpycssgdhVar.vdvldrhtss() || cdpycssgdhVar.nufgyqmvbu(zoijcleaowVar2.f11262iobyxmoadg, zoijcleaowVar).f115301gxszxtbevo;
    }

    private com.google.common.collect.zdlpuopuiu iozdgvuglv(o3.esjtqupxsv[] esjtqupxsvVarArr) {
        com.google.common.collect.zdlpuopuiu.iobyxmoadg iobyxmoadgVar = new com.google.common.collect.zdlpuopuiu.iobyxmoadg();
        boolean z13 = false;
        for (o3.esjtqupxsv esjtqupxsvVar : esjtqupxsvVarArr) {
            if (esjtqupxsvVar != null) {
                v2.jyumaefscl jyumaefsclVar = esjtqupxsvVar.zoijcleaow(0).f9749draadjrbmk;
                if (jyumaefsclVar == null) {
                    iobyxmoadgVar.iobyxmoadg(new v2.jyumaefscl(new v2.jyumaefscl.iobyxmoadg[0]));
                } else {
                    iobyxmoadgVar.iobyxmoadg(jyumaefsclVar);
                    z13 = true;
                }
            }
        }
        return z13 ? iobyxmoadgVar.gtknphoqwx() : com.google.common.collect.zdlpuopuiu.zynmafqrjb();
    }

    private void ipoelvxyzq() {
        yfnezrywwk yfnezrywwkVarYggfygwlhe = this.f10965jpowsppfya.yggfygwlhe();
        this.f10990vipkmwdibw = yfnezrywwkVarYggfygwlhe != null && yfnezrywwkVarYggfygwlhe.f11644nufgyqmvbu.f11626dxjokdxxww && this.f10981ribwqtqdhb;
    }

    private void istkbnxepw() throws ExoPlaybackException {
        cdpycssgdh(new boolean[this.f11000zdlpuopuiu.length], this.f10965jpowsppfya.esjtqupxsv().agtfadlqog());
    }

    private void iwizpuwonk(igdgnonuha igdgnonuhaVar) {
        if (igdgnonuhaVar.dxjokdxxww()) {
            return;
        }
        try {
            igdgnonuhaVar.gxszxtbevo().cqumvgiudr(igdgnonuhaVar.nufgyqmvbu(), igdgnonuhaVar.wkgbmnqykc());
        } finally {
            igdgnonuhaVar.btonecajqb(true);
        }
    }

    private static boolean ixidwrxhsl(wkgbmnqykc wkgbmnqykcVar, v2.cdpycssgdh cdpycssgdhVar, v2.cdpycssgdh cdpycssgdhVar2, int i13, boolean z13, v2.cdpycssgdh.ppxfxbqfkf ppxfxbqfkfVar, v2.cdpycssgdh.zoijcleaow zoijcleaowVar) {
        Object obj = wkgbmnqykcVar.f11019iwizpuwonk;
        if (obj == null) {
            Pair pairEzmngbhpjk = ezmngbhpjk(cdpycssgdhVar, new nufgyqmvbu(wkgbmnqykcVar.f11022zdlpuopuiu.lqeggnwhkg(), wkgbmnqykcVar.f11022zdlpuopuiu.ppxfxbqfkf(), wkgbmnqykcVar.f11022zdlpuopuiu.eablkybsjg() == Long.MIN_VALUE ? -9223372036854775807L : y2.stevsuqkhv.ixidwrxhsl(wkgbmnqykcVar.f11022zdlpuopuiu.eablkybsjg())), false, i13, z13, ppxfxbqfkfVar, zoijcleaowVar);
            if (pairEzmngbhpjk == null) {
                return false;
            }
            wkgbmnqykcVar.zoijcleaow(cdpycssgdhVar.zoijcleaow(pairEzmngbhpjk.first), ((Long) pairEzmngbhpjk.second).longValue(), pairEzmngbhpjk.first);
            if (wkgbmnqykcVar.f11022zdlpuopuiu.eablkybsjg() == Long.MIN_VALUE) {
                mhtqkkgtqm(cdpycssgdhVar, wkgbmnqykcVar, ppxfxbqfkfVar, zoijcleaowVar);
            }
            return true;
        }
        int iZoijcleaow = cdpycssgdhVar.zoijcleaow(obj);
        if (iZoijcleaow == -1) {
            return false;
        }
        if (wkgbmnqykcVar.f11022zdlpuopuiu.eablkybsjg() == Long.MIN_VALUE) {
            mhtqkkgtqm(cdpycssgdhVar, wkgbmnqykcVar, ppxfxbqfkfVar, zoijcleaowVar);
            return true;
        }
        wkgbmnqykcVar.f11021yggfygwlhe = iZoijcleaow;
        cdpycssgdhVar2.nufgyqmvbu(wkgbmnqykcVar.f11019iwizpuwonk, zoijcleaowVar);
        if (zoijcleaowVar.f115301gxszxtbevo && cdpycssgdhVar2.agtfadlqog(zoijcleaowVar.f115304ppxfxbqfkf, ppxfxbqfkfVar).f115279agtfadlqog == cdpycssgdhVar2.zoijcleaow(wkgbmnqykcVar.f11019iwizpuwonk)) {
            Pair pairBtonecajqb = cdpycssgdhVar.btonecajqb(ppxfxbqfkfVar, zoijcleaowVar, cdpycssgdhVar.nufgyqmvbu(wkgbmnqykcVar.f11019iwizpuwonk, zoijcleaowVar).f115304ppxfxbqfkf, wkgbmnqykcVar.f11020jyumaefscl + zoijcleaowVar.agtfadlqog());
            wkgbmnqykcVar.zoijcleaow(cdpycssgdhVar.zoijcleaow(pairBtonecajqb.first), ((Long) pairBtonecajqb.second).longValue(), pairBtonecajqb.first);
        }
        return true;
    }

    private void iyctptxqzt(boolean z13) {
        if (this.f10991weqkydbzbr.f10037iobyxmoadg == -9223372036854775807L) {
            return;
        }
        if (z13 || !this.f10984sopmlzcsov.f11041iobyxmoadg.equals(this.f10971lrnfpwlwnk)) {
            v2.cdpycssgdh cdpycssgdhVar = this.f10984sopmlzcsov.f11041iobyxmoadg;
            this.f10971lrnfpwlwnk = cdpycssgdhVar;
            this.f10965jpowsppfya.zynmafqrjb(cdpycssgdhVar);
        }
        rlfsiqarku();
    }

    private void j(boolean z13, AtomicBoolean atomicBoolean) {
        if (this.f10973metgxyhuhe != z13) {
            this.f10973metgxyhuhe = z13;
            if (!z13) {
                for (fiwbwshyhd fiwbwshyhdVar : this.f11000zdlpuopuiu) {
                    fiwbwshyhdVar.jpowsppfya();
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    private boolean jhduphickx() {
        yfnezrywwk yfnezrywwkVarYggfygwlhe = this.f10965jpowsppfya.yggfygwlhe();
        long j13 = yfnezrywwkVarYggfygwlhe.f11644nufgyqmvbu.f11627eablkybsjg;
        return yfnezrywwkVarYggfygwlhe.f11641gxszxtbevo && (j13 == -9223372036854775807L || this.f10984sopmlzcsov.f11042kcexrzcfyt < j13 || !G());
    }

    private boolean jlmebxxoox() {
        yfnezrywwk yfnezrywwkVarEsjtqupxsv = this.f10965jpowsppfya.esjtqupxsv();
        if (!yfnezrywwkVarEsjtqupxsv.f11641gxszxtbevo) {
            return false;
        }
        int i13 = 0;
        while (true) {
            fiwbwshyhd[] fiwbwshyhdVarArr = this.f11000zdlpuopuiu;
            if (i13 >= fiwbwshyhdVarArr.length) {
                return true;
            }
            if (!fiwbwshyhdVarArr[i13].ojitshcjhn(yfnezrywwkVarEsjtqupxsv)) {
                return false;
            }
            i13++;
        }
    }

    private long jpowsppfya() {
        return hkdspvbjdz(this.f10984sopmlzcsov.f11049vdvldrhtss);
    }

    private void jrbgnlbqoe(v2.cdpycssgdh cdpycssgdhVar, v2.cdpycssgdh cdpycssgdhVar2) {
        if (cdpycssgdhVar.vdvldrhtss() && cdpycssgdhVar2.vdvldrhtss()) {
            return;
        }
        for (int size = this.f10999ylkuphrtab.size() - 1; size >= 0; size--) {
            if (!ixidwrxhsl((wkgbmnqykc) this.f10999ylkuphrtab.get(size), cdpycssgdhVar, cdpycssgdhVar2, this.f10967jztzpxfvev, this.f10994xrmfcynszj, this.f10949cdpycssgdh, this.f10995yadqdtsiqt)) {
                ((wkgbmnqykc) this.f10999ylkuphrtab.get(size)).f11022zdlpuopuiu.btonecajqb(false);
                this.f10999ylkuphrtab.remove(size);
            }
        }
        Collections.sort(this.f10999ylkuphrtab);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public yfnezrywwk jyumaefscl(ydmasvzmpa ydmasvzmpaVar, long j13) {
        return new yfnezrywwk(this.f10998yggfygwlhe, j13, this.f10961iwizpuwonk, this.f10955esjtqupxsv.lqeggnwhkg(), this.f10957hkdspvbjdz, ydmasvzmpaVar, this.f10951cqumvgiudr, this.f10991weqkydbzbr.f10037iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean jztzpxfvev() {
        return Boolean.valueOf(this.f10964jlmebxxoox);
    }

    private void k(v2.cqumvgiudr cqumvgiudrVar) {
        this.f10980pmvmpeiblj.gtknphoqwx(16);
        this.f10992wwaezpbzkn.eablkybsjg(cqumvgiudrVar);
    }

    private void kcexrzcfyt() {
        o3.yadqdtsiqt yadqdtsiqtVarRgvfuqvkyq = this.f10965jpowsppfya.yggfygwlhe().rgvfuqvkyq();
        for (int i13 = 0; i13 < this.f11000zdlpuopuiu.length; i13++) {
            if (yadqdtsiqtVarRgvfuqvkyq.ppxfxbqfkf(i13)) {
                this.f11000zdlpuopuiu[i13].gxszxtbevo();
            }
        }
    }

    private void kegysxyocb(boolean z13) {
        yfnezrywwk yfnezrywwkVarAgtfadlqog = this.f10965jpowsppfya.agtfadlqog();
        androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar = yfnezrywwkVarAgtfadlqog == null ? this.f10984sopmlzcsov.f11053zoijcleaow : yfnezrywwkVarAgtfadlqog.f11644nufgyqmvbu.f11629iobyxmoadg;
        boolean zEquals = this.f10984sopmlzcsov.f11039gtknphoqwx.equals(zoijcleaowVar);
        if (!zEquals) {
            this.f10984sopmlzcsov = this.f10984sopmlzcsov.ppxfxbqfkf(zoijcleaowVar);
        }
        skhdrjzrfn skhdrjzrfnVar = this.f10984sopmlzcsov;
        skhdrjzrfnVar.f11049vdvldrhtss = yfnezrywwkVarAgtfadlqog == null ? skhdrjzrfnVar.f11042kcexrzcfyt : yfnezrywwkVarAgtfadlqog.btonecajqb();
        this.f10984sopmlzcsov.f11046oxmwwwfdhm = jpowsppfya();
        if ((!zEquals || z13) && yfnezrywwkVarAgtfadlqog != null && yfnezrywwkVarAgtfadlqog.f11641gxszxtbevo) {
            O(yfnezrywwkVarAgtfadlqog.f11644nufgyqmvbu.f11629iobyxmoadg, yfnezrywwkVarAgtfadlqog.ojitshcjhn(), yfnezrywwkVarAgtfadlqog.rgvfuqvkyq());
        }
    }

    private void krqnebusok(boolean z13) throws ExoPlaybackException {
        androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar = this.f10965jpowsppfya.yggfygwlhe().f11644nufgyqmvbu.f11629iobyxmoadg;
        long jC = c(zoijcleaowVar, this.f10984sopmlzcsov.f11042kcexrzcfyt, true, false);
        if (jC != this.f10984sopmlzcsov.f11042kcexrzcfyt) {
            skhdrjzrfn skhdrjzrfnVar = this.f10984sopmlzcsov;
            this.f10984sopmlzcsov = crxdokpmqz(zoijcleaowVar, jC, skhdrjzrfnVar.f11047ppxfxbqfkf, skhdrjzrfnVar.f11051wkgbmnqykc, z13, 5);
        }
    }

    private void l(zoijcleaow zoijcleaowVar) throws Throwable {
        this.f10952crxdokpmqz.zoijcleaow(1);
        if (zoijcleaowVar.f11024ppxfxbqfkf != -1) {
            this.f10997yfnezrywwk = new nufgyqmvbu(new lxfrhoxuzk(zoijcleaowVar.f11023iobyxmoadg, zoijcleaowVar.f11026zoijcleaow), zoijcleaowVar.f11024ppxfxbqfkf, zoijcleaowVar.f11025wkgbmnqykc);
        }
        mbcevpiqjq(this.f10957hkdspvbjdz.istkbnxepw(zoijcleaowVar.f11023iobyxmoadg, zoijcleaowVar.f11026zoijcleaow), false);
    }

    private void lereixgezr() {
        for (int i13 = 0; i13 < this.f11000zdlpuopuiu.length; i13++) {
            esjtqupxsv(i13);
        }
        this.f11001zeieaojujs = -9223372036854775807L;
    }

    private long lmojexxdyd() {
        skhdrjzrfn skhdrjzrfnVar = this.f10984sopmlzcsov;
        return wwaezpbzkn(skhdrjzrfnVar.f11041iobyxmoadg, skhdrjzrfnVar.f11053zoijcleaow.f11262iobyxmoadg, skhdrjzrfnVar.f11042kcexrzcfyt);
    }

    private void lrnfpwlwnk() {
        yfnezrywwk yfnezrywwkVarEsjtqupxsv = this.f10965jpowsppfya.esjtqupxsv();
        if (yfnezrywwkVarEsjtqupxsv == null) {
            return;
        }
        int i13 = 0;
        if (yfnezrywwkVarEsjtqupxsv.gtknphoqwx() == null || this.f10990vipkmwdibw) {
            if (yfnezrywwkVarEsjtqupxsv.f11644nufgyqmvbu.f11625btonecajqb || this.f10990vipkmwdibw) {
                fiwbwshyhd[] fiwbwshyhdVarArr = this.f11000zdlpuopuiu;
                int length = fiwbwshyhdVarArr.length;
                while (i13 < length) {
                    fiwbwshyhd fiwbwshyhdVar = fiwbwshyhdVarArr[i13];
                    if (fiwbwshyhdVar.iwizpuwonk(yfnezrywwkVarEsjtqupxsv) && fiwbwshyhdVar.oxmwwwfdhm(yfnezrywwkVarEsjtqupxsv)) {
                        long j13 = yfnezrywwkVarEsjtqupxsv.f11644nufgyqmvbu.f11627eablkybsjg;
                        fiwbwshyhdVar.dsvhmnatus(yfnezrywwkVarEsjtqupxsv, (j13 == -9223372036854775807L || j13 == Long.MIN_VALUE) ? -9223372036854775807L : yfnezrywwkVarEsjtqupxsv.wflxmlrfwp() + yfnezrywwkVarEsjtqupxsv.f11644nufgyqmvbu.f11627eablkybsjg);
                    }
                    i13++;
                }
                return;
            }
            return;
        }
        if (jlmebxxoox()) {
            if (zdlpuopuiu() && this.f10965jpowsppfya.cqumvgiudr() == this.f10965jpowsppfya.esjtqupxsv()) {
                return;
            }
            if (yfnezrywwkVarEsjtqupxsv.gtknphoqwx().f11641gxszxtbevo || this.f10996ydmasvzmpa >= yfnezrywwkVarEsjtqupxsv.gtknphoqwx().agtfadlqog()) {
                o3.yadqdtsiqt yadqdtsiqtVarRgvfuqvkyq = yfnezrywwkVarEsjtqupxsv.rgvfuqvkyq();
                yfnezrywwk yfnezrywwkVarWkgbmnqykc = this.f10965jpowsppfya.wkgbmnqykc();
                o3.yadqdtsiqt yadqdtsiqtVarRgvfuqvkyq2 = yfnezrywwkVarWkgbmnqykc.rgvfuqvkyq();
                v2.cdpycssgdh cdpycssgdhVar = this.f10984sopmlzcsov.f11041iobyxmoadg;
                W(cdpycssgdhVar, yfnezrywwkVarWkgbmnqykc.f11644nufgyqmvbu.f11629iobyxmoadg, cdpycssgdhVar, yfnezrywwkVarEsjtqupxsv.f11644nufgyqmvbu.f11629iobyxmoadg, -9223372036854775807L, false);
                if (yfnezrywwkVarWkgbmnqykc.f11641gxszxtbevo && ((this.f10972mbcevpiqjq && this.f11001zeieaojujs != -9223372036854775807L) || yfnezrywwkVarWkgbmnqykc.f11642iobyxmoadg.btonecajqb() != -9223372036854775807L)) {
                    this.f11001zeieaojujs = -9223372036854775807L;
                    boolean z13 = this.f10972mbcevpiqjq && !this.f10975nuxfzjnpeb;
                    if (z13) {
                        for (int i14 = 0; i14 < this.f11000zdlpuopuiu.length; i14++) {
                            if (yadqdtsiqtVarRgvfuqvkyq2.ppxfxbqfkf(i14) && !v2.iwizpuwonk.iobyxmoadg(yadqdtsiqtVarRgvfuqvkyq2.f71903ppxfxbqfkf[i14].draadjrbmk().f9769ojitshcjhn, yadqdtsiqtVarRgvfuqvkyq2.f71903ppxfxbqfkf[i14].draadjrbmk().f9754gtknphoqwx) && !this.f11000zdlpuopuiu[i14].yggfygwlhe()) {
                                z13 = false;
                                break;
                            }
                        }
                    }
                    if (!z13) {
                        g(yfnezrywwkVarWkgbmnqykc.agtfadlqog());
                        if (yfnezrywwkVarWkgbmnqykc.kcexrzcfyt()) {
                            return;
                        }
                        this.f10965jpowsppfya.dsvhmnatus(yfnezrywwkVarWkgbmnqykc);
                        kegysxyocb(false);
                        metgxyhuhe();
                        return;
                    }
                }
                fiwbwshyhd[] fiwbwshyhdVarArr2 = this.f11000zdlpuopuiu;
                int length2 = fiwbwshyhdVarArr2.length;
                while (i13 < length2) {
                    fiwbwshyhdVarArr2[i13].iozdgvuglv(yadqdtsiqtVarRgvfuqvkyq, yadqdtsiqtVarRgvfuqvkyq2, yfnezrywwkVarWkgbmnqykc.agtfadlqog());
                    i13++;
                }
            }
        }
    }

    private void lxfrhoxuzk() {
        try {
            fyldjkxazc(true, false, true, false);
            wizcaqwiak();
            this.f10955esjtqupxsv.eablkybsjg(this.f10993wypolnanlu);
            this.f10974ntlheqmsrt.dxjokdxxww();
            this.f10961iwizpuwonk.btonecajqb();
            A(1);
            this.f11003zynmafqrjb.zoijcleaow();
            synchronized (this) {
                this.f10964jlmebxxoox = true;
                notifyAll();
            }
        } catch (Throwable th2) {
            this.f11003zynmafqrjb.zoijcleaow();
            synchronized (this) {
                this.f10964jlmebxxoox = true;
                notifyAll();
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:106:0x01df  */
    /* JADX WARN: Code duplicated, block: B:110:0x0207  */
    /* JADX WARN: Code duplicated, block: B:89:0x019c  */
    /* JADX WARN: Code duplicated, block: B:90:0x019e  */
    /* JADX WARN: Code duplicated, block: B:95:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:97:0x01bf A[ADDED_TO_REGION] */
    private void mbcevpiqjq(v2.cdpycssgdh cdpycssgdhVar, boolean z13) throws Throwable {
        int i13;
        nufgyqmvbu nufgyqmvbuVar;
        long j13;
        nufgyqmvbu nufgyqmvbuVar2;
        boolean z14;
        int i14;
        boolean z15;
        long j14;
        long jB;
        lqeggnwhkg lqeggnwhkgVarFmlbqenlif = fmlbqenlif(cdpycssgdhVar, this.f10984sopmlzcsov, this.f10997yfnezrywwk, this.f10965jpowsppfya, this.f10967jztzpxfvev, this.f10994xrmfcynszj, this.f10949cdpycssgdh, this.f10995yadqdtsiqt);
        androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar = lqeggnwhkgVarFmlbqenlif.f11012iobyxmoadg;
        long j15 = lqeggnwhkgVarFmlbqenlif.f11013ppxfxbqfkf;
        boolean z16 = lqeggnwhkgVarFmlbqenlif.f11014wkgbmnqykc;
        long j16 = lqeggnwhkgVarFmlbqenlif.f11015zoijcleaow;
        boolean z17 = (this.f10984sopmlzcsov.f11053zoijcleaow.equals(zoijcleaowVar) && j16 == this.f10984sopmlzcsov.f11042kcexrzcfyt) ? false : true;
        try {
            if (lqeggnwhkgVarFmlbqenlif.f11010eablkybsjg) {
                if (this.f10984sopmlzcsov.f11038eablkybsjg != 1) {
                    A(4);
                }
                fyldjkxazc(false, false, false, true);
            }
            try {
                for (fiwbwshyhd fiwbwshyhdVar : this.f11000zdlpuopuiu) {
                    fiwbwshyhdVar.kegysxyocb(cdpycssgdhVar);
                }
                try {
                    if (z17) {
                        z15 = false;
                        j14 = j15;
                        i14 = 4;
                        jB = j16;
                        if (!cdpycssgdhVar.vdvldrhtss()) {
                            for (yfnezrywwk yfnezrywwkVarYggfygwlhe = this.f10965jpowsppfya.yggfygwlhe(); yfnezrywwkVarYggfygwlhe != null; yfnezrywwkVarYggfygwlhe = yfnezrywwkVarYggfygwlhe.gtknphoqwx()) {
                                if (yfnezrywwkVarYggfygwlhe.f11644nufgyqmvbu.f11629iobyxmoadg.equals(zoijcleaowVar)) {
                                    yfnezrywwkVarYggfygwlhe.f11644nufgyqmvbu = this.f10965jpowsppfya.lereixgezr(cdpycssgdhVar, yfnezrywwkVarYggfygwlhe.f11644nufgyqmvbu);
                                    yfnezrywwkVarYggfygwlhe.yadqdtsiqt();
                                }
                            }
                            jB = b(zoijcleaowVar, jB, z16);
                        }
                    } else {
                        try {
                            i14 = 4;
                            z15 = false;
                            j14 = j15;
                            jB = j16;
                            int iCrxdokpmqz = this.f10965jpowsppfya.crxdokpmqz(cdpycssgdhVar, this.f10996ydmasvzmpa, this.f10965jpowsppfya.esjtqupxsv() == null ? 0L : ylkuphrtab(this.f10965jpowsppfya.esjtqupxsv()), (!zdlpuopuiu() || this.f10965jpowsppfya.cqumvgiudr() == null) ? 0L : ylkuphrtab(this.f10965jpowsppfya.cqumvgiudr()));
                            if ((iCrxdokpmqz & 1) != 0) {
                                krqnebusok(false);
                            } else if ((iCrxdokpmqz & 2) != 0) {
                                cqumvgiudr();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            j15 = j15;
                            i13 = 4;
                            j15 = j16;
                            nufgyqmvbuVar = null;
                            skhdrjzrfn skhdrjzrfnVar = this.f10984sopmlzcsov;
                            v2.cdpycssgdh cdpycssgdhVar2 = skhdrjzrfnVar.f11041iobyxmoadg;
                            androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar2 = skhdrjzrfnVar.f11053zoijcleaow;
                            if (lqeggnwhkgVarFmlbqenlif.f11011gxszxtbevo) {
                                j13 = j15;
                            } else {
                                j13 = -9223372036854775807L;
                            }
                            nufgyqmvbuVar2 = nufgyqmvbuVar;
                            W(cdpycssgdhVar, zoijcleaowVar, cdpycssgdhVar2, zoijcleaowVar2, j13, false);
                            if (z17 || j15 != this.f10984sopmlzcsov.f11047ppxfxbqfkf) {
                                skhdrjzrfn skhdrjzrfnVar2 = this.f10984sopmlzcsov;
                                Object obj = skhdrjzrfnVar2.f11053zoijcleaow.f11262iobyxmoadg;
                                v2.cdpycssgdh cdpycssgdhVar3 = skhdrjzrfnVar2.f11041iobyxmoadg;
                                if (z17 || !z13 || cdpycssgdhVar3.vdvldrhtss() || cdpycssgdhVar3.nufgyqmvbu(obj, this.f10995yadqdtsiqt).f115301gxszxtbevo) {
                                    z14 = false;
                                } else {
                                    z14 = true;
                                }
                                this.f10984sopmlzcsov = crxdokpmqz(zoijcleaowVar, j15, j15, this.f10984sopmlzcsov.f11051wkgbmnqykc, z14, cdpycssgdhVar.zoijcleaow(obj) == -1 ? i13 : 3);
                            }
                            ipoelvxyzq();
                            jrbgnlbqoe(cdpycssgdhVar, this.f10984sopmlzcsov.f11041iobyxmoadg);
                            this.f10984sopmlzcsov = this.f10984sopmlzcsov.btonecajqb(cdpycssgdhVar);
                            if (!cdpycssgdhVar.vdvldrhtss()) {
                                this.f10997yfnezrywwk = nufgyqmvbuVar2;
                            }
                            kegysxyocb(false);
                            this.f10980pmvmpeiblj.nufgyqmvbu(2);
                            throw th;
                        }
                    }
                    skhdrjzrfn skhdrjzrfnVar3 = this.f10984sopmlzcsov;
                    W(cdpycssgdhVar, zoijcleaowVar, skhdrjzrfnVar3.f11041iobyxmoadg, skhdrjzrfnVar3.f11053zoijcleaow, lqeggnwhkgVarFmlbqenlif.f11011gxszxtbevo ? jB : -9223372036854775807L, false);
                    if (z17 || j14 != this.f10984sopmlzcsov.f11047ppxfxbqfkf) {
                        skhdrjzrfn skhdrjzrfnVar4 = this.f10984sopmlzcsov;
                        Object obj2 = skhdrjzrfnVar4.f11053zoijcleaow.f11262iobyxmoadg;
                        v2.cdpycssgdh cdpycssgdhVar4 = skhdrjzrfnVar4.f11041iobyxmoadg;
                        this.f10984sopmlzcsov = crxdokpmqz(zoijcleaowVar, jB, j14, this.f10984sopmlzcsov.f11051wkgbmnqykc, (!z17 || !z13 || cdpycssgdhVar4.vdvldrhtss() || cdpycssgdhVar4.nufgyqmvbu(obj2, this.f10995yadqdtsiqt).f115301gxszxtbevo) ? z15 : true, cdpycssgdhVar.zoijcleaow(obj2) == -1 ? i14 : 3);
                    }
                    ipoelvxyzq();
                    jrbgnlbqoe(cdpycssgdhVar, this.f10984sopmlzcsov.f11041iobyxmoadg);
                    this.f10984sopmlzcsov = this.f10984sopmlzcsov.btonecajqb(cdpycssgdhVar);
                    if (!cdpycssgdhVar.vdvldrhtss()) {
                        this.f10997yfnezrywwk = null;
                    }
                    kegysxyocb(z15);
                    this.f10980pmvmpeiblj.nufgyqmvbu(2);
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                i13 = 4;
                j15 = j16;
                nufgyqmvbuVar = null;
                skhdrjzrfn skhdrjzrfnVar5 = this.f10984sopmlzcsov;
                v2.cdpycssgdh cdpycssgdhVar5 = skhdrjzrfnVar5.f11041iobyxmoadg;
                androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar3 = skhdrjzrfnVar5.f11053zoijcleaow;
                if (lqeggnwhkgVarFmlbqenlif.f11011gxszxtbevo) {
                    j13 = j15;
                } else {
                    j13 = -9223372036854775807L;
                }
                nufgyqmvbuVar2 = nufgyqmvbuVar;
                W(cdpycssgdhVar, zoijcleaowVar, cdpycssgdhVar5, zoijcleaowVar3, j13, false);
                if (z17) {
                    skhdrjzrfn skhdrjzrfnVar6 = this.f10984sopmlzcsov;
                    Object obj3 = skhdrjzrfnVar6.f11053zoijcleaow.f11262iobyxmoadg;
                    v2.cdpycssgdh cdpycssgdhVar6 = skhdrjzrfnVar6.f11041iobyxmoadg;
                    if (z17) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    this.f10984sopmlzcsov = crxdokpmqz(zoijcleaowVar, j15, j15, this.f10984sopmlzcsov.f11051wkgbmnqykc, z14, cdpycssgdhVar.zoijcleaow(obj3) == -1 ? i13 : 3);
                } else {
                    skhdrjzrfn skhdrjzrfnVar7 = this.f10984sopmlzcsov;
                    Object obj4 = skhdrjzrfnVar7.f11053zoijcleaow.f11262iobyxmoadg;
                    v2.cdpycssgdh cdpycssgdhVar7 = skhdrjzrfnVar7.f11041iobyxmoadg;
                    if (z17) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    this.f10984sopmlzcsov = crxdokpmqz(zoijcleaowVar, j15, j15, this.f10984sopmlzcsov.f11051wkgbmnqykc, z14, cdpycssgdhVar.zoijcleaow(obj4) == -1 ? i13 : 3);
                }
                ipoelvxyzq();
                jrbgnlbqoe(cdpycssgdhVar, this.f10984sopmlzcsov.f11041iobyxmoadg);
                this.f10984sopmlzcsov = this.f10984sopmlzcsov.btonecajqb(cdpycssgdhVar);
                if (!cdpycssgdhVar.vdvldrhtss()) {
                    this.f10997yfnezrywwk = nufgyqmvbuVar2;
                }
                kegysxyocb(false);
                this.f10980pmvmpeiblj.nufgyqmvbu(2);
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            i13 = 4;
        }
    }

    private void metgxyhuhe() {
        boolean zF = F();
        this.f10977okpsazkaxt = zF;
        if (zF) {
            yfnezrywwk yfnezrywwkVar = (yfnezrywwk) y2.iobyxmoadg.eablkybsjg(this.f10965jpowsppfya.agtfadlqog());
            yfnezrywwkVar.eablkybsjg(new uwvvkdfqfp.zoijcleaow().gxszxtbevo(yfnezrywwkVar.istkbnxepw(this.f10996ydmasvzmpa)).lqeggnwhkg(this.f10992wwaezpbzkn.lqeggnwhkg().f115310iobyxmoadg).eablkybsjg(this.f10958ikoacuggdj).wkgbmnqykc());
        }
        N();
    }

    private static void mhtqkkgtqm(v2.cdpycssgdh cdpycssgdhVar, wkgbmnqykc wkgbmnqykcVar, v2.cdpycssgdh.ppxfxbqfkf ppxfxbqfkfVar, v2.cdpycssgdh.zoijcleaow zoijcleaowVar) {
        int i13 = cdpycssgdhVar.agtfadlqog(cdpycssgdhVar.nufgyqmvbu(wkgbmnqykcVar.f11019iwizpuwonk, zoijcleaowVar).f115304ppxfxbqfkf, ppxfxbqfkfVar).f115289ojitshcjhn;
        Object obj = cdpycssgdhVar.lqeggnwhkg(i13, zoijcleaowVar, true).f115306zoijcleaow;
        long j13 = zoijcleaowVar.f115305wkgbmnqykc;
        wkgbmnqykcVar.zoijcleaow(i13, j13 != -9223372036854775807L ? j13 - 1 : Long.MAX_VALUE, obj);
    }

    private void n(boolean z13) {
        if (z13 == this.f10953czzsidtyhn) {
            return;
        }
        this.f10953czzsidtyhn = z13;
        if (z13 || !this.f10984sopmlzcsov.f11048rgvfuqvkyq) {
            return;
        }
        this.f10980pmvmpeiblj.nufgyqmvbu(2);
    }

    private void ntlheqmsrt(androidx.media3.exoplayer.source.vdvldrhtss vdvldrhtssVar) throws ExoPlaybackException {
        if (this.f10965jpowsppfya.iozdgvuglv(vdvldrhtssVar)) {
            tzroggbefp((yfnezrywwk) y2.iobyxmoadg.eablkybsjg(this.f10965jpowsppfya.agtfadlqog()));
            return;
        }
        yfnezrywwk yfnezrywwkVarJyumaefscl = this.f10965jpowsppfya.jyumaefscl(vdvldrhtssVar);
        if (yfnezrywwkVarJyumaefscl != null) {
            y2.iobyxmoadg.lqeggnwhkg(!yfnezrywwkVarJyumaefscl.f11641gxszxtbevo);
            float f13 = this.f10992wwaezpbzkn.lqeggnwhkg().f115310iobyxmoadg;
            skhdrjzrfn skhdrjzrfnVar = this.f10984sopmlzcsov;
            yfnezrywwkVarJyumaefscl.vdvldrhtss(f13, skhdrjzrfnVar.f11041iobyxmoadg, skhdrjzrfnVar.f11036draadjrbmk);
            if (this.f10965jpowsppfya.lmojexxdyd(vdvldrhtssVar)) {
                rlfsiqarku();
            }
        }
    }

    private void nuxfzjnpeb() throws Throwable {
        mbcevpiqjq(this.f10957hkdspvbjdz.dxjokdxxww(), true);
    }

    private void o(boolean z13) throws ExoPlaybackException {
        this.f10981ribwqtqdhb = z13;
        ipoelvxyzq();
        if (!this.f10990vipkmwdibw || this.f10965jpowsppfya.esjtqupxsv() == this.f10965jpowsppfya.yggfygwlhe()) {
            return;
        }
        krqnebusok(true);
        kegysxyocb(false);
    }

    private boolean oipsdeybqn() {
        ydmasvzmpa ydmasvzmpaVarZdlpuopuiu;
        this.f10965jpowsppfya.jpowsppfya(this.f10996ydmasvzmpa);
        boolean z13 = false;
        if (this.f10965jpowsppfya.ntlheqmsrt() && (ydmasvzmpaVarZdlpuopuiu = this.f10965jpowsppfya.zdlpuopuiu(this.f10996ydmasvzmpa, this.f10984sopmlzcsov)) != null) {
            yfnezrywwk yfnezrywwkVarNufgyqmvbu = this.f10965jpowsppfya.nufgyqmvbu(ydmasvzmpaVarZdlpuopuiu);
            if (!yfnezrywwkVarNufgyqmvbu.f11639eablkybsjg) {
                yfnezrywwkVarNufgyqmvbu.jyumaefscl(this, ydmasvzmpaVarZdlpuopuiu.f11634zoijcleaow);
            } else if (yfnezrywwkVarNufgyqmvbu.f11641gxszxtbevo) {
                this.f10980pmvmpeiblj.wkgbmnqykc(8, yfnezrywwkVarNufgyqmvbu.f11642iobyxmoadg).iobyxmoadg();
            }
            if (this.f10965jpowsppfya.yggfygwlhe() == yfnezrywwkVarNufgyqmvbu) {
                grlcpdaxtj(ydmasvzmpaVarZdlpuopuiu.f11634zoijcleaow);
            }
            kegysxyocb(false);
            z13 = true;
        }
        if (this.f10977okpsazkaxt) {
            this.f10977okpsazkaxt = vipkmwdibw(this.f10965jpowsppfya.agtfadlqog());
            N();
        } else {
            metgxyhuhe();
        }
        return z13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void okpsazkaxt(int i13, boolean z13) {
        this.f10968kegysxyocb.xrmfcynszj(i13, this.f11000zdlpuopuiu[i13].wflxmlrfwp(), z13);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0047  */
    private void opjhrmiecq() {
        boolean z13;
        boolean z14 = false;
        while (E()) {
            if (z14) {
                uwvvkdfqfp();
            }
            this.f10975nuxfzjnpeb = false;
            yfnezrywwk yfnezrywwkVar = (yfnezrywwk) y2.iobyxmoadg.eablkybsjg(this.f10965jpowsppfya.zoijcleaow());
            if (this.f10984sopmlzcsov.f11053zoijcleaow.f11262iobyxmoadg.equals(yfnezrywwkVar.f11644nufgyqmvbu.f11629iobyxmoadg.f11262iobyxmoadg)) {
                androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar = this.f10984sopmlzcsov.f11053zoijcleaow;
                if (zoijcleaowVar.f11265zoijcleaow == -1) {
                    androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar2 = yfnezrywwkVar.f11644nufgyqmvbu.f11629iobyxmoadg;
                    if (zoijcleaowVar2.f11265zoijcleaow != -1 || zoijcleaowVar.f11261eablkybsjg == zoijcleaowVar2.f11261eablkybsjg) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                } else {
                    z13 = false;
                }
            } else {
                z13 = false;
            }
            ydmasvzmpa ydmasvzmpaVar = yfnezrywwkVar.f11644nufgyqmvbu;
            androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar3 = ydmasvzmpaVar.f11629iobyxmoadg;
            long j13 = ydmasvzmpaVar.f11634zoijcleaow;
            this.f10984sopmlzcsov = crxdokpmqz(zoijcleaowVar3, j13, ydmasvzmpaVar.f11632ppxfxbqfkf, j13, !z13, 0);
            ipoelvxyzq();
            V();
            if (zdlpuopuiu() && yfnezrywwkVar == this.f10965jpowsppfya.cqumvgiudr()) {
                czzsidtyhn();
            }
            if (this.f10984sopmlzcsov.f11038eablkybsjg == 3) {
                J();
            }
            kcexrzcfyt();
            z14 = true;
        }
    }

    private void oxmwwwfdhm(zoijcleaow zoijcleaowVar, int i13) throws Throwable {
        this.f10952crxdokpmqz.zoijcleaow(1);
        dvvnrvtcbc dvvnrvtcbcVar = this.f10957hkdspvbjdz;
        if (i13 == -1) {
            i13 = dvvnrvtcbcVar.oxmwwwfdhm();
        }
        mbcevpiqjq(dvvnrvtcbcVar.gxszxtbevo(i13, zoijcleaowVar.f11023iobyxmoadg, zoijcleaowVar.f11026zoijcleaow), false);
    }

    private Pair pkzmftpjix(v2.cdpycssgdh cdpycssgdhVar) {
        if (cdpycssgdhVar.vdvldrhtss()) {
            return Pair.create(skhdrjzrfn.draadjrbmk(), 0L);
        }
        Pair pairBtonecajqb = cdpycssgdhVar.btonecajqb(this.f10949cdpycssgdh, this.f10995yadqdtsiqt, cdpycssgdhVar.iobyxmoadg(this.f10994xrmfcynszj), -9223372036854775807L);
        androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVarKegysxyocb = this.f10965jpowsppfya.kegysxyocb(cdpycssgdhVar, pairBtonecajqb.first, 0L);
        long jLongValue = ((Long) pairBtonecajqb.second).longValue();
        if (zoijcleaowVarKegysxyocb.zoijcleaow()) {
            cdpycssgdhVar.nufgyqmvbu(zoijcleaowVarKegysxyocb.f11262iobyxmoadg, this.f10995yadqdtsiqt);
            jLongValue = zoijcleaowVarKegysxyocb.f11263ppxfxbqfkf == this.f10995yadqdtsiqt.gtknphoqwx(zoijcleaowVarKegysxyocb.f11265zoijcleaow) ? this.f10995yadqdtsiqt.lqeggnwhkg() : 0L;
        }
        return Pair.create(zoijcleaowVarKegysxyocb, Long.valueOf(jLongValue));
    }

    /* JADX WARN: Code duplicated, block: B:97:0x0188  */
    private void pmvmpeiblj() throws ExoPlaybackException {
        boolean z13;
        boolean z14;
        int i13;
        long jUptimeMillis = this.f10979pkzmftpjix.uptimeMillis();
        this.f10980pmvmpeiblj.gtknphoqwx(2);
        Q();
        int i14 = this.f10984sopmlzcsov.f11038eablkybsjg;
        if (i14 == 1 || i14 == 4) {
            return;
        }
        yfnezrywwk yfnezrywwkVarYggfygwlhe = this.f10965jpowsppfya.yggfygwlhe();
        if (yfnezrywwkVarYggfygwlhe == null) {
            yzdjzghtvl(jUptimeMillis);
            return;
        }
        y2.jpowsppfya.iobyxmoadg("doSomeWork");
        V();
        if (yfnezrywwkVarYggfygwlhe.f11641gxszxtbevo) {
            this.f10983sflfametgt = y2.stevsuqkhv.ixidwrxhsl(this.f10979pkzmftpjix.elapsedRealtime());
            yfnezrywwkVarYggfygwlhe.f11642iobyxmoadg.zdlpuopuiu(this.f10984sopmlzcsov.f11042kcexrzcfyt - this.f10959iozdgvuglv, this.f10970lmojexxdyd);
            z13 = true;
            z14 = true;
            int i15 = 0;
            while (true) {
                fiwbwshyhd[] fiwbwshyhdVarArr = this.f11000zdlpuopuiu;
                if (i15 >= fiwbwshyhdVarArr.length) {
                    break;
                }
                fiwbwshyhd fiwbwshyhdVar = fiwbwshyhdVarArr[i15];
                if (fiwbwshyhdVar.nufgyqmvbu() == 0) {
                    sflfametgt(i15, false);
                } else {
                    fiwbwshyhdVar.ylkuphrtab(this.f10996ydmasvzmpa, this.f10983sflfametgt);
                    z13 = z13 && fiwbwshyhdVar.zdlpuopuiu();
                    boolean zIobyxmoadg = fiwbwshyhdVar.iobyxmoadg(yfnezrywwkVarYggfygwlhe);
                    sflfametgt(i15, zIobyxmoadg);
                    z14 = z14 && zIobyxmoadg;
                    if (!zIobyxmoadg) {
                        ydmasvzmpa(i15);
                    }
                }
                i15++;
            }
        } else {
            yfnezrywwkVarYggfygwlhe.f11642iobyxmoadg.draadjrbmk();
            z13 = true;
            z14 = true;
        }
        long j13 = yfnezrywwkVarYggfygwlhe.f11644nufgyqmvbu.f11627eablkybsjg;
        boolean z15 = z13 && yfnezrywwkVarYggfygwlhe.f11641gxszxtbevo && (j13 == -9223372036854775807L || j13 <= this.f10984sopmlzcsov.f11042kcexrzcfyt);
        if (z15 && this.f10990vipkmwdibw) {
            this.f10990vipkmwdibw = false;
            q(false, this.f10984sopmlzcsov.f11034agtfadlqog, false, 5);
        }
        if (z15 && yfnezrywwkVarYggfygwlhe.f11644nufgyqmvbu.f11625btonecajqb) {
            A(4);
            M();
        } else if (this.f10984sopmlzcsov.f11038eablkybsjg == 2 && H(z14)) {
            A(3);
            this.f10948bfopjjpdmp = null;
            if (G()) {
                Y(false, false);
                this.f10992wwaezpbzkn.gxszxtbevo();
                J();
            }
        } else if (this.f10984sopmlzcsov.f11038eablkybsjg == 3 && (this.f10989uwvvkdfqfp != 0 ? !z14 : !jhduphickx())) {
            Y(G(), false);
            A(2);
            if (this.f10963jhduphickx) {
                auzgnhcxok();
                this.f10950cllcsxoeiz.wkgbmnqykc();
            }
            M();
        }
        if (this.f10984sopmlzcsov.f11038eablkybsjg == 2) {
            int i16 = 0;
            while (true) {
                fiwbwshyhd[] fiwbwshyhdVarArr2 = this.f11000zdlpuopuiu;
                if (i16 >= fiwbwshyhdVarArr2.length) {
                    break;
                }
                if (fiwbwshyhdVarArr2[i16].iwizpuwonk(yfnezrywwkVarYggfygwlhe)) {
                    ydmasvzmpa(i16);
                }
                i16++;
            }
            skhdrjzrfn skhdrjzrfnVar = this.f10984sopmlzcsov;
            if (skhdrjzrfnVar.f11043lqeggnwhkg || skhdrjzrfnVar.f11046oxmwwwfdhm >= 500000 || !vipkmwdibw(this.f10965jpowsppfya.agtfadlqog()) || !G()) {
                this.f10962iyctptxqzt = -9223372036854775807L;
            } else if (this.f10962iyctptxqzt == -9223372036854775807L) {
                this.f10962iyctptxqzt = this.f10979pkzmftpjix.elapsedRealtime();
            } else if (this.f10979pkzmftpjix.elapsedRealtime() - this.f10962iyctptxqzt >= 4000) {
                throw new IllegalStateException("Playback stuck buffering and not loading");
            }
        } else {
            this.f10962iyctptxqzt = -9223372036854775807L;
        }
        boolean z16 = G() && this.f10984sopmlzcsov.f11038eablkybsjg == 3;
        boolean z17 = this.f10953czzsidtyhn && this.f10982rlfsiqarku && z16;
        skhdrjzrfn skhdrjzrfnVar2 = this.f10984sopmlzcsov;
        if (skhdrjzrfnVar2.f11048rgvfuqvkyq != z17) {
            this.f10984sopmlzcsov = skhdrjzrfnVar2.dxjokdxxww(z17);
        }
        this.f10982rlfsiqarku = false;
        if (!z17 && (i13 = this.f10984sopmlzcsov.f11038eablkybsjg) != 4 && (z16 || i13 == 2 || (i13 == 3 && this.f10989uwvvkdfqfp != 0))) {
            yzdjzghtvl(jUptimeMillis);
        }
        y2.jpowsppfya.zoijcleaow();
    }

    private void q(boolean z13, int i13, boolean z14, int i14) {
        this.f10952crxdokpmqz.zoijcleaow(z14 ? 1 : 0);
        T(z13, i13, i14);
    }

    static int rhgxfdycjh(v2.cdpycssgdh.ppxfxbqfkf ppxfxbqfkfVar, v2.cdpycssgdh.zoijcleaow zoijcleaowVar, int i13, boolean z13, Object obj, v2.cdpycssgdh cdpycssgdhVar, v2.cdpycssgdh cdpycssgdhVar2) {
        Object obj2 = cdpycssgdhVar.agtfadlqog(cdpycssgdhVar.nufgyqmvbu(obj, zoijcleaowVar).f115304ppxfxbqfkf, ppxfxbqfkfVar).f115286iobyxmoadg;
        for (int i14 = 0; i14 < cdpycssgdhVar2.rgvfuqvkyq(); i14++) {
            if (cdpycssgdhVar2.agtfadlqog(i14, ppxfxbqfkfVar).f115286iobyxmoadg.equals(obj2)) {
                return i14;
            }
        }
        int iZoijcleaow = cdpycssgdhVar.zoijcleaow(obj);
        int iDxjokdxxww = cdpycssgdhVar.dxjokdxxww();
        int iWkgbmnqykc = iZoijcleaow;
        int iZoijcleaow2 = -1;
        for (int i15 = 0; i15 < iDxjokdxxww && iZoijcleaow2 == -1; i15++) {
            iWkgbmnqykc = cdpycssgdhVar.wkgbmnqykc(iWkgbmnqykc, zoijcleaowVar, ppxfxbqfkfVar, i13, z13);
            if (iWkgbmnqykc == -1) {
                break;
            }
            iZoijcleaow2 = cdpycssgdhVar2.zoijcleaow(cdpycssgdhVar.wflxmlrfwp(iWkgbmnqykc));
        }
        if (iZoijcleaow2 == -1) {
            return -1;
        }
        return cdpycssgdhVar2.gxszxtbevo(iZoijcleaow2, zoijcleaowVar).f115304ppxfxbqfkf;
    }

    private static boolean ribwqtqdhb(boolean z13, androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar, long j13, androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar2, v2.cdpycssgdh.zoijcleaow zoijcleaowVar3, long j14) {
        if (z13 || j13 != j14 || !zoijcleaowVar.f11262iobyxmoadg.equals(zoijcleaowVar2.f11262iobyxmoadg)) {
            return false;
        }
        if (zoijcleaowVar.zoijcleaow() && zoijcleaowVar3.oxmwwwfdhm(zoijcleaowVar.f11265zoijcleaow)) {
            return (zoijcleaowVar3.nufgyqmvbu(zoijcleaowVar.f11265zoijcleaow, zoijcleaowVar.f11263ppxfxbqfkf) == 4 || zoijcleaowVar3.nufgyqmvbu(zoijcleaowVar.f11265zoijcleaow, zoijcleaowVar.f11263ppxfxbqfkf) == 2) ? false : true;
        }
        return zoijcleaowVar2.zoijcleaow() && zoijcleaowVar3.oxmwwwfdhm(zoijcleaowVar2.f11265zoijcleaow);
    }

    private void rlfsiqarku() {
        this.f10965jpowsppfya.pkzmftpjix();
        yfnezrywwk yfnezrywwkVarIwizpuwonk = this.f10965jpowsppfya.iwizpuwonk();
        if (yfnezrywwkVarIwizpuwonk != null) {
            if ((!yfnezrywwkVarIwizpuwonk.f11639eablkybsjg || yfnezrywwkVarIwizpuwonk.f11641gxszxtbevo) && !yfnezrywwkVarIwizpuwonk.f11642iobyxmoadg.ppxfxbqfkf()) {
                if (this.f10955esjtqupxsv.gxszxtbevo(this.f10984sopmlzcsov.f11041iobyxmoadg, yfnezrywwkVarIwizpuwonk.f11644nufgyqmvbu.f11629iobyxmoadg, yfnezrywwkVarIwizpuwonk.f11641gxszxtbevo ? yfnezrywwkVarIwizpuwonk.f11642iobyxmoadg.wkgbmnqykc() : 0L)) {
                    if (yfnezrywwkVarIwizpuwonk.f11639eablkybsjg) {
                        yfnezrywwkVarIwizpuwonk.eablkybsjg(new uwvvkdfqfp.zoijcleaow().gxszxtbevo(yfnezrywwkVarIwizpuwonk.istkbnxepw(this.f10996ydmasvzmpa)).lqeggnwhkg(this.f10992wwaezpbzkn.lqeggnwhkg().f115310iobyxmoadg).eablkybsjg(this.f10958ikoacuggdj).wkgbmnqykc());
                    } else {
                        yfnezrywwkVarIwizpuwonk.jyumaefscl(this, yfnezrywwkVarIwizpuwonk.f11644nufgyqmvbu.f11634zoijcleaow);
                    }
                }
            }
        }
    }

    private void roivzttewh() {
        for (yfnezrywwk yfnezrywwkVarYggfygwlhe = this.f10965jpowsppfya.yggfygwlhe(); yfnezrywwkVarYggfygwlhe != null; yfnezrywwkVarYggfygwlhe = yfnezrywwkVarYggfygwlhe.gtknphoqwx()) {
            for (o3.esjtqupxsv esjtqupxsvVar : yfnezrywwkVarYggfygwlhe.rgvfuqvkyq().f71903ppxfxbqfkf) {
                if (esjtqupxsvVar != null) {
                    esjtqupxsvVar.eablkybsjg();
                }
            }
        }
    }

    private void s(v2.cqumvgiudr cqumvgiudrVar) {
        k(cqumvgiudrVar);
        sopmlzcsov(this.f10992wwaezpbzkn.lqeggnwhkg(), true);
    }

    private void sflfametgt(final int i13, final boolean z13) {
        boolean[] zArr = this.f10966jyumaefscl;
        if (zArr[i13] != z13) {
            zArr[i13] = z13;
            this.f10987tzroggbefp.lqeggnwhkg(new Runnable() { // from class: androidx.media3.exoplayer.jztzpxfvev
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10596zdlpuopuiu.okpsazkaxt(i13, z13);
                }
            });
        }
    }

    private void skhdrjzrfn() {
        this.f10952crxdokpmqz.zoijcleaow(1);
        fyldjkxazc(false, false, false, true);
        this.f10955esjtqupxsv.ppxfxbqfkf(this.f10993wypolnanlu);
        A(this.f10984sopmlzcsov.f11041iobyxmoadg.vdvldrhtss() ? 4 : 2);
        S();
        this.f10957hkdspvbjdz.iwizpuwonk(this.f10969lereixgezr.zoijcleaow());
        this.f10980pmvmpeiblj.nufgyqmvbu(2);
    }

    private void sopmlzcsov(v2.cqumvgiudr cqumvgiudrVar, boolean z13) {
        ulzqkzuiru(cqumvgiudrVar, cqumvgiudrVar.f115310iobyxmoadg, true, z13);
    }

    private void stevsuqkhv(IOException iOException, int i13) {
        ExoPlaybackException exoPlaybackExceptionLqeggnwhkg = ExoPlaybackException.lqeggnwhkg(iOException, i13);
        yfnezrywwk yfnezrywwkVarYggfygwlhe = this.f10965jpowsppfya.yggfygwlhe();
        if (yfnezrywwkVarYggfygwlhe != null) {
            exoPlaybackExceptionLqeggnwhkg = exoPlaybackExceptionLqeggnwhkg.iobyxmoadg(yfnezrywwkVarYggfygwlhe.f11644nufgyqmvbu.f11629iobyxmoadg);
        }
        y2.kcexrzcfyt.wkgbmnqykc("ExoPlayerImplInternal", "Playback error", exoPlaybackExceptionLqeggnwhkg);
        L(false, false);
        this.f10984sopmlzcsov = this.f10984sopmlzcsov.gxszxtbevo(exoPlaybackExceptionLqeggnwhkg);
    }

    private void t(ExoPlayer.ppxfxbqfkf ppxfxbqfkfVar) {
        this.f10991weqkydbzbr = ppxfxbqfkfVar;
        this.f10965jpowsppfya.sopmlzcsov(this.f10984sopmlzcsov.f11041iobyxmoadg, ppxfxbqfkfVar);
    }

    private void tbqsvytpvh(ppxfxbqfkf ppxfxbqfkfVar) {
        this.f10952crxdokpmqz.zoijcleaow(1);
        throw null;
    }

    private void tzroggbefp(yfnezrywwk yfnezrywwkVar) throws ExoPlaybackException {
        if (!yfnezrywwkVar.f11641gxszxtbevo) {
            float f13 = this.f10992wwaezpbzkn.lqeggnwhkg().f115310iobyxmoadg;
            skhdrjzrfn skhdrjzrfnVar = this.f10984sopmlzcsov;
            yfnezrywwkVar.vdvldrhtss(f13, skhdrjzrfnVar.f11041iobyxmoadg, skhdrjzrfnVar.f11036draadjrbmk);
        }
        O(yfnezrywwkVar.f11644nufgyqmvbu.f11629iobyxmoadg, yfnezrywwkVar.ojitshcjhn(), yfnezrywwkVar.rgvfuqvkyq());
        if (yfnezrywwkVar == this.f10965jpowsppfya.yggfygwlhe()) {
            grlcpdaxtj(yfnezrywwkVar.f11644nufgyqmvbu.f11634zoijcleaow);
            istkbnxepw();
            yfnezrywwkVar.f11638dxjokdxxww = true;
            skhdrjzrfn skhdrjzrfnVar2 = this.f10984sopmlzcsov;
            androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar = skhdrjzrfnVar2.f11053zoijcleaow;
            long j13 = yfnezrywwkVar.f11644nufgyqmvbu.f11634zoijcleaow;
            this.f10984sopmlzcsov = crxdokpmqz(zoijcleaowVar, j13, skhdrjzrfnVar2.f11047ppxfxbqfkf, j13, false, 5);
        }
        metgxyhuhe();
    }

    private void uawqvzlxes(boolean z13) {
        for (yfnezrywwk yfnezrywwkVarYggfygwlhe = this.f10965jpowsppfya.yggfygwlhe(); yfnezrywwkVarYggfygwlhe != null; yfnezrywwkVarYggfygwlhe = yfnezrywwkVarYggfygwlhe.gtknphoqwx()) {
            for (o3.esjtqupxsv esjtqupxsvVar : yfnezrywwkVarYggfygwlhe.rgvfuqvkyq().f71903ppxfxbqfkf) {
                if (esjtqupxsvVar != null) {
                    esjtqupxsvVar.dxjokdxxww(z13);
                }
            }
        }
    }

    private void ulzqkzuiru(v2.cqumvgiudr cqumvgiudrVar, float f13, boolean z13, boolean z14) {
        if (z13) {
            if (z14) {
                this.f10952crxdokpmqz.zoijcleaow(1);
            }
            this.f10984sopmlzcsov = this.f10984sopmlzcsov.lqeggnwhkg(cqumvgiudrVar);
        }
        a0(cqumvgiudrVar.f115310iobyxmoadg);
        for (fiwbwshyhd fiwbwshyhdVar : this.f11000zdlpuopuiu) {
            fiwbwshyhdVar.stevsuqkhv(f13, cqumvgiudrVar.f115310iobyxmoadg);
        }
    }

    private void uwvvkdfqfp() {
        this.f10952crxdokpmqz.ppxfxbqfkf(this.f10984sopmlzcsov);
        if (this.f10952crxdokpmqz.f11005iobyxmoadg) {
            this.f10956hcddaimhww.iobyxmoadg(this.f10952crxdokpmqz);
            this.f10952crxdokpmqz = new eablkybsjg(this.f10984sopmlzcsov);
        }
    }

    private void v(int i13) throws ExoPlaybackException {
        this.f10967jztzpxfvev = i13;
        int iJlmebxxoox = this.f10965jpowsppfya.jlmebxxoox(this.f10984sopmlzcsov.f11041iobyxmoadg, i13);
        if ((iJlmebxxoox & 1) != 0) {
            krqnebusok(true);
        } else if ((iJlmebxxoox & 2) != 0) {
            cqumvgiudr();
        }
        kegysxyocb(false);
    }

    private boolean vipkmwdibw(yfnezrywwk yfnezrywwkVar) {
        return (yfnezrywwkVar == null || yfnezrywwkVar.oxmwwwfdhm() || yfnezrywwkVar.draadjrbmk() == Long.MIN_VALUE) ? false : true;
    }

    private void w(f3.hkdspvbjdz hkdspvbjdzVar) {
        this.f10988ulzqkzuiru = hkdspvbjdzVar;
    }

    private void weqkydbzbr() throws ExoPlaybackException {
        yfnezrywwk yfnezrywwkVarCqumvgiudr;
        if (this.f10990vipkmwdibw || !this.f10972mbcevpiqjq || this.f10975nuxfzjnpeb || zdlpuopuiu() || (yfnezrywwkVarCqumvgiudr = this.f10965jpowsppfya.cqumvgiudr()) == null || yfnezrywwkVarCqumvgiudr != this.f10965jpowsppfya.esjtqupxsv() || yfnezrywwkVarCqumvgiudr.gtknphoqwx() == null || !yfnezrywwkVarCqumvgiudr.gtknphoqwx().f11641gxszxtbevo) {
            return;
        }
        this.f10965jpowsppfya.ppxfxbqfkf();
        yfnezrywwk();
    }

    private void wizcaqwiak() {
        for (int i13 = 0; i13 < this.f11000zdlpuopuiu.length; i13++) {
            this.f10998yggfygwlhe[i13].draadjrbmk();
            this.f11000zdlpuopuiu[i13].wwaezpbzkn();
        }
    }

    private long wwaezpbzkn(v2.cdpycssgdh cdpycssgdhVar, Object obj, long j13) {
        cdpycssgdhVar.agtfadlqog(cdpycssgdhVar.nufgyqmvbu(obj, this.f10995yadqdtsiqt).f115304ppxfxbqfkf, this.f10949cdpycssgdh);
        v2.cdpycssgdh.ppxfxbqfkf ppxfxbqfkfVar = this.f10949cdpycssgdh;
        if (ppxfxbqfkfVar.f115285gxszxtbevo != -9223372036854775807L && ppxfxbqfkfVar.gxszxtbevo()) {
            v2.cdpycssgdh.ppxfxbqfkf ppxfxbqfkfVar2 = this.f10949cdpycssgdh;
            if (ppxfxbqfkfVar2.f115282dxjokdxxww) {
                return y2.stevsuqkhv.ixidwrxhsl(ppxfxbqfkfVar2.iobyxmoadg() - this.f10949cdpycssgdh.f115285gxszxtbevo) - (j13 + this.f10995yadqdtsiqt.agtfadlqog());
            }
        }
        return -9223372036854775807L;
    }

    private void wypolnanlu(androidx.media3.exoplayer.source.vdvldrhtss vdvldrhtssVar) {
        if (this.f10965jpowsppfya.iozdgvuglv(vdvldrhtssVar)) {
            this.f10965jpowsppfya.jpowsppfya(this.f10996ydmasvzmpa);
            metgxyhuhe();
        } else if (this.f10965jpowsppfya.lmojexxdyd(vdvldrhtssVar)) {
            rlfsiqarku();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void xrmfcynszj(igdgnonuha igdgnonuhaVar) {
        try {
            iwizpuwonk(igdgnonuhaVar);
        } catch (ExoPlaybackException e13) {
            y2.kcexrzcfyt.wkgbmnqykc("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e13);
            throw new RuntimeException(e13);
        }
    }

    private void y(boolean z13) throws ExoPlaybackException {
        this.f10994xrmfcynszj = z13;
        int iRibwqtqdhb = this.f10965jpowsppfya.ribwqtqdhb(this.f10984sopmlzcsov.f11041iobyxmoadg, z13);
        if ((iRibwqtqdhb & 1) != 0) {
            krqnebusok(true);
        } else if ((iRibwqtqdhb & 2) != 0) {
            cqumvgiudr();
        }
        kegysxyocb(false);
    }

    private void ydmasvzmpa(int i13) {
        fiwbwshyhd fiwbwshyhdVar = this.f11000zdlpuopuiu[i13];
        try {
            fiwbwshyhdVar.lmojexxdyd((yfnezrywwk) y2.iobyxmoadg.eablkybsjg(this.f10965jpowsppfya.yggfygwlhe()));
        } catch (IOException | RuntimeException e13) {
            int iWflxmlrfwp = fiwbwshyhdVar.wflxmlrfwp();
            if (iWflxmlrfwp != 3 && iWflxmlrfwp != 5) {
                throw e13;
            }
            o3.yadqdtsiqt yadqdtsiqtVarRgvfuqvkyq = this.f10965jpowsppfya.yggfygwlhe().rgvfuqvkyq();
            y2.kcexrzcfyt.wkgbmnqykc("ExoPlayerImplInternal", "Disabling track due to error: " + androidx.media3.common.iobyxmoadg.dxjokdxxww(yadqdtsiqtVarRgvfuqvkyq.f71903ppxfxbqfkf[i13].draadjrbmk()), e13);
            o3.yadqdtsiqt yadqdtsiqtVar = new o3.yadqdtsiqt((f3.hcddaimhww[]) yadqdtsiqtVarRgvfuqvkyq.f71905zoijcleaow.clone(), (o3.esjtqupxsv[]) yadqdtsiqtVarRgvfuqvkyq.f71903ppxfxbqfkf.clone(), yadqdtsiqtVarRgvfuqvkyq.f71904wkgbmnqykc, yadqdtsiqtVarRgvfuqvkyq.f71901eablkybsjg);
            yadqdtsiqtVar.f71905zoijcleaow[i13] = null;
            yadqdtsiqtVar.f71903ppxfxbqfkf[i13] = null;
            esjtqupxsv(i13);
            this.f10965jpowsppfya.yggfygwlhe().iobyxmoadg(yadqdtsiqtVar, this.f10984sopmlzcsov.f11042kcexrzcfyt, false);
        }
    }

    private void yfnezrywwk() throws ExoPlaybackException {
        yfnezrywwk yfnezrywwkVarCqumvgiudr = this.f10965jpowsppfya.cqumvgiudr();
        if (yfnezrywwkVarCqumvgiudr == null) {
            return;
        }
        o3.yadqdtsiqt yadqdtsiqtVarRgvfuqvkyq = yfnezrywwkVarCqumvgiudr.rgvfuqvkyq();
        for (int i13 = 0; i13 < this.f11000zdlpuopuiu.length; i13++) {
            if (yadqdtsiqtVarRgvfuqvkyq.ppxfxbqfkf(i13) && this.f11000zdlpuopuiu[i13].kcexrzcfyt() && !this.f11000zdlpuopuiu[i13].yggfygwlhe()) {
                this.f11000zdlpuopuiu[i13].ulzqkzuiru();
                zynmafqrjb(yfnezrywwkVarCqumvgiudr, i13, false, yfnezrywwkVarCqumvgiudr.agtfadlqog());
            }
        }
        if (zdlpuopuiu()) {
            this.f11001zeieaojujs = yfnezrywwkVarCqumvgiudr.f11642iobyxmoadg.btonecajqb();
            if (yfnezrywwkVarCqumvgiudr.kcexrzcfyt()) {
                return;
            }
            this.f10965jpowsppfya.dsvhmnatus(yfnezrywwkVarCqumvgiudr);
            kegysxyocb(false);
            metgxyhuhe();
        }
    }

    private void yggfygwlhe() throws ExoPlaybackException {
        ageimvtcrz();
    }

    private long ylkuphrtab(yfnezrywwk yfnezrywwkVar) {
        if (yfnezrywwkVar == null) {
            return 0L;
        }
        long jWflxmlrfwp = yfnezrywwkVar.wflxmlrfwp();
        if (!yfnezrywwkVar.f11641gxszxtbevo) {
            return jWflxmlrfwp;
        }
        int i13 = 0;
        while (true) {
            fiwbwshyhd[] fiwbwshyhdVarArr = this.f11000zdlpuopuiu;
            if (i13 >= fiwbwshyhdVarArr.length) {
                return jWflxmlrfwp;
            }
            if (fiwbwshyhdVarArr[i13].iwizpuwonk(yfnezrywwkVar)) {
                long jGtknphoqwx = this.f11000zdlpuopuiu[i13].gtknphoqwx(yfnezrywwkVar);
                if (jGtknphoqwx == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jWflxmlrfwp = Math.max(jGtknphoqwx, jWflxmlrfwp);
            }
            i13++;
        }
    }

    private void yzdjzghtvl(long j13) {
        long jMin = (this.f10984sopmlzcsov.f11038eablkybsjg != 3 || (!this.f10985stevsuqkhv && G())) ? f10947roivzttewh : 1000L;
        if (this.f10985stevsuqkhv && G()) {
            for (fiwbwshyhd fiwbwshyhdVar : this.f11000zdlpuopuiu) {
                jMin = Math.min(jMin, y2.stevsuqkhv.t(fiwbwshyhdVar.btonecajqb(this.f10996ydmasvzmpa, this.f10983sflfametgt)));
            }
            yfnezrywwk yfnezrywwkVarGtknphoqwx = this.f10965jpowsppfya.yggfygwlhe() != null ? this.f10965jpowsppfya.yggfygwlhe().gtknphoqwx() : null;
            if (yfnezrywwkVarGtknphoqwx != null && this.f10996ydmasvzmpa + (y2.stevsuqkhv.ixidwrxhsl(jMin) * this.f10984sopmlzcsov.f11045ojitshcjhn.f115310iobyxmoadg) >= yfnezrywwkVarGtknphoqwx.agtfadlqog()) {
                jMin = Math.min(jMin, f10947roivzttewh);
            }
        }
        this.f10980pmvmpeiblj.btonecajqb(2, j13 + jMin);
    }

    private void z(m3.kcexrzcfyt kcexrzcfytVar) throws Throwable {
        this.f10952crxdokpmqz.zoijcleaow(1);
        mbcevpiqjq(this.f10957hkdspvbjdz.cdpycssgdh(kcexrzcfytVar), false);
    }

    private boolean zdlpuopuiu() {
        if (!this.f10972mbcevpiqjq) {
            return false;
        }
        for (fiwbwshyhd fiwbwshyhdVar : this.f11000zdlpuopuiu) {
            if (fiwbwshyhdVar.yggfygwlhe()) {
                return true;
            }
        }
        return false;
    }

    private void zeieaojujs() {
        yfnezrywwk yfnezrywwkVarEsjtqupxsv = this.f10965jpowsppfya.esjtqupxsv();
        if (yfnezrywwkVarEsjtqupxsv == null || this.f10965jpowsppfya.yggfygwlhe() == yfnezrywwkVarEsjtqupxsv || yfnezrywwkVarEsjtqupxsv.f11638dxjokdxxww || !Z()) {
            return;
        }
        this.f10965jpowsppfya.esjtqupxsv().f11638dxjokdxxww = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0079, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void zfvoamnweg(long r9, long r11) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.rlfsiqarku.zfvoamnweg(long, long):void");
    }

    private void zynmafqrjb(yfnezrywwk yfnezrywwkVar, int i13, boolean z13, long j13) throws ExoPlaybackException {
        fiwbwshyhd fiwbwshyhdVar = this.f11000zdlpuopuiu[i13];
        if (fiwbwshyhdVar.cqumvgiudr()) {
            return;
        }
        boolean z14 = yfnezrywwkVar == this.f10965jpowsppfya.yggfygwlhe();
        o3.yadqdtsiqt yadqdtsiqtVarRgvfuqvkyq = yfnezrywwkVar.rgvfuqvkyq();
        f3.hcddaimhww hcddaimhwwVar = yadqdtsiqtVarRgvfuqvkyq.f71905zoijcleaow[i13];
        o3.esjtqupxsv esjtqupxsvVar = yadqdtsiqtVarRgvfuqvkyq.f71903ppxfxbqfkf[i13];
        boolean z15 = G() && this.f10984sopmlzcsov.f11038eablkybsjg == 3;
        boolean z16 = !z13 && z15;
        this.f10989uwvvkdfqfp++;
        fiwbwshyhdVar.eablkybsjg(hcddaimhwwVar, esjtqupxsvVar, yfnezrywwkVar.f11646ppxfxbqfkf[i13], this.f10996ydmasvzmpa, z16, z14, j13, yfnezrywwkVar.wflxmlrfwp(), yfnezrywwkVar.f11644nufgyqmvbu.f11629iobyxmoadg, this.f10992wwaezpbzkn);
        fiwbwshyhdVar.agtfadlqog(11, new iobyxmoadg(), yfnezrywwkVar);
        if (z15 && z14) {
            fiwbwshyhdVar.ntlheqmsrt();
        }
    }

    public synchronized boolean B(Object obj, long j13) {
        if (!this.f10964jlmebxxoox && this.f10960istkbnxepw.getThread().isAlive()) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean();
            this.f10980pmvmpeiblj.wkgbmnqykc(30, new Pair(obj, atomicBoolean)).iobyxmoadg();
            if (j13 == -9223372036854775807L) {
                return true;
            }
            b0(new xa.vdvldrhtss() { // from class: f3.iozdgvuglv
                @Override // xa.vdvldrhtss
                public final Object get() {
                    return Boolean.valueOf(atomicBoolean.get());
                }
            }, j13);
            return atomicBoolean.get();
        }
        return true;
    }

    public void K() {
        this.f10980pmvmpeiblj.iobyxmoadg(6).iobyxmoadg();
    }

    public void dvvnrvtcbc() {
        this.f10980pmvmpeiblj.iobyxmoadg(29).iobyxmoadg();
    }

    @Override // androidx.media3.exoplayer.igdgnonuha.iobyxmoadg
    public synchronized void dxjokdxxww(igdgnonuha igdgnonuhaVar) {
        if (!this.f10964jlmebxxoox && this.f10960istkbnxepw.getThread().isAlive()) {
            this.f10980pmvmpeiblj.wkgbmnqykc(14, igdgnonuhaVar).iobyxmoadg();
            return;
        }
        y2.kcexrzcfyt.nufgyqmvbu("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        igdgnonuhaVar.btonecajqb(false);
    }

    @Override // androidx.media3.exoplayer.lqeggnwhkg.iobyxmoadg
    public void eablkybsjg(int i13) {
        this.f10980pmvmpeiblj.gxszxtbevo(33, i13, 0).iobyxmoadg();
    }

    public void eslsurpljm(v2.cdpycssgdh cdpycssgdhVar, int i13, long j13) {
        this.f10980pmvmpeiblj.wkgbmnqykc(3, new nufgyqmvbu(cdpycssgdhVar, i13, j13)).iobyxmoadg();
    }

    @Override // androidx.media3.exoplayer.source.vdvldrhtss.iobyxmoadg
    public void gxszxtbevo(androidx.media3.exoplayer.source.vdvldrhtss vdvldrhtssVar) {
        this.f10980pmvmpeiblj.wkgbmnqykc(8, vdvldrhtssVar).iobyxmoadg();
    }

    public void h(v2.ppxfxbqfkf ppxfxbqfkfVar, boolean z13) {
        this.f10980pmvmpeiblj.ppxfxbqfkf(31, z13 ? 1 : 0, 0, ppxfxbqfkfVar).iobyxmoadg();
    }

    /* JADX WARN: Code duplicated, block: B:121:0x023b  */
    /* JADX WARN: Code duplicated, block: B:123:0x023f  */
    /* JADX WARN: Code duplicated, block: B:132:0x0292  */
    /* JADX WARN: Code duplicated, block: B:145:0x02bc  */
    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) throws Throwable {
        ExoPlaybackException exoPlaybackException;
        ExoPlaybackException exoPlaybackException2;
        int i13;
        yfnezrywwk yfnezrywwkVarEsjtqupxsv;
        int i14 = 1000;
        try {
            switch (message.what) {
                case 1:
                    boolean z13 = message.arg1 != 0;
                    int i15 = message.arg2;
                    q(z13, i15 >> 4, true, i15 & 15);
                    break;
                case 2:
                    pmvmpeiblj();
                    break;
                case 3:
                    a((nufgyqmvbu) message.obj);
                    break;
                case 4:
                    s((v2.cqumvgiudr) message.obj);
                    break;
                case 5:
                    w((f3.hkdspvbjdz) message.obj);
                    break;
                case 6:
                    L(false, true);
                    break;
                case 7:
                    lxfrhoxuzk();
                    return true;
                case 8:
                    ntlheqmsrt((androidx.media3.exoplayer.source.vdvldrhtss) message.obj);
                    break;
                case 9:
                    wypolnanlu((androidx.media3.exoplayer.source.vdvldrhtss) message.obj);
                    break;
                case 10:
                    fiwbwshyhd();
                    break;
                case 11:
                    v(message.arg1);
                    break;
                case 12:
                    y(message.arg1 != 0);
                    break;
                case 13:
                    j(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    d((igdgnonuha) message.obj);
                    break;
                case 15:
                    f((igdgnonuha) message.obj);
                    break;
                case 16:
                    sopmlzcsov((v2.cqumvgiudr) message.obj, false);
                    break;
                case 17:
                    l((zoijcleaow) message.obj);
                    break;
                case 18:
                    oxmwwwfdhm((zoijcleaow) message.obj, message.arg1);
                    break;
                case 19:
                    androidx.appcompat.app.yggfygwlhe.iobyxmoadg(message.obj);
                    tbqsvytpvh(null);
                    break;
                case 20:
                    hszhottldk(message.arg1, message.arg2, (m3.kcexrzcfyt) message.obj);
                    break;
                case 21:
                    z((m3.kcexrzcfyt) message.obj);
                    break;
                case 22:
                    nuxfzjnpeb();
                    break;
                case 23:
                    o(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case C4007z9.F /* 25 */:
                    yggfygwlhe();
                    break;
                case C4007z9.G /* 26 */:
                    ageimvtcrz();
                    break;
                case 27:
                    P(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    t((ExoPlayer.ppxfxbqfkf) message.obj);
                    break;
                case C4007z9.I /* 29 */:
                    skhdrjzrfn();
                    break;
                case 30:
                    Pair pair = (Pair) message.obj;
                    C(pair.first, (AtomicBoolean) pair.second);
                    break;
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    i((v2.ppxfxbqfkf) message.obj, message.arg1 != 0);
                    break;
                case 32:
                    D(((Float) message.obj).floatValue());
                    break;
                case 33:
                    cllcsxoeiz(message.arg1);
                    break;
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    dsvhmnatus();
                    break;
            }
        } catch (ParserException e13) {
            int i16 = e13.f9631yggfygwlhe;
            if (i16 == 1) {
                i14 = e13.f9632zdlpuopuiu ? AuthApiStatusCodes.AUTH_API_ACCESS_FORBIDDEN : AuthApiStatusCodes.AUTH_API_SERVER_ERROR;
            } else if (i16 == 4) {
                i14 = e13.f9632zdlpuopuiu ? AuthApiStatusCodes.AUTH_API_CLIENT_ERROR : AuthApiStatusCodes.AUTH_TOKEN_ERROR;
            }
            stevsuqkhv(e13, i14);
        } catch (DataSourceException e14) {
            stevsuqkhv(e14, e14.f9860zdlpuopuiu);
        } catch (ExoPlaybackException e15) {
            ExoPlaybackException exoPlaybackExceptionIobyxmoadg = e15;
            if (exoPlaybackExceptionIobyxmoadg.f10031istkbnxepw == 1 && (yfnezrywwkVarEsjtqupxsv = this.f10965jpowsppfya.esjtqupxsv()) != null) {
                fiwbwshyhd[] fiwbwshyhdVarArr = this.f11000zdlpuopuiu;
                int i17 = exoPlaybackExceptionIobyxmoadg.f10034yadqdtsiqt;
                exoPlaybackExceptionIobyxmoadg = exoPlaybackExceptionIobyxmoadg.iobyxmoadg((!fiwbwshyhdVarArr[i17 % fiwbwshyhdVarArr.length].lereixgezr(i17) || yfnezrywwkVarEsjtqupxsv.gtknphoqwx() == null) ? yfnezrywwkVarEsjtqupxsv.f11644nufgyqmvbu.f11629iobyxmoadg : yfnezrywwkVarEsjtqupxsv.gtknphoqwx().f11644nufgyqmvbu.f11629iobyxmoadg);
            }
            if (exoPlaybackExceptionIobyxmoadg.f10031istkbnxepw == 1) {
                fiwbwshyhd[] fiwbwshyhdVarArr2 = this.f11000zdlpuopuiu;
                int i18 = exoPlaybackExceptionIobyxmoadg.f10034yadqdtsiqt;
                if (fiwbwshyhdVarArr2[i18 % fiwbwshyhdVarArr2.length].lereixgezr(i18)) {
                    this.f10975nuxfzjnpeb = true;
                    cqumvgiudr();
                    yfnezrywwk yfnezrywwkVarCqumvgiudr = this.f10965jpowsppfya.cqumvgiudr();
                    yfnezrywwk yfnezrywwkVarYggfygwlhe = this.f10965jpowsppfya.yggfygwlhe();
                    if (this.f10965jpowsppfya.yggfygwlhe() != yfnezrywwkVarCqumvgiudr) {
                        while (yfnezrywwkVarYggfygwlhe != null && yfnezrywwkVarYggfygwlhe.gtknphoqwx() != yfnezrywwkVarCqumvgiudr) {
                            yfnezrywwkVarYggfygwlhe = yfnezrywwkVarYggfygwlhe.gtknphoqwx();
                        }
                    }
                    this.f10965jpowsppfya.dsvhmnatus(yfnezrywwkVarYggfygwlhe);
                    if (this.f10984sopmlzcsov.f11038eablkybsjg != 4) {
                        metgxyhuhe();
                        this.f10980pmvmpeiblj.nufgyqmvbu(2);
                    }
                } else {
                    exoPlaybackException = this.f10948bfopjjpdmp;
                    if (exoPlaybackException != null) {
                        exoPlaybackException.addSuppressed(exoPlaybackExceptionIobyxmoadg);
                        exoPlaybackExceptionIobyxmoadg = this.f10948bfopjjpdmp;
                    }
                    exoPlaybackException2 = exoPlaybackExceptionIobyxmoadg;
                    if (exoPlaybackException2.f10031istkbnxepw != 1 && this.f10965jpowsppfya.yggfygwlhe() != this.f10965jpowsppfya.esjtqupxsv()) {
                        while (this.f10965jpowsppfya.yggfygwlhe() != this.f10965jpowsppfya.esjtqupxsv()) {
                            this.f10965jpowsppfya.zoijcleaow();
                        }
                        yfnezrywwk yfnezrywwkVar = (yfnezrywwk) y2.iobyxmoadg.eablkybsjg(this.f10965jpowsppfya.yggfygwlhe());
                        uwvvkdfqfp();
                        ydmasvzmpa ydmasvzmpaVar = yfnezrywwkVar.f11644nufgyqmvbu;
                        androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar = ydmasvzmpaVar.f11629iobyxmoadg;
                        long j13 = ydmasvzmpaVar.f11634zoijcleaow;
                        this.f10984sopmlzcsov = crxdokpmqz(zoijcleaowVar, j13, ydmasvzmpaVar.f11632ppxfxbqfkf, j13, true, 0);
                    }
                    if (exoPlaybackException2.f10035ylkuphrtab || !(this.f10948bfopjjpdmp == null || (i13 = exoPlaybackException2.f9641zdlpuopuiu) == 5004 || i13 == 5003)) {
                        y2.kcexrzcfyt.wkgbmnqykc("ExoPlayerImplInternal", "Playback error", exoPlaybackException2);
                        L(true, false);
                        this.f10984sopmlzcsov = this.f10984sopmlzcsov.gxszxtbevo(exoPlaybackException2);
                    } else {
                        y2.kcexrzcfyt.dxjokdxxww("ExoPlayerImplInternal", "Recoverable renderer error", exoPlaybackException2);
                        if (this.f10948bfopjjpdmp == null) {
                            this.f10948bfopjjpdmp = exoPlaybackException2;
                        }
                        y2.ojitshcjhn ojitshcjhnVar = this.f10980pmvmpeiblj;
                        ojitshcjhnVar.dxjokdxxww(ojitshcjhnVar.wkgbmnqykc(25, exoPlaybackException2));
                    }
                }
            } else {
                exoPlaybackException = this.f10948bfopjjpdmp;
                if (exoPlaybackException != null) {
                    exoPlaybackException.addSuppressed(exoPlaybackExceptionIobyxmoadg);
                    exoPlaybackExceptionIobyxmoadg = this.f10948bfopjjpdmp;
                }
                exoPlaybackException2 = exoPlaybackExceptionIobyxmoadg;
                if (exoPlaybackException2.f10031istkbnxepw != 1) {
                }
                if (exoPlaybackException2.f10035ylkuphrtab) {
                    y2.kcexrzcfyt.wkgbmnqykc("ExoPlayerImplInternal", "Playback error", exoPlaybackException2);
                    L(true, false);
                    this.f10984sopmlzcsov = this.f10984sopmlzcsov.gxszxtbevo(exoPlaybackException2);
                } else {
                    y2.kcexrzcfyt.wkgbmnqykc("ExoPlayerImplInternal", "Playback error", exoPlaybackException2);
                    L(true, false);
                    this.f10984sopmlzcsov = this.f10984sopmlzcsov.gxszxtbevo(exoPlaybackException2);
                }
            }
        } catch (DrmSession.DrmSessionException e16) {
            stevsuqkhv(e16, e16.f10447zdlpuopuiu);
        } catch (BehindLiveWindowException e17) {
            stevsuqkhv(e17, 1002);
        } catch (IOException e18) {
            stevsuqkhv(e18, 2000);
        } catch (RuntimeException e19) {
            ExoPlaybackException exoPlaybackExceptionNufgyqmvbu = ExoPlaybackException.nufgyqmvbu(e19, ((e19 instanceof IllegalStateException) || (e19 instanceof IllegalArgumentException)) ? GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION : 1000);
            y2.kcexrzcfyt.wkgbmnqykc("ExoPlayerImplInternal", "Playback error", exoPlaybackExceptionNufgyqmvbu);
            L(true, false);
            this.f10984sopmlzcsov = this.f10984sopmlzcsov.gxszxtbevo(exoPlaybackExceptionNufgyqmvbu);
        }
        uwvvkdfqfp();
        return true;
    }

    public Looper hcddaimhww() {
        return this.f10960istkbnxepw;
    }

    public synchronized boolean igdgnonuha() {
        if (!this.f10964jlmebxxoox && this.f10960istkbnxepw.getThread().isAlive()) {
            this.f10980pmvmpeiblj.nufgyqmvbu(7);
            b0(new xa.vdvldrhtss() { // from class: androidx.media3.exoplayer.okpsazkaxt
                @Override // xa.vdvldrhtss
                public final Object get() {
                    return this.f10929zdlpuopuiu.jztzpxfvev();
                }
            }, this.f10954dsvhmnatus);
            return this.f10964jlmebxxoox;
        }
        return true;
    }

    @Override // o3.cdpycssgdh.iobyxmoadg
    public void iobyxmoadg(wizcaqwiak wizcaqwiakVar) {
        this.f10980pmvmpeiblj.nufgyqmvbu(26);
    }

    @Override // androidx.media3.exoplayer.source.lmojexxdyd.iobyxmoadg
    /* JADX INFO: renamed from: iwxlajgraz, reason: merged with bridge method [inline-methods] */
    public void lqeggnwhkg(androidx.media3.exoplayer.source.vdvldrhtss vdvldrhtssVar) {
        this.f10980pmvmpeiblj.wkgbmnqykc(9, vdvldrhtssVar).iobyxmoadg();
    }

    public void m(List list, int i13, long j13, m3.kcexrzcfyt kcexrzcfytVar) {
        this.f10980pmvmpeiblj.wkgbmnqykc(17, new zoijcleaow(list, kcexrzcfytVar, i13, j13, null)).iobyxmoadg();
    }

    @Override // androidx.media3.exoplayer.gtknphoqwx.iobyxmoadg
    public void nufgyqmvbu(v2.cqumvgiudr cqumvgiudrVar) {
        this.f10980pmvmpeiblj.wkgbmnqykc(16, cqumvgiudrVar).iobyxmoadg();
    }

    public void p(boolean z13, int i13, int i14) {
        this.f10980pmvmpeiblj.gxszxtbevo(1, z13 ? 1 : 0, i13 | (i14 << 4)).iobyxmoadg();
    }

    @Override // androidx.media3.exoplayer.dvvnrvtcbc.wkgbmnqykc
    public void ppxfxbqfkf() {
        this.f10980pmvmpeiblj.gtknphoqwx(2);
        this.f10980pmvmpeiblj.nufgyqmvbu(22);
    }

    public void r(v2.cqumvgiudr cqumvgiudrVar) {
        this.f10980pmvmpeiblj.wkgbmnqykc(4, cqumvgiudrVar).iobyxmoadg();
    }

    public void u(int i13) {
        this.f10980pmvmpeiblj.gxszxtbevo(11, i13, 0).iobyxmoadg();
    }

    @Override // androidx.media3.exoplayer.lqeggnwhkg.iobyxmoadg
    public void wkgbmnqykc(float f13) {
        this.f10980pmvmpeiblj.nufgyqmvbu(34);
    }

    public void x(boolean z13) {
        this.f10980pmvmpeiblj.gxszxtbevo(12, z13 ? 1 : 0, 0).iobyxmoadg();
    }

    public void yadqdtsiqt(long j13) {
        this.f10978opjhrmiecq = j13;
    }

    @Override // o3.cdpycssgdh.iobyxmoadg
    public void zoijcleaow() {
        this.f10980pmvmpeiblj.nufgyqmvbu(10);
    }
}
