package f;

import androidx.collection.jhduphickx;
import androidx.collection.wypolnanlu;
import androidx.compose.ui.focus.FocusTargetNode;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;
import z.okpsazkaxt;
import z.opjhrmiecq;
import z.pkzmftpjix;
import z.rlfsiqarku;

/* JADX INFO: loaded from: classes.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private boolean f32473eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final btonecajqb f32474iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final wypolnanlu f32475ppxfxbqfkf = jhduphickx.zoijcleaow();

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final wypolnanlu f32476wkgbmnqykc = jhduphickx.zoijcleaow();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final opjhrmiecq f32477zoijcleaow;

    /* synthetic */ class iobyxmoadg extends kotlin.jvm.internal.vdvldrhtss implements tg.iobyxmoadg {
        iobyxmoadg(Object obj) {
            super(0, obj, gxszxtbevo.class, "invalidateNodes", "invalidateNodes()V", 0);
        }

        @Override // tg.iobyxmoadg
        public /* bridge */ /* synthetic */ Object invoke() {
            iobyxmoadg();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg() {
            ((gxszxtbevo) this.receiver).ppxfxbqfkf();
        }
    }

    public gxszxtbevo(btonecajqb btonecajqbVar, opjhrmiecq opjhrmiecqVar) {
        this.f32474iobyxmoadg = btonecajqbVar;
        this.f32477zoijcleaow = opjhrmiecqVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0057 A[LOOP:0: B:7:0x0022->B:17:0x0057, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:72:0x0143 A[EDGE_INSN: B:72:0x0143->B:70:0x0143 BREAK  A[LOOP:0: B:7:0x0022->B:17:0x0057], SYNTHETIC] */
    public final void ppxfxbqfkf() {
        okpsazkaxt okpsazkaxtVarWeqkydbzbr;
        FocusTargetNode focusTargetNodeNufgyqmvbu = this.f32474iobyxmoadg.nufgyqmvbu();
        long j13 = 128;
        long j14 = 255;
        if (focusTargetNodeNufgyqmvbu != null) {
            if (focusTargetNodeNufgyqmvbu.n0()) {
                if (this.f32475ppxfxbqfkf.iobyxmoadg(focusTargetNodeNufgyqmvbu)) {
                    focusTargetNodeNufgyqmvbu.Q0();
                }
                rgvfuqvkyq rgvfuqvkyqVarJlmebxxoox = focusTargetNodeNufgyqmvbu.jlmebxxoox();
                int iIobyxmoadg = rlfsiqarku.iobyxmoadg(UserVerificationMethods.USER_VERIFY_ALL) | rlfsiqarku.iobyxmoadg(4096);
                if (!focusTargetNodeNufgyqmvbu.wflxmlrfwp().n0()) {
                    w.iobyxmoadg.zoijcleaow("visitAncestors called on an unattached node");
                }
                androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarWflxmlrfwp = focusTargetNodeNufgyqmvbu.wflxmlrfwp();
                pkzmftpjix pkzmftpjixVarRgvfuqvkyq = z.gtknphoqwx.rgvfuqvkyq(focusTargetNodeNufgyqmvbu);
                int i13 = 0;
                while (pkzmftpjixVarRgvfuqvkyq != null) {
                    if ((pkzmftpjixVarRgvfuqvkyq.weqkydbzbr().gtknphoqwx().d0() & iIobyxmoadg) != 0) {
                        while (ppxfxbqfkfVarWflxmlrfwp != null) {
                            if ((ppxfxbqfkfVarWflxmlrfwp.i0() & iIobyxmoadg) != 0) {
                                if ((rlfsiqarku.iobyxmoadg(UserVerificationMethods.USER_VERIFY_ALL) & ppxfxbqfkfVarWflxmlrfwp.i0()) != 0) {
                                    i13++;
                                }
                                if ((ppxfxbqfkfVarWflxmlrfwp instanceof wkgbmnqykc) && this.f32476wkgbmnqykc.iobyxmoadg(ppxfxbqfkfVarWflxmlrfwp)) {
                                    if (i13 <= 1) {
                                        ((wkgbmnqykc) ppxfxbqfkfVarWflxmlrfwp).ipoelvxyzq(rgvfuqvkyqVarJlmebxxoox);
                                    } else {
                                        ((wkgbmnqykc) ppxfxbqfkfVarWflxmlrfwp).ipoelvxyzq(rgvfuqvkyq.ActiveParent);
                                    }
                                    this.f32476wkgbmnqykc.esjtqupxsv(ppxfxbqfkfVarWflxmlrfwp);
                                }
                            }
                            ppxfxbqfkfVarWflxmlrfwp = ppxfxbqfkfVarWflxmlrfwp.k0();
                        }
                    }
                    pkzmftpjixVarRgvfuqvkyq = pkzmftpjixVarRgvfuqvkyq.auzgnhcxok();
                    ppxfxbqfkfVarWflxmlrfwp = (pkzmftpjixVarRgvfuqvkyq == null || (okpsazkaxtVarWeqkydbzbr = pkzmftpjixVarRgvfuqvkyq.weqkydbzbr()) == null) ? null : okpsazkaxtVarWeqkydbzbr.ojitshcjhn();
                }
                wypolnanlu wypolnanluVar = this.f32476wkgbmnqykc;
                Object[] objArr = wypolnanluVar.f4398zoijcleaow;
                long[] jArr = wypolnanluVar.f4395iobyxmoadg;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i14 = 0;
                    while (true) {
                        long j15 = jArr[i14];
                        if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i15 = 8 - ((~(i14 - length)) >>> 31);
                            int i16 = 0;
                            while (i16 < i15) {
                                if ((j15 & j14) < 128) {
                                    ((wkgbmnqykc) objArr[(i14 << 3) + i16]).ipoelvxyzq(rgvfuqvkyq.Inactive);
                                }
                                j15 >>= 8;
                                i16++;
                                j14 = 255;
                            }
                            if (i15 != 8) {
                                break;
                            }
                        }
                        if (i14 == length) {
                            break;
                        }
                        i14++;
                        j14 = 255;
                    }
                }
            }
        } else {
            wypolnanlu wypolnanluVar2 = this.f32476wkgbmnqykc;
            Object[] objArr2 = wypolnanluVar2.f4398zoijcleaow;
            long[] jArr2 = wypolnanluVar2.f4395iobyxmoadg;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i17 = 0;
                while (true) {
                    long j16 = jArr2[i17];
                    Object[] objArr3 = objArr2;
                    if ((((~j16) << 7) & j16 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i17 != length2) {
                            break;
                            break;
                        } else {
                            i17++;
                            objArr2 = objArr3;
                            j13 = 128;
                        }
                    } else {
                        int i18 = 8 - ((~(i17 - length2)) >>> 31);
                        int i19 = 0;
                        while (i19 < i18) {
                            if ((j16 & 255) < j13) {
                                ((wkgbmnqykc) objArr3[(i17 << 3) + i19]).ipoelvxyzq(rgvfuqvkyq.Inactive);
                            }
                            j16 >>= 8;
                            i19++;
                            j13 = 128;
                        }
                        if (i18 != 8) {
                            break;
                        }
                        if (i17 != length2) {
                            break;
                        }
                        i17++;
                        objArr2 = objArr3;
                        j13 = 128;
                    }
                }
            }
        }
        wkgbmnqykc();
        this.f32475ppxfxbqfkf.wflxmlrfwp();
        this.f32476wkgbmnqykc.wflxmlrfwp();
        this.f32473eablkybsjg = false;
    }

    private final void wkgbmnqykc() {
        if (this.f32474iobyxmoadg.nufgyqmvbu() == null || this.f32474iobyxmoadg.vdvldrhtss() == rgvfuqvkyq.Inactive) {
            this.f32474iobyxmoadg.zoijcleaow();
        }
    }

    public final void eablkybsjg() {
        if (this.f32473eablkybsjg) {
            return;
        }
        this.f32477zoijcleaow.cllcsxoeiz(new iobyxmoadg(this));
        this.f32473eablkybsjg = true;
    }

    public final void gxszxtbevo(FocusTargetNode focusTargetNode) {
        if (this.f32475ppxfxbqfkf.nufgyqmvbu(focusTargetNode)) {
            eablkybsjg();
        }
    }

    public final void lqeggnwhkg(wkgbmnqykc wkgbmnqykcVar) {
        if (this.f32476wkgbmnqykc.nufgyqmvbu(wkgbmnqykcVar)) {
            eablkybsjg();
        }
    }

    public final boolean zoijcleaow() {
        return this.f32473eablkybsjg;
    }
}
