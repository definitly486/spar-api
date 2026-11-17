package g3;

import android.os.Looper;
import android.util.SparseArray;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.audio.AudioSink;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class bfopjjpdmp implements g3.iobyxmoadg {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final SparseArray f35896cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private y2.oxmwwwfdhm f35897esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final iobyxmoadg f35898iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final v2.cdpycssgdh.ppxfxbqfkf f35899jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private v2.esjtqupxsv f35900lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private y2.ojitshcjhn f35901pmvmpeiblj;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final v2.cdpycssgdh.zoijcleaow f35902yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final y2.dxjokdxxww f35903zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private boolean f35904zynmafqrjb;

    private static final class iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow f35905eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow f35906gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final v2.cdpycssgdh.zoijcleaow f35907iobyxmoadg;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow f35909wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private com.google.common.collect.zdlpuopuiu f35910zoijcleaow = com.google.common.collect.zdlpuopuiu.zynmafqrjb();

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private com.google.common.collect.yggfygwlhe f35908ppxfxbqfkf = com.google.common.collect.yggfygwlhe.kcexrzcfyt();

        public iobyxmoadg(v2.cdpycssgdh.zoijcleaow zoijcleaowVar) {
            this.f35907iobyxmoadg = zoijcleaowVar;
        }

        private static boolean dxjokdxxww(androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar, Object obj, boolean z13, int i13, int i14, int i15) {
            if (zoijcleaowVar.f11262iobyxmoadg.equals(obj)) {
                return (z13 && zoijcleaowVar.f11265zoijcleaow == i13 && zoijcleaowVar.f11263ppxfxbqfkf == i14) || (!z13 && zoijcleaowVar.f11265zoijcleaow == -1 && zoijcleaowVar.f11261eablkybsjg == i15);
            }
            return false;
        }

        private static androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow ppxfxbqfkf(v2.esjtqupxsv esjtqupxsvVar, com.google.common.collect.zdlpuopuiu zdlpuopuiuVar, androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar, v2.cdpycssgdh.zoijcleaow zoijcleaowVar2) {
            v2.cdpycssgdh cdpycssgdhVarJyumaefscl = esjtqupxsvVar.jyumaefscl();
            int iPkzmftpjix = esjtqupxsvVar.pkzmftpjix();
            Object objWflxmlrfwp = cdpycssgdhVarJyumaefscl.vdvldrhtss() ? null : cdpycssgdhVarJyumaefscl.wflxmlrfwp(iPkzmftpjix);
            int iWkgbmnqykc = (esjtqupxsvVar.ppxfxbqfkf() || cdpycssgdhVarJyumaefscl.vdvldrhtss()) ? -1 : cdpycssgdhVarJyumaefscl.gxszxtbevo(iPkzmftpjix, zoijcleaowVar2).wkgbmnqykc(y2.stevsuqkhv.ixidwrxhsl(esjtqupxsvVar.ikoacuggdj()) - zoijcleaowVar2.agtfadlqog());
            for (int i13 = 0; i13 < zdlpuopuiuVar.size(); i13++) {
                androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar3 = (androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow) zdlpuopuiuVar.get(i13);
                if (dxjokdxxww(zoijcleaowVar3, objWflxmlrfwp, esjtqupxsvVar.ppxfxbqfkf(), esjtqupxsvVar.oxmwwwfdhm(), esjtqupxsvVar.cllcsxoeiz(), iWkgbmnqykc)) {
                    return zoijcleaowVar3;
                }
            }
            if (zdlpuopuiuVar.isEmpty() && zoijcleaowVar != null) {
                if (dxjokdxxww(zoijcleaowVar, objWflxmlrfwp, esjtqupxsvVar.ppxfxbqfkf(), esjtqupxsvVar.oxmwwwfdhm(), esjtqupxsvVar.cllcsxoeiz(), iWkgbmnqykc)) {
                    return zoijcleaowVar;
                }
            }
            return null;
        }

        private void wflxmlrfwp(v2.cdpycssgdh cdpycssgdhVar) {
            com.google.common.collect.yggfygwlhe.iobyxmoadg iobyxmoadgVarIobyxmoadg = com.google.common.collect.yggfygwlhe.iobyxmoadg();
            if (this.f35910zoijcleaow.isEmpty()) {
                zoijcleaow(iobyxmoadgVarIobyxmoadg, this.f35905eablkybsjg, cdpycssgdhVar);
                if (!Objects.equals(this.f35906gxszxtbevo, this.f35905eablkybsjg)) {
                    zoijcleaow(iobyxmoadgVarIobyxmoadg, this.f35906gxszxtbevo, cdpycssgdhVar);
                }
                if (!Objects.equals(this.f35909wkgbmnqykc, this.f35905eablkybsjg) && !Objects.equals(this.f35909wkgbmnqykc, this.f35906gxszxtbevo)) {
                    zoijcleaow(iobyxmoadgVarIobyxmoadg, this.f35909wkgbmnqykc, cdpycssgdhVar);
                }
            } else {
                for (int i13 = 0; i13 < this.f35910zoijcleaow.size(); i13++) {
                    zoijcleaow(iobyxmoadgVarIobyxmoadg, (androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow) this.f35910zoijcleaow.get(i13), cdpycssgdhVar);
                }
                if (!this.f35910zoijcleaow.contains(this.f35909wkgbmnqykc)) {
                    zoijcleaow(iobyxmoadgVarIobyxmoadg, this.f35909wkgbmnqykc, cdpycssgdhVar);
                }
            }
            this.f35908ppxfxbqfkf = iobyxmoadgVarIobyxmoadg.ppxfxbqfkf();
        }

        private void zoijcleaow(com.google.common.collect.yggfygwlhe.iobyxmoadg iobyxmoadgVar, androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar, v2.cdpycssgdh cdpycssgdhVar) {
            if (zoijcleaowVar == null) {
                return;
            }
            if (cdpycssgdhVar.zoijcleaow(zoijcleaowVar.f11262iobyxmoadg) != -1) {
                iobyxmoadgVar.gxszxtbevo(zoijcleaowVar, cdpycssgdhVar);
                return;
            }
            v2.cdpycssgdh cdpycssgdhVar2 = (v2.cdpycssgdh) this.f35908ppxfxbqfkf.get(zoijcleaowVar);
            if (cdpycssgdhVar2 != null) {
                iobyxmoadgVar.gxszxtbevo(zoijcleaowVar, cdpycssgdhVar2);
            }
        }

        public void btonecajqb(v2.esjtqupxsv esjtqupxsvVar) {
            this.f35909wkgbmnqykc = ppxfxbqfkf(esjtqupxsvVar, this.f35910zoijcleaow, this.f35905eablkybsjg, this.f35907iobyxmoadg);
        }

        public void draadjrbmk(v2.esjtqupxsv esjtqupxsvVar) {
            this.f35909wkgbmnqykc = ppxfxbqfkf(esjtqupxsvVar, this.f35910zoijcleaow, this.f35905eablkybsjg, this.f35907iobyxmoadg);
            wflxmlrfwp(esjtqupxsvVar.jyumaefscl());
        }

        public androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow eablkybsjg() {
            if (this.f35910zoijcleaow.isEmpty()) {
                return null;
            }
            return (androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow) com.google.common.collect.iwizpuwonk.wkgbmnqykc(this.f35910zoijcleaow);
        }

        public void gtknphoqwx(List list, androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar, v2.esjtqupxsv esjtqupxsvVar) {
            this.f35910zoijcleaow = com.google.common.collect.zdlpuopuiu.jyumaefscl(list);
            if (!list.isEmpty()) {
                this.f35905eablkybsjg = (androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow) list.get(0);
                this.f35906gxszxtbevo = (androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow) y2.iobyxmoadg.eablkybsjg(zoijcleaowVar);
            }
            if (this.f35909wkgbmnqykc == null) {
                this.f35909wkgbmnqykc = ppxfxbqfkf(esjtqupxsvVar, this.f35910zoijcleaow, this.f35905eablkybsjg, this.f35907iobyxmoadg);
            }
            wflxmlrfwp(esjtqupxsvVar.jyumaefscl());
        }

        public v2.cdpycssgdh gxszxtbevo(androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar) {
            return (v2.cdpycssgdh) this.f35908ppxfxbqfkf.get(zoijcleaowVar);
        }

        public androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow lqeggnwhkg() {
            return this.f35905eablkybsjg;
        }

        public androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow nufgyqmvbu() {
            return this.f35906gxszxtbevo;
        }

        public androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow wkgbmnqykc() {
            return this.f35909wkgbmnqykc;
        }
    }

    public bfopjjpdmp(y2.dxjokdxxww dxjokdxxwwVar) {
        this.f35903zdlpuopuiu = (y2.dxjokdxxww) y2.iobyxmoadg.eablkybsjg(dxjokdxxwwVar);
        this.f35897esjtqupxsv = new y2.oxmwwwfdhm(y2.stevsuqkhv.mbcevpiqjq(), dxjokdxxwwVar, new y2.oxmwwwfdhm.zoijcleaow() { // from class: g3.rgvfuqvkyq
            @Override // y2.oxmwwwfdhm.zoijcleaow
            public final void iobyxmoadg(Object obj, v2.rgvfuqvkyq rgvfuqvkyqVar) {
                bfopjjpdmp.Q((zoijcleaow) obj, rgvfuqvkyqVar);
            }
        });
        v2.cdpycssgdh.zoijcleaow zoijcleaowVar = new v2.cdpycssgdh.zoijcleaow();
        this.f35902yggfygwlhe = zoijcleaowVar;
        this.f35899jyumaefscl = new v2.cdpycssgdh.ppxfxbqfkf();
        this.f35898iwizpuwonk = new iobyxmoadg(zoijcleaowVar);
        this.f35896cqumvgiudr = new SparseArray();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void I0(zoijcleaow.iobyxmoadg iobyxmoadgVar, int i13, v2.esjtqupxsv.eablkybsjg eablkybsjgVar, v2.esjtqupxsv.eablkybsjg eablkybsjgVar2, zoijcleaow zoijcleaowVar) {
        zoijcleaowVar.zfvoamnweg(iobyxmoadgVar, i13);
        zoijcleaowVar.esjtqupxsv(iobyxmoadgVar, eablkybsjgVar, eablkybsjgVar2, i13);
    }

    private zoijcleaow.iobyxmoadg J(androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar) {
        y2.iobyxmoadg.eablkybsjg(this.f35900lereixgezr);
        v2.cdpycssgdh cdpycssgdhVarGxszxtbevo = zoijcleaowVar == null ? null : this.f35898iwizpuwonk.gxszxtbevo(zoijcleaowVar);
        if (zoijcleaowVar != null && cdpycssgdhVarGxszxtbevo != null) {
            return K(cdpycssgdhVarGxszxtbevo, cdpycssgdhVarGxszxtbevo.nufgyqmvbu(zoijcleaowVar.f11262iobyxmoadg, this.f35902yggfygwlhe).f115304ppxfxbqfkf, zoijcleaowVar);
        }
        int iMbcevpiqjq = this.f35900lereixgezr.mbcevpiqjq();
        v2.cdpycssgdh cdpycssgdhVarJyumaefscl = this.f35900lereixgezr.jyumaefscl();
        if (iMbcevpiqjq >= cdpycssgdhVarJyumaefscl.rgvfuqvkyq()) {
            cdpycssgdhVarJyumaefscl = v2.cdpycssgdh.f115259iobyxmoadg;
        }
        return K(cdpycssgdhVarJyumaefscl, iMbcevpiqjq, null);
    }

    private zoijcleaow.iobyxmoadg L() {
        return J(this.f35898iwizpuwonk.eablkybsjg());
    }

    private zoijcleaow.iobyxmoadg M(int i13, androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar) {
        y2.iobyxmoadg.eablkybsjg(this.f35900lereixgezr);
        if (zoijcleaowVar != null) {
            return this.f35898iwizpuwonk.gxszxtbevo(zoijcleaowVar) != null ? J(zoijcleaowVar) : K(v2.cdpycssgdh.f115259iobyxmoadg, i13, zoijcleaowVar);
        }
        v2.cdpycssgdh cdpycssgdhVarJyumaefscl = this.f35900lereixgezr.jyumaefscl();
        if (i13 >= cdpycssgdhVarJyumaefscl.rgvfuqvkyq()) {
            cdpycssgdhVarJyumaefscl = v2.cdpycssgdh.f115259iobyxmoadg;
        }
        return K(cdpycssgdhVarJyumaefscl, i13, null);
    }

    private zoijcleaow.iobyxmoadg N() {
        return J(this.f35898iwizpuwonk.lqeggnwhkg());
    }

    private zoijcleaow.iobyxmoadg O() {
        return J(this.f35898iwizpuwonk.nufgyqmvbu());
    }

    private zoijcleaow.iobyxmoadg P(PlaybackException playbackException) {
        androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar;
        return (!(playbackException instanceof ExoPlaybackException) || (zoijcleaowVar = ((ExoPlaybackException) playbackException).f10033wwaezpbzkn) == null) ? I() : J(zoijcleaowVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void Q(zoijcleaow zoijcleaowVar, v2.rgvfuqvkyq rgvfuqvkyqVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void T(zoijcleaow.iobyxmoadg iobyxmoadgVar, String str, long j13, long j14, zoijcleaow zoijcleaowVar) {
        zoijcleaowVar.okpsazkaxt(iobyxmoadgVar, str, j13);
        zoijcleaowVar.cqumvgiudr(iobyxmoadgVar, str, j14, j13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void T0(zoijcleaow.iobyxmoadg iobyxmoadgVar, String str, long j13, long j14, zoijcleaow zoijcleaowVar) {
        zoijcleaowVar.rgvfuqvkyq(iobyxmoadgVar, str, j13);
        zoijcleaowVar.wkgbmnqykc(iobyxmoadgVar, str, j14, j13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void Z0(zoijcleaow.iobyxmoadg iobyxmoadgVar, v2.jpowsppfya jpowsppfyaVar, zoijcleaow zoijcleaowVar) {
        zoijcleaowVar.agtfadlqog(iobyxmoadgVar, jpowsppfyaVar);
        zoijcleaowVar.mbcevpiqjq(iobyxmoadgVar, jpowsppfyaVar.f115378iobyxmoadg, jpowsppfyaVar.f115381zoijcleaow, 0, jpowsppfyaVar.f115380wkgbmnqykc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b1(v2.esjtqupxsv esjtqupxsvVar, zoijcleaow zoijcleaowVar, v2.rgvfuqvkyq rgvfuqvkyqVar) {
        zoijcleaowVar.ulzqkzuiru(esjtqupxsvVar, new zoijcleaow.C0813zoijcleaow(rgvfuqvkyqVar, this.f35896cqumvgiudr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c1() {
        final zoijcleaow.iobyxmoadg iobyxmoadgVarI = I();
        d1(iobyxmoadgVarI, 1028, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.cdpycssgdh
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                ((zoijcleaow) obj).jztzpxfvev(iobyxmoadgVarI);
            }
        });
        this.f35897esjtqupxsv.btonecajqb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void o0(zoijcleaow.iobyxmoadg iobyxmoadgVar, int i13, zoijcleaow zoijcleaowVar) {
        zoijcleaowVar.opjhrmiecq(iobyxmoadgVar);
        zoijcleaowVar.ojitshcjhn(iobyxmoadgVar, i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void s0(zoijcleaow.iobyxmoadg iobyxmoadgVar, boolean z13, zoijcleaow zoijcleaowVar) {
        zoijcleaowVar.zdlpuopuiu(iobyxmoadgVar, z13);
        zoijcleaowVar.jyumaefscl(iobyxmoadgVar, z13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void x0(zoijcleaow.iobyxmoadg iobyxmoadgVar, m3.dxjokdxxww dxjokdxxwwVar, m3.btonecajqb btonecajqbVar, int i13, zoijcleaow zoijcleaowVar) {
        zoijcleaowVar.zynmafqrjb(iobyxmoadgVar, dxjokdxxwwVar, btonecajqbVar);
        zoijcleaowVar.stevsuqkhv(iobyxmoadgVar, dxjokdxxwwVar, btonecajqbVar, i13);
    }

    protected final zoijcleaow.iobyxmoadg I() {
        return J(this.f35898iwizpuwonk.wkgbmnqykc());
    }

    protected final zoijcleaow.iobyxmoadg K(v2.cdpycssgdh cdpycssgdhVar, int i13, androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar) {
        androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar2 = cdpycssgdhVar.vdvldrhtss() ? null : zoijcleaowVar;
        long jElapsedRealtime = this.f35903zdlpuopuiu.elapsedRealtime();
        boolean z13 = cdpycssgdhVar.equals(this.f35900lereixgezr.jyumaefscl()) && i13 == this.f35900lereixgezr.mbcevpiqjq();
        long jZoijcleaow = 0;
        if (zoijcleaowVar2 == null || !zoijcleaowVar2.zoijcleaow()) {
            if (z13) {
                jZoijcleaow = this.f35900lereixgezr.stevsuqkhv();
            } else if (!cdpycssgdhVar.vdvldrhtss()) {
                jZoijcleaow = cdpycssgdhVar.agtfadlqog(i13, this.f35899jyumaefscl).zoijcleaow();
            }
        } else if (z13 && this.f35900lereixgezr.oxmwwwfdhm() == zoijcleaowVar2.f11265zoijcleaow && this.f35900lereixgezr.cllcsxoeiz() == zoijcleaowVar2.f11263ppxfxbqfkf) {
            jZoijcleaow = this.f35900lereixgezr.ikoacuggdj();
        }
        return new zoijcleaow.iobyxmoadg(jElapsedRealtime, cdpycssgdhVar, i13, zoijcleaowVar2, jZoijcleaow, this.f35900lereixgezr.jyumaefscl(), this.f35900lereixgezr.mbcevpiqjq(), this.f35898iwizpuwonk.wkgbmnqykc(), this.f35900lereixgezr.ikoacuggdj(), this.f35900lereixgezr.wkgbmnqykc());
    }

    @Override // g3.iobyxmoadg
    public final void agtfadlqog(final long j13) {
        final zoijcleaow.iobyxmoadg iobyxmoadgVarO = O();
        d1(iobyxmoadgVarO, 1010, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.lmojexxdyd
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                ((zoijcleaow) obj).eablkybsjg(iobyxmoadgVarO, j13);
            }
        });
    }

    @Override // v2.esjtqupxsv.wkgbmnqykc
    public void bfopjjpdmp(final boolean z13) {
        final zoijcleaow.iobyxmoadg iobyxmoadgVarI = I();
        d1(iobyxmoadgVarI, 7, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.lqeggnwhkg
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                ((zoijcleaow) obj).ylkuphrtab(iobyxmoadgVarI, z13);
            }
        });
    }

    @Override // g3.iobyxmoadg
    public final void btonecajqb(final String str) {
        final zoijcleaow.iobyxmoadg iobyxmoadgVarO = O();
        d1(iobyxmoadgVarO, 1012, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.xrmfcynszj
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                ((zoijcleaow) obj).sopmlzcsov(iobyxmoadgVarO, str);
            }
        });
    }

    @Override // g3.iobyxmoadg
    public final void cdpycssgdh(List list, androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar) {
        this.f35898iwizpuwonk.gtknphoqwx(list, zoijcleaowVar, (v2.esjtqupxsv) y2.iobyxmoadg.eablkybsjg(this.f35900lereixgezr));
    }

    @Override // v2.esjtqupxsv.wkgbmnqykc
    public void cllcsxoeiz() {
    }

    @Override // g3.iobyxmoadg
    public final void cqumvgiudr(final f3.zoijcleaow zoijcleaowVar) {
        final zoijcleaow.iobyxmoadg iobyxmoadgVarN = N();
        d1(iobyxmoadgVarN, 1020, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.zynmafqrjb
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                ((zoijcleaow) obj).wwaezpbzkn(iobyxmoadgVarN, zoijcleaowVar);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.nufgyqmvbu
    public final void crxdokpmqz(int i13, androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar, final Exception exc) {
        final zoijcleaow.iobyxmoadg iobyxmoadgVarM = M(i13, zoijcleaowVar);
        d1(iobyxmoadgVarM, UserVerificationMethods.USER_VERIFY_ALL, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.ikoacuggdj
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                ((zoijcleaow) obj).vdvldrhtss(iobyxmoadgVarM, exc);
            }
        });
    }

    @Override // v2.esjtqupxsv.wkgbmnqykc
    public final void czzsidtyhn(final int i13) {
        final zoijcleaow.iobyxmoadg iobyxmoadgVarI = I();
        d1(iobyxmoadgVarI, 8, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.jyumaefscl
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                ((zoijcleaow) obj).istkbnxepw(iobyxmoadgVarI, i13);
            }
        });
    }

    protected final void d1(zoijcleaow.iobyxmoadg iobyxmoadgVar, int i13, y2.oxmwwwfdhm.iobyxmoadg iobyxmoadgVar2) {
        this.f35896cqumvgiudr.put(i13, iobyxmoadgVar);
        this.f35897esjtqupxsv.draadjrbmk(i13, iobyxmoadgVar2);
    }

    @Override // v2.esjtqupxsv.wkgbmnqykc
    public void draadjrbmk(final x2.zoijcleaow zoijcleaowVar) {
        final zoijcleaow.iobyxmoadg iobyxmoadgVarI = I();
        d1(iobyxmoadgVarI, 27, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.esjtqupxsv
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                ((zoijcleaow) obj).iobyxmoadg(iobyxmoadgVarI, zoijcleaowVar);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.kcexrzcfyt
    public final void dsvhmnatus(int i13, androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar, final m3.dxjokdxxww dxjokdxxwwVar, final m3.btonecajqb btonecajqbVar, final int i14) {
        final zoijcleaow.iobyxmoadg iobyxmoadgVarM = M(i13, zoijcleaowVar);
        d1(iobyxmoadgVarM, 1000, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.istkbnxepw
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                bfopjjpdmp.x0(iobyxmoadgVarM, dxjokdxxwwVar, btonecajqbVar, i14, (zoijcleaow) obj);
            }
        });
    }

    @Override // g3.iobyxmoadg
    public final void dxjokdxxww(final f3.zoijcleaow zoijcleaowVar) {
        final zoijcleaow.iobyxmoadg iobyxmoadgVarO = O();
        d1(iobyxmoadgVarO, 1007, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.yadqdtsiqt
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                ((zoijcleaow) obj).iwizpuwonk(iobyxmoadgVarO, zoijcleaowVar);
            }
        });
    }

    @Override // g3.iobyxmoadg
    public final void eablkybsjg(final Exception exc) {
        final zoijcleaow.iobyxmoadg iobyxmoadgVarO = O();
        d1(iobyxmoadgVarO, 1014, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.sopmlzcsov
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                ((zoijcleaow) obj).btonecajqb(iobyxmoadgVarO, exc);
            }
        });
    }

    @Override // g3.iobyxmoadg
    public final void esjtqupxsv(final int i13, final long j13, final long j14) {
        final zoijcleaow.iobyxmoadg iobyxmoadgVarO = O();
        d1(iobyxmoadgVarO, 1011, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.vipkmwdibw
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                ((zoijcleaow) obj).oxmwwwfdhm(iobyxmoadgVarO, i13, j13, j14);
            }
        });
    }

    @Override // g3.iobyxmoadg
    public final void gtknphoqwx(final String str, final long j13, final long j14) {
        final zoijcleaow.iobyxmoadg iobyxmoadgVarO = O();
        d1(iobyxmoadgVarO, 1008, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.nufgyqmvbu
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                bfopjjpdmp.T(iobyxmoadgVarO, str, j14, j13, (zoijcleaow) obj);
            }
        });
    }

    @Override // g3.iobyxmoadg
    public final void gxszxtbevo(final String str) {
        final zoijcleaow.iobyxmoadg iobyxmoadgVarO = O();
        d1(iobyxmoadgVarO, 1019, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.btonecajqb
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                ((zoijcleaow) obj).jhduphickx(iobyxmoadgVarO, str);
            }
        });
    }

    @Override // v2.esjtqupxsv.wkgbmnqykc
    public void hcddaimhww(final int i13, final boolean z13) {
        final zoijcleaow.iobyxmoadg iobyxmoadgVarI = I();
        d1(iobyxmoadgVarI, 30, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.ylkuphrtab
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                ((zoijcleaow) obj).gxszxtbevo(iobyxmoadgVarI, i13, z13);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.kcexrzcfyt
    public final void hkdspvbjdz(int i13, androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar, final m3.btonecajqb btonecajqbVar) {
        final zoijcleaow.iobyxmoadg iobyxmoadgVarM = M(i13, zoijcleaowVar);
        d1(iobyxmoadgVarM, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.pmvmpeiblj
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                ((zoijcleaow) obj).wypolnanlu(iobyxmoadgVarM, btonecajqbVar);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.kcexrzcfyt
    public final void ikoacuggdj(int i13, androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar, final m3.dxjokdxxww dxjokdxxwwVar, final m3.btonecajqb btonecajqbVar) {
        final zoijcleaow.iobyxmoadg iobyxmoadgVarM = M(i13, zoijcleaowVar);
        d1(iobyxmoadgVarM, 1001, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.dsvhmnatus
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                ((zoijcleaow) obj).nufgyqmvbu(iobyxmoadgVarM, dxjokdxxwwVar, btonecajqbVar);
            }
        });
    }

    @Override // g3.iobyxmoadg
    public void iobyxmoadg(final AudioSink.iobyxmoadg iobyxmoadgVar) {
        final zoijcleaow.iobyxmoadg iobyxmoadgVarO = O();
        d1(iobyxmoadgVarO, 1031, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.czzsidtyhn
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                ((zoijcleaow) obj).ntlheqmsrt(iobyxmoadgVarO, iobyxmoadgVar);
            }
        });
    }

    @Override // v2.esjtqupxsv.wkgbmnqykc
    public final void iozdgvuglv(final int i13) {
        final zoijcleaow.iobyxmoadg iobyxmoadgVarI = I();
        d1(iobyxmoadgVarI, 4, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.oxmwwwfdhm
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                ((zoijcleaow) obj).hkdspvbjdz(iobyxmoadgVarI, i13);
            }
        });
    }

    @Override // p3.wkgbmnqykc.iobyxmoadg
    public final void istkbnxepw(final int i13, final long j13, final long j14) {
        final zoijcleaow.iobyxmoadg iobyxmoadgVarL = L();
        d1(iobyxmoadgVarL, 1006, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.jlmebxxoox
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                ((zoijcleaow) obj).crxdokpmqz(iobyxmoadgVarL, i13, j13, j14);
            }
        });
    }

    @Override // g3.iobyxmoadg
    public final void iwizpuwonk(final Exception exc) {
        final zoijcleaow.iobyxmoadg iobyxmoadgVarO = O();
        d1(iobyxmoadgVarO, 1029, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.iwizpuwonk
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                ((zoijcleaow) obj).zoijcleaow(iobyxmoadgVarO, exc);
            }
        });
    }

    @Override // v2.esjtqupxsv.wkgbmnqykc
    public void jhduphickx(final v2.wflxmlrfwp wflxmlrfwpVar) {
        final zoijcleaow.iobyxmoadg iobyxmoadgVarI = I();
        d1(iobyxmoadgVarI, 29, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.cllcsxoeiz
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                ((zoijcleaow) obj).sflfametgt(iobyxmoadgVarI, wflxmlrfwpVar);
            }
        });
    }

    @Override // v2.esjtqupxsv.wkgbmnqykc
    public void jlmebxxoox(final v2.esjtqupxsv.zoijcleaow zoijcleaowVar) {
        final zoijcleaow.iobyxmoadg iobyxmoadgVarI = I();
        d1(iobyxmoadgVarI, 13, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.ydmasvzmpa
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                ((zoijcleaow) obj).nuxfzjnpeb(iobyxmoadgVarI, zoijcleaowVar);
            }
        });
    }

    @Override // v2.esjtqupxsv.wkgbmnqykc
    public void jpowsppfya(final v2.yggfygwlhe yggfygwlheVar) {
        final zoijcleaow.iobyxmoadg iobyxmoadgVarI = I();
        d1(iobyxmoadgVarI, 14, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.pkzmftpjix
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                ((zoijcleaow) obj).oipsdeybqn(iobyxmoadgVarI, yggfygwlheVar);
            }
        });
    }

    @Override // g3.iobyxmoadg
    public final void jyumaefscl(final Object obj, final long j13) {
        final zoijcleaow.iobyxmoadg iobyxmoadgVarO = O();
        d1(iobyxmoadgVarO, 26, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.ulzqkzuiru
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj2) {
                ((zoijcleaow) obj2).iyctptxqzt(iobyxmoadgVarO, obj, j13);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.nufgyqmvbu
    public final void jztzpxfvev(int i13, androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar) {
        final zoijcleaow.iobyxmoadg iobyxmoadgVarM = M(i13, zoijcleaowVar);
        d1(iobyxmoadgVarM, 1025, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.uwvvkdfqfp
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                ((zoijcleaow) obj).cdpycssgdh(iobyxmoadgVarM);
            }
        });
    }

    @Override // g3.iobyxmoadg
    public final void kcexrzcfyt(final f3.zoijcleaow zoijcleaowVar) {
        final zoijcleaow.iobyxmoadg iobyxmoadgVarO = O();
        d1(iobyxmoadgVarO, 1015, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.mbcevpiqjq
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                ((zoijcleaow) obj).ikoacuggdj(iobyxmoadgVarO, zoijcleaowVar);
            }
        });
    }

    @Override // v2.esjtqupxsv.wkgbmnqykc
    public final void kegysxyocb(final v2.kcexrzcfyt kcexrzcfytVar, final int i13) {
        final zoijcleaow.iobyxmoadg iobyxmoadgVarI = I();
        d1(iobyxmoadgVarI, 1, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.zfvoamnweg
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                ((zoijcleaow) obj).kcexrzcfyt(iobyxmoadgVarI, kcexrzcfytVar, i13);
            }
        });
    }

    @Override // g3.iobyxmoadg
    public final void lereixgezr(final long j13, final int i13) {
        final zoijcleaow.iobyxmoadg iobyxmoadgVarN = N();
        d1(iobyxmoadgVarN, 1021, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.hcddaimhww
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                ((zoijcleaow) obj).dsvhmnatus(iobyxmoadgVarN, j13, i13);
            }
        });
    }

    @Override // g3.iobyxmoadg
    public final void lmojexxdyd() {
        if (this.f35904zynmafqrjb) {
            return;
        }
        final zoijcleaow.iobyxmoadg iobyxmoadgVarI = I();
        this.f35904zynmafqrjb = true;
        d1(iobyxmoadgVarI, -1, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.kcexrzcfyt
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                ((zoijcleaow) obj).zeieaojujs(iobyxmoadgVarI);
            }
        });
    }

    @Override // g3.iobyxmoadg
    public final void lqeggnwhkg(final String str, final long j13, final long j14) {
        final zoijcleaow.iobyxmoadg iobyxmoadgVarO = O();
        d1(iobyxmoadgVarO, 1016, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.cqumvgiudr
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                bfopjjpdmp.T0(iobyxmoadgVarO, str, j14, j13, (zoijcleaow) obj);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.nufgyqmvbu
    public final void mbcevpiqjq(int i13, androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar, final int i14) {
        final zoijcleaow.iobyxmoadg iobyxmoadgVarM = M(i13, zoijcleaowVar);
        d1(iobyxmoadgVarM, 1022, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.jhduphickx
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                bfopjjpdmp.o0(iobyxmoadgVarM, i14, (zoijcleaow) obj);
            }
        });
    }

    @Override // v2.esjtqupxsv.wkgbmnqykc
    public final void metgxyhuhe(final boolean z13, final int i13) {
        final zoijcleaow.iobyxmoadg iobyxmoadgVarI = I();
        d1(iobyxmoadgVarI, -1, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.eablkybsjg
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                ((zoijcleaow) obj).ribwqtqdhb(iobyxmoadgVarI, z13, i13);
            }
        });
    }

    @Override // v2.esjtqupxsv.wkgbmnqykc
    public final void ntlheqmsrt(final PlaybackException playbackException) {
        final zoijcleaow.iobyxmoadg iobyxmoadgVarP = P(playbackException);
        d1(iobyxmoadgVarP, 10, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.vdvldrhtss
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                ((zoijcleaow) obj).uwvvkdfqfp(iobyxmoadgVarP, playbackException);
            }
        });
    }

    @Override // v2.esjtqupxsv.wkgbmnqykc
    public final void nufgyqmvbu(final v2.cqumvgiudr cqumvgiudrVar) {
        final zoijcleaow.iobyxmoadg iobyxmoadgVarI = I();
        d1(iobyxmoadgVarI, 12, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.ppxfxbqfkf
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                ((zoijcleaow) obj).tzroggbefp(iobyxmoadgVarI, cqumvgiudrVar);
            }
        });
    }

    @Override // v2.esjtqupxsv.wkgbmnqykc
    public void oipsdeybqn(v2.esjtqupxsv esjtqupxsvVar, v2.esjtqupxsv.ppxfxbqfkf ppxfxbqfkfVar) {
    }

    @Override // g3.iobyxmoadg
    public final void ojitshcjhn(final Exception exc) {
        final zoijcleaow.iobyxmoadg iobyxmoadgVarO = O();
        d1(iobyxmoadgVarO, 1030, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.oipsdeybqn
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                ((zoijcleaow) obj).cllcsxoeiz(iobyxmoadgVarO, exc);
            }
        });
    }

    @Override // v2.esjtqupxsv.wkgbmnqykc
    public final void okpsazkaxt(final boolean z13) {
        final zoijcleaow.iobyxmoadg iobyxmoadgVarI = I();
        d1(iobyxmoadgVarI, 3, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.ntlheqmsrt
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                bfopjjpdmp.s0(iobyxmoadgVarI, z13, (zoijcleaow) obj);
            }
        });
    }

    @Override // g3.iobyxmoadg
    public final void oxmwwwfdhm(final androidx.media3.common.iobyxmoadg iobyxmoadgVar, final f3.ppxfxbqfkf ppxfxbqfkfVar) {
        final zoijcleaow.iobyxmoadg iobyxmoadgVarO = O();
        d1(iobyxmoadgVarO, 1017, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.wypolnanlu
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                ((zoijcleaow) obj).lrnfpwlwnk(iobyxmoadgVarO, iobyxmoadgVar, ppxfxbqfkfVar);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.nufgyqmvbu
    public final void pkzmftpjix(int i13, androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar) {
        final zoijcleaow.iobyxmoadg iobyxmoadgVarM = M(i13, zoijcleaowVar);
        d1(iobyxmoadgVarM, 1023, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.yfnezrywwk
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                ((zoijcleaow) obj).yggfygwlhe(iobyxmoadgVarM);
            }
        });
    }

    @Override // v2.esjtqupxsv.wkgbmnqykc
    public final void pmvmpeiblj(final int i13) {
        final zoijcleaow.iobyxmoadg iobyxmoadgVarI = I();
        d1(iobyxmoadgVarI, 6, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.dxjokdxxww
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                ((zoijcleaow) obj).vipkmwdibw(iobyxmoadgVarI, i13);
            }
        });
    }

    @Override // g3.iobyxmoadg
    public void ppxfxbqfkf(final AudioSink.iobyxmoadg iobyxmoadgVar) {
        final zoijcleaow.iobyxmoadg iobyxmoadgVarO = O();
        d1(iobyxmoadgVarO, 1032, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.okpsazkaxt
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                ((zoijcleaow) obj).jpowsppfya(iobyxmoadgVarO, iobyxmoadgVar);
            }
        });
    }

    @Override // g3.iobyxmoadg
    public void release() {
        ((y2.ojitshcjhn) y2.iobyxmoadg.dxjokdxxww(this.f35901pmvmpeiblj)).lqeggnwhkg(new Runnable() { // from class: g3.yggfygwlhe
            @Override // java.lang.Runnable
            public final void run() {
                this.f36105zdlpuopuiu.c1();
            }
        });
    }

    @Override // g3.iobyxmoadg
    public final void rgvfuqvkyq(final androidx.media3.common.iobyxmoadg iobyxmoadgVar, final f3.ppxfxbqfkf ppxfxbqfkfVar) {
        final zoijcleaow.iobyxmoadg iobyxmoadgVarO = O();
        d1(iobyxmoadgVarO, 1009, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.tzroggbefp
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                ((zoijcleaow) obj).iozdgvuglv(iobyxmoadgVarO, iobyxmoadgVar, ppxfxbqfkfVar);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.kcexrzcfyt
    public final void ribwqtqdhb(int i13, androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar, final m3.dxjokdxxww dxjokdxxwwVar, final m3.btonecajqb btonecajqbVar) {
        final zoijcleaow.iobyxmoadg iobyxmoadgVarM = M(i13, zoijcleaowVar);
        d1(iobyxmoadgVarM, 1002, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.jpowsppfya
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                ((zoijcleaow) obj).ppxfxbqfkf(iobyxmoadgVarM, dxjokdxxwwVar, btonecajqbVar);
            }
        });
    }

    @Override // v2.esjtqupxsv.wkgbmnqykc
    public final void rlfsiqarku(final v2.esjtqupxsv.eablkybsjg eablkybsjgVar, final v2.esjtqupxsv.eablkybsjg eablkybsjgVar2, final int i13) {
        if (i13 == 1) {
            this.f35904zynmafqrjb = false;
        }
        this.f35898iwizpuwonk.btonecajqb((v2.esjtqupxsv) y2.iobyxmoadg.eablkybsjg(this.f35900lereixgezr));
        final zoijcleaow.iobyxmoadg iobyxmoadgVarI = I();
        d1(iobyxmoadgVarI, 11, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.zdlpuopuiu
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                bfopjjpdmp.I0(iobyxmoadgVarI, i13, eablkybsjgVar, eablkybsjgVar2, (zoijcleaow) obj);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.nufgyqmvbu
    public final void sflfametgt(int i13, androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar) {
        final zoijcleaow.iobyxmoadg iobyxmoadgVarM = M(i13, zoijcleaowVar);
        d1(iobyxmoadgVarM, 1027, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.jztzpxfvev
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                ((zoijcleaow) obj).lmojexxdyd(iobyxmoadgVarM);
            }
        });
    }

    @Override // androidx.media3.exoplayer.drm.nufgyqmvbu
    public final void sopmlzcsov(int i13, androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar) {
        final zoijcleaow.iobyxmoadg iobyxmoadgVarM = M(i13, zoijcleaowVar);
        d1(iobyxmoadgVarM, 1026, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.rlfsiqarku
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                ((zoijcleaow) obj).xrmfcynszj(iobyxmoadgVarM);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.kcexrzcfyt
    public final void stevsuqkhv(int i13, androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar, final m3.dxjokdxxww dxjokdxxwwVar, final m3.btonecajqb btonecajqbVar, final IOException iOException, final boolean z13) {
        final zoijcleaow.iobyxmoadg iobyxmoadgVarM = M(i13, zoijcleaowVar);
        d1(iobyxmoadgVarM, 1003, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.iozdgvuglv
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                ((zoijcleaow) obj).bfopjjpdmp(iobyxmoadgVarM, dxjokdxxwwVar, btonecajqbVar, iOException, z13);
            }
        });
    }

    @Override // g3.iobyxmoadg
    public void tzroggbefp(final v2.esjtqupxsv esjtqupxsvVar, Looper looper) {
        y2.iobyxmoadg.lqeggnwhkg(this.f35900lereixgezr == null || this.f35898iwizpuwonk.f35910zoijcleaow.isEmpty());
        this.f35900lereixgezr = (v2.esjtqupxsv) y2.iobyxmoadg.eablkybsjg(esjtqupxsvVar);
        this.f35901pmvmpeiblj = this.f35903zdlpuopuiu.iobyxmoadg(looper, null);
        this.f35897esjtqupxsv = this.f35897esjtqupxsv.eablkybsjg(looper, new y2.oxmwwwfdhm.zoijcleaow() { // from class: g3.wkgbmnqykc
            @Override // y2.oxmwwwfdhm.zoijcleaow
            public final void iobyxmoadg(Object obj, v2.rgvfuqvkyq rgvfuqvkyqVar) {
                this.f36088iobyxmoadg.b1(esjtqupxsvVar, (zoijcleaow) obj, rgvfuqvkyqVar);
            }
        });
    }

    @Override // v2.esjtqupxsv.wkgbmnqykc
    public final void ulzqkzuiru(final int i13, final int i14) {
        final zoijcleaow.iobyxmoadg iobyxmoadgVarO = O();
        d1(iobyxmoadgVarO, 24, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.lereixgezr
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                ((zoijcleaow) obj).yadqdtsiqt(iobyxmoadgVarO, i13, i14);
            }
        });
    }

    @Override // v2.esjtqupxsv.wkgbmnqykc
    public void uwvvkdfqfp(final PlaybackException playbackException) {
        final zoijcleaow.iobyxmoadg iobyxmoadgVarP = P(playbackException);
        d1(iobyxmoadgVarP, 10, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.gtknphoqwx
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                ((zoijcleaow) obj).pmvmpeiblj(iobyxmoadgVarP, playbackException);
            }
        });
    }

    @Override // g3.iobyxmoadg
    public final void vdvldrhtss(final f3.zoijcleaow zoijcleaowVar) {
        final zoijcleaow.iobyxmoadg iobyxmoadgVarN = N();
        d1(iobyxmoadgVarN, 1013, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.hkdspvbjdz
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                ((zoijcleaow) obj).metgxyhuhe(iobyxmoadgVarN, zoijcleaowVar);
            }
        });
    }

    @Override // v2.esjtqupxsv.wkgbmnqykc
    public void vipkmwdibw(int i13) {
    }

    @Override // v2.esjtqupxsv.wkgbmnqykc
    public void wflxmlrfwp(final List list) {
        final zoijcleaow.iobyxmoadg iobyxmoadgVarI = I();
        d1(iobyxmoadgVarI, 27, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.ojitshcjhn
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                ((zoijcleaow) obj).dxjokdxxww(iobyxmoadgVarI, list);
            }
        });
    }

    @Override // v2.esjtqupxsv.wkgbmnqykc
    public final void wkgbmnqykc(final boolean z13) {
        final zoijcleaow.iobyxmoadg iobyxmoadgVarO = O();
        d1(iobyxmoadgVarO, 23, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.metgxyhuhe
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                ((zoijcleaow) obj).lqeggnwhkg(iobyxmoadgVarO, z13);
            }
        });
    }

    @Override // v2.esjtqupxsv.wkgbmnqykc
    public void wwaezpbzkn(final v2.lmojexxdyd lmojexxdydVar) {
        final zoijcleaow.iobyxmoadg iobyxmoadgVarI = I();
        d1(iobyxmoadgVarI, 19, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.ribwqtqdhb
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                ((zoijcleaow) obj).yfnezrywwk(iobyxmoadgVarI, lmojexxdydVar);
            }
        });
    }

    @Override // v2.esjtqupxsv.wkgbmnqykc
    public void wypolnanlu(final v2.wwaezpbzkn wwaezpbzknVar) {
        final zoijcleaow.iobyxmoadg iobyxmoadgVarI = I();
        d1(iobyxmoadgVarI, 2, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.agtfadlqog
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                ((zoijcleaow) obj).kegysxyocb(iobyxmoadgVarI, wwaezpbzknVar);
            }
        });
    }

    @Override // g3.iobyxmoadg
    public void xrmfcynszj(final int i13, final int i14, final boolean z13) {
        final zoijcleaow.iobyxmoadg iobyxmoadgVarO = O();
        d1(iobyxmoadgVarO, 1033, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.wflxmlrfwp
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                ((zoijcleaow) obj).czzsidtyhn(iobyxmoadgVarO, i13, i14, z13);
            }
        });
    }

    @Override // v2.esjtqupxsv.wkgbmnqykc
    public final void yadqdtsiqt(final int i13) {
        final zoijcleaow.iobyxmoadg iobyxmoadgVarO = O();
        d1(iobyxmoadgVarO, 21, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.stevsuqkhv
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                ((zoijcleaow) obj).ydmasvzmpa(iobyxmoadgVarO, i13);
            }
        });
    }

    @Override // v2.esjtqupxsv.wkgbmnqykc
    public final void ydmasvzmpa(final boolean z13, final int i13) {
        final zoijcleaow.iobyxmoadg iobyxmoadgVarI = I();
        d1(iobyxmoadgVarI, 5, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.draadjrbmk
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                ((zoijcleaow) obj).jlmebxxoox(iobyxmoadgVarI, z13, i13);
            }
        });
    }

    @Override // v2.esjtqupxsv.wkgbmnqykc
    public final void yfnezrywwk(v2.cdpycssgdh cdpycssgdhVar, final int i13) {
        this.f35898iwizpuwonk.draadjrbmk((v2.esjtqupxsv) y2.iobyxmoadg.eablkybsjg(this.f35900lereixgezr));
        final zoijcleaow.iobyxmoadg iobyxmoadgVarI = I();
        d1(iobyxmoadgVarI, 0, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.sflfametgt
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                ((zoijcleaow) obj).weqkydbzbr(iobyxmoadgVarI, i13);
            }
        });
    }

    @Override // v2.esjtqupxsv.wkgbmnqykc
    public final void yggfygwlhe(final v2.jyumaefscl jyumaefsclVar) {
        final zoijcleaow.iobyxmoadg iobyxmoadgVarI = I();
        d1(iobyxmoadgVarI, 28, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.gxszxtbevo
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                ((zoijcleaow) obj).gtknphoqwx(iobyxmoadgVarI, jyumaefsclVar);
            }
        });
    }

    @Override // v2.esjtqupxsv.wkgbmnqykc
    public final void ylkuphrtab(final boolean z13) {
        final zoijcleaow.iobyxmoadg iobyxmoadgVarI = I();
        d1(iobyxmoadgVarI, 9, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.crxdokpmqz
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                ((zoijcleaow) obj).hcddaimhww(iobyxmoadgVarI, z13);
            }
        });
    }

    @Override // g3.iobyxmoadg
    public final void zdlpuopuiu(final int i13, final long j13) {
        final zoijcleaow.iobyxmoadg iobyxmoadgVarN = N();
        d1(iobyxmoadgVarN, 1018, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.wwaezpbzkn
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                ((zoijcleaow) obj).draadjrbmk(iobyxmoadgVarN, i13, j13);
            }
        });
    }

    @Override // g3.iobyxmoadg
    public void zfvoamnweg(zoijcleaow zoijcleaowVar) {
        y2.iobyxmoadg.eablkybsjg(zoijcleaowVar);
        this.f35897esjtqupxsv.ppxfxbqfkf(zoijcleaowVar);
    }

    @Override // v2.esjtqupxsv.wkgbmnqykc
    public final void zoijcleaow(final v2.jpowsppfya jpowsppfyaVar) {
        final zoijcleaow.iobyxmoadg iobyxmoadgVarO = O();
        d1(iobyxmoadgVarO, 25, new y2.oxmwwwfdhm.iobyxmoadg() { // from class: g3.kegysxyocb
            @Override // y2.oxmwwwfdhm.iobyxmoadg
            public final void invoke(Object obj) {
                bfopjjpdmp.Z0(iobyxmoadgVarO, jpowsppfyaVar, (zoijcleaow) obj);
            }
        });
    }

    @Override // v2.esjtqupxsv.wkgbmnqykc
    public void zynmafqrjb(boolean z13) {
    }
}
