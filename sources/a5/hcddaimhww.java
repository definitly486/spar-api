package a5;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.media3.common.ParserException;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class hcddaimhww implements t3.rgvfuqvkyq {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public static final t3.yggfygwlhe f500jyumaefscl = new t3.yggfygwlhe() { // from class: a5.pkzmftpjix
        @Override // t3.yggfygwlhe
        public final t3.rgvfuqvkyq[] lqeggnwhkg() {
            return hcddaimhww.esjtqupxsv();
        }
    };

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private t3.oxmwwwfdhm f501agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final SparseBooleanArray f502btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private final ylkuphrtab f503draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final SparseArray f504dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final y2.yadqdtsiqt f505eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final SparseBooleanArray f506gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final SparseIntArray f507gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f508iobyxmoadg;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private jpowsppfya f509kcexrzcfyt;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final jpowsppfya.ppxfxbqfkf f510lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final q4.oxmwwwfdhm.iobyxmoadg f511nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private int f512ojitshcjhn;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private boolean f513oxmwwwfdhm;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f514ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private boolean f515rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private boolean f516vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private wwaezpbzkn f517wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final List f518wkgbmnqykc;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private int f519yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private int f520zdlpuopuiu;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f521zoijcleaow;

    private class iobyxmoadg implements cdpycssgdh {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final y2.cdpycssgdh f522iobyxmoadg = new y2.cdpycssgdh(new byte[4]);

        public iobyxmoadg() {
        }

        @Override // a5.cdpycssgdh
        public void iobyxmoadg(y2.yadqdtsiqt yadqdtsiqtVar) {
            if (yadqdtsiqtVar.wwaezpbzkn() == 0 && (yadqdtsiqtVar.wwaezpbzkn() & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                yadqdtsiqtVar.crxdokpmqz(6);
                int iIobyxmoadg = yadqdtsiqtVar.iobyxmoadg() / 4;
                for (int i13 = 0; i13 < iIobyxmoadg; i13++) {
                    yadqdtsiqtVar.gtknphoqwx(this.f522iobyxmoadg, 4);
                    int iNufgyqmvbu = this.f522iobyxmoadg.nufgyqmvbu(16);
                    this.f522iobyxmoadg.oxmwwwfdhm(3);
                    if (iNufgyqmvbu == 0) {
                        this.f522iobyxmoadg.oxmwwwfdhm(13);
                    } else {
                        int iNufgyqmvbu2 = this.f522iobyxmoadg.nufgyqmvbu(13);
                        if (hcddaimhww.this.f504dxjokdxxww.get(iNufgyqmvbu2) == null) {
                            hcddaimhww.this.f504dxjokdxxww.put(iNufgyqmvbu2, new yadqdtsiqt(hcddaimhww.this.new zoijcleaow(iNufgyqmvbu2)));
                            hcddaimhww.wflxmlrfwp(hcddaimhww.this);
                        }
                    }
                }
                if (hcddaimhww.this.f508iobyxmoadg != 2) {
                    hcddaimhww.this.f504dxjokdxxww.remove(0);
                }
            }
        }

        @Override // a5.cdpycssgdh
        public void zoijcleaow(y2.hcddaimhww hcddaimhwwVar, t3.oxmwwwfdhm oxmwwwfdhmVar, jpowsppfya.wkgbmnqykc wkgbmnqykcVar) {
        }
    }

    private class zoijcleaow implements cdpycssgdh {

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final int f527wkgbmnqykc;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final y2.cdpycssgdh f525iobyxmoadg = new y2.cdpycssgdh(new byte[5]);

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final SparseArray f528zoijcleaow = new SparseArray();

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final SparseIntArray f526ppxfxbqfkf = new SparseIntArray();

        public zoijcleaow(int i13) {
            this.f527wkgbmnqykc = i13;
        }

        /* JADX WARN: Code duplicated, block: B:18:0x004a  */
        /* JADX WARN: Code duplicated, block: B:24:0x005c  */
        /* JADX WARN: Code duplicated, block: B:27:0x0063  */
        private jpowsppfya.zoijcleaow ppxfxbqfkf(y2.yadqdtsiqt yadqdtsiqtVar, int i13) {
            int i14;
            int iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo();
            int i15 = iGxszxtbevo + i13;
            int i16 = -1;
            String str = null;
            ArrayList arrayList = null;
            int iWwaezpbzkn = 0;
            while (yadqdtsiqtVar.gxszxtbevo() < i15) {
                int iWwaezpbzkn2 = yadqdtsiqtVar.wwaezpbzkn();
                int iGxszxtbevo2 = yadqdtsiqtVar.gxszxtbevo() + yadqdtsiqtVar.wwaezpbzkn();
                if (iGxszxtbevo2 > i15) {
                    break;
                }
                if (iWwaezpbzkn2 == 5) {
                    long jPkzmftpjix = yadqdtsiqtVar.pkzmftpjix();
                    if (jPkzmftpjix == 1094921523) {
                        i16 = 129;
                    } else if (jPkzmftpjix == 1161904947) {
                        i16 = 135;
                    } else if (jPkzmftpjix == 1094921524) {
                        i16 = 172;
                    } else if (jPkzmftpjix == 1212503619) {
                        i16 = 36;
                    }
                } else if (iWwaezpbzkn2 == 106) {
                    i16 = 129;
                } else if (iWwaezpbzkn2 == 122) {
                    i16 = 135;
                } else if (iWwaezpbzkn2 == 127) {
                    int iWwaezpbzkn3 = yadqdtsiqtVar.wwaezpbzkn();
                    if (iWwaezpbzkn3 == 21) {
                        i16 = 172;
                    } else if (iWwaezpbzkn3 == 14) {
                        i16 = 136;
                    } else if (iWwaezpbzkn3 == 33) {
                        i16 = 139;
                    }
                } else {
                    if (iWwaezpbzkn2 == 123) {
                        i14 = 138;
                    } else if (iWwaezpbzkn2 == 10) {
                        String strTrim = yadqdtsiqtVar.yadqdtsiqt(3).trim();
                        iWwaezpbzkn = yadqdtsiqtVar.wwaezpbzkn();
                        str = strTrim;
                    } else if (iWwaezpbzkn2 == 89) {
                        ArrayList arrayList2 = new ArrayList();
                        while (yadqdtsiqtVar.gxszxtbevo() < iGxszxtbevo2) {
                            String strTrim2 = yadqdtsiqtVar.yadqdtsiqt(3).trim();
                            int iWwaezpbzkn4 = yadqdtsiqtVar.wwaezpbzkn();
                            byte[] bArr = new byte[4];
                            yadqdtsiqtVar.draadjrbmk(bArr, 0, 4);
                            arrayList2.add(new jpowsppfya.iobyxmoadg(strTrim2, iWwaezpbzkn4, bArr));
                        }
                        arrayList = arrayList2;
                        i16 = 89;
                    } else if (iWwaezpbzkn2 == 111) {
                        i14 = 257;
                    }
                    i16 = i14;
                }
                yadqdtsiqtVar.crxdokpmqz(iGxszxtbevo2 - yadqdtsiqtVar.gxszxtbevo());
            }
            yadqdtsiqtVar.sopmlzcsov(i15);
            return new jpowsppfya.zoijcleaow(i16, str, iWwaezpbzkn, arrayList, Arrays.copyOfRange(yadqdtsiqtVar.eablkybsjg(), iGxszxtbevo, i15));
        }

        @Override // a5.cdpycssgdh
        public void iobyxmoadg(y2.yadqdtsiqt yadqdtsiqtVar) {
            y2.hcddaimhww hcddaimhwwVar;
            if (yadqdtsiqtVar.wwaezpbzkn() != 2) {
                return;
            }
            if (hcddaimhww.this.f508iobyxmoadg == 1 || hcddaimhww.this.f508iobyxmoadg == 2 || hcddaimhww.this.f512ojitshcjhn == 1) {
                hcddaimhwwVar = (y2.hcddaimhww) hcddaimhww.this.f518wkgbmnqykc.get(0);
            } else {
                hcddaimhwwVar = new y2.hcddaimhww(((y2.hcddaimhww) hcddaimhww.this.f518wkgbmnqykc.get(0)).wkgbmnqykc());
                hcddaimhww.this.f518wkgbmnqykc.add(hcddaimhwwVar);
            }
            if ((yadqdtsiqtVar.wwaezpbzkn() & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
                return;
            }
            yadqdtsiqtVar.crxdokpmqz(1);
            int iWypolnanlu = yadqdtsiqtVar.wypolnanlu();
            int i13 = 3;
            yadqdtsiqtVar.crxdokpmqz(3);
            yadqdtsiqtVar.gtknphoqwx(this.f525iobyxmoadg, 2);
            this.f525iobyxmoadg.oxmwwwfdhm(3);
            int i14 = 13;
            hcddaimhww.this.f519yggfygwlhe = this.f525iobyxmoadg.nufgyqmvbu(13);
            yadqdtsiqtVar.gtknphoqwx(this.f525iobyxmoadg, 2);
            int i15 = 4;
            this.f525iobyxmoadg.oxmwwwfdhm(4);
            yadqdtsiqtVar.crxdokpmqz(this.f525iobyxmoadg.nufgyqmvbu(12));
            if (hcddaimhww.this.f508iobyxmoadg == 2 && hcddaimhww.this.f509kcexrzcfyt == null) {
                jpowsppfya.zoijcleaow zoijcleaowVar = new jpowsppfya.zoijcleaow(21, null, 0, null, stevsuqkhv.f123601gxszxtbevo);
                hcddaimhww hcddaimhwwVar2 = hcddaimhww.this;
                hcddaimhwwVar2.f509kcexrzcfyt = hcddaimhwwVar2.f510lqeggnwhkg.zoijcleaow(21, zoijcleaowVar);
                if (hcddaimhww.this.f509kcexrzcfyt != null) {
                    hcddaimhww.this.f509kcexrzcfyt.zoijcleaow(hcddaimhwwVar, hcddaimhww.this.f501agtfadlqog, new jpowsppfya.wkgbmnqykc(iWypolnanlu, 21, 8192));
                }
            }
            this.f528zoijcleaow.clear();
            this.f526ppxfxbqfkf.clear();
            int iIobyxmoadg = yadqdtsiqtVar.iobyxmoadg();
            while (iIobyxmoadg > 0) {
                yadqdtsiqtVar.gtknphoqwx(this.f525iobyxmoadg, 5);
                int iNufgyqmvbu = this.f525iobyxmoadg.nufgyqmvbu(8);
                this.f525iobyxmoadg.oxmwwwfdhm(i13);
                int iNufgyqmvbu2 = this.f525iobyxmoadg.nufgyqmvbu(i14);
                this.f525iobyxmoadg.oxmwwwfdhm(i15);
                int iNufgyqmvbu3 = this.f525iobyxmoadg.nufgyqmvbu(12);
                jpowsppfya.zoijcleaow zoijcleaowVarPpxfxbqfkf = ppxfxbqfkf(yadqdtsiqtVar, iNufgyqmvbu3);
                if (iNufgyqmvbu == 6 || iNufgyqmvbu == 5) {
                    iNufgyqmvbu = zoijcleaowVarPpxfxbqfkf.f564iobyxmoadg;
                }
                iIobyxmoadg -= iNufgyqmvbu3 + 5;
                int i16 = hcddaimhww.this.f508iobyxmoadg == 2 ? iNufgyqmvbu : iNufgyqmvbu2;
                if (!hcddaimhww.this.f502btonecajqb.get(i16)) {
                    jpowsppfya jpowsppfyaVarZoijcleaow = (hcddaimhww.this.f508iobyxmoadg == 2 && iNufgyqmvbu == 21) ? hcddaimhww.this.f509kcexrzcfyt : hcddaimhww.this.f510lqeggnwhkg.zoijcleaow(iNufgyqmvbu, zoijcleaowVarPpxfxbqfkf);
                    if (hcddaimhww.this.f508iobyxmoadg != 2 || iNufgyqmvbu2 < this.f526ppxfxbqfkf.get(i16, 8192)) {
                        this.f526ppxfxbqfkf.put(i16, iNufgyqmvbu2);
                        this.f528zoijcleaow.put(i16, jpowsppfyaVarZoijcleaow);
                    }
                }
                i13 = 3;
                i15 = 4;
                i14 = 13;
            }
            int size = this.f526ppxfxbqfkf.size();
            for (int i17 = 0; i17 < size; i17++) {
                int iKeyAt = this.f526ppxfxbqfkf.keyAt(i17);
                int iValueAt = this.f526ppxfxbqfkf.valueAt(i17);
                hcddaimhww.this.f502btonecajqb.put(iKeyAt, true);
                hcddaimhww.this.f506gtknphoqwx.put(iValueAt, true);
                jpowsppfya jpowsppfyaVar = (jpowsppfya) this.f528zoijcleaow.valueAt(i17);
                if (jpowsppfyaVar != null) {
                    if (jpowsppfyaVar != hcddaimhww.this.f509kcexrzcfyt) {
                        jpowsppfyaVar.zoijcleaow(hcddaimhwwVar, hcddaimhww.this.f501agtfadlqog, new jpowsppfya.wkgbmnqykc(iWypolnanlu, iKeyAt, 8192));
                    }
                    hcddaimhww.this.f504dxjokdxxww.put(iValueAt, jpowsppfyaVar);
                }
            }
            if (hcddaimhww.this.f508iobyxmoadg == 2) {
                if (hcddaimhww.this.f515rgvfuqvkyq) {
                    return;
                }
                hcddaimhww.this.f501agtfadlqog.agtfadlqog();
                hcddaimhww.this.f512ojitshcjhn = 0;
                hcddaimhww.this.f515rgvfuqvkyq = true;
                return;
            }
            hcddaimhww.this.f504dxjokdxxww.remove(this.f527wkgbmnqykc);
            hcddaimhww hcddaimhwwVar3 = hcddaimhww.this;
            hcddaimhwwVar3.f512ojitshcjhn = hcddaimhwwVar3.f508iobyxmoadg == 1 ? 0 : hcddaimhww.this.f512ojitshcjhn - 1;
            if (hcddaimhww.this.f512ojitshcjhn == 0) {
                hcddaimhww.this.f501agtfadlqog.agtfadlqog();
                hcddaimhww.this.f515rgvfuqvkyq = true;
            }
        }

        @Override // a5.cdpycssgdh
        public void zoijcleaow(y2.hcddaimhww hcddaimhwwVar, t3.oxmwwwfdhm oxmwwwfdhmVar, jpowsppfya.wkgbmnqykc wkgbmnqykcVar) {
        }
    }

    public hcddaimhww(int i13, q4.oxmwwwfdhm.iobyxmoadg iobyxmoadgVar) {
        this(1, i13, iobyxmoadgVar, new y2.hcddaimhww(0L), new btonecajqb(0), 112800);
    }

    private int cqumvgiudr() throws ParserException {
        int iGxszxtbevo = this.f505eablkybsjg.gxszxtbevo();
        int iLqeggnwhkg = this.f505eablkybsjg.lqeggnwhkg();
        int iIobyxmoadg = hkdspvbjdz.iobyxmoadg(this.f505eablkybsjg.eablkybsjg(), iGxszxtbevo, iLqeggnwhkg);
        this.f505eablkybsjg.sopmlzcsov(iIobyxmoadg);
        int i13 = iIobyxmoadg + 188;
        if (i13 > iLqeggnwhkg) {
            int i14 = this.f520zdlpuopuiu + (iIobyxmoadg - iGxszxtbevo);
            this.f520zdlpuopuiu = i14;
            if (this.f508iobyxmoadg == 2 && i14 > 376) {
                throw ParserException.iobyxmoadg("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            this.f520zdlpuopuiu = 0;
        }
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ t3.rgvfuqvkyq[] esjtqupxsv() {
        return new t3.rgvfuqvkyq[]{new hcddaimhww(1, q4.oxmwwwfdhm.iobyxmoadg.f77831iobyxmoadg)};
    }

    private boolean iwizpuwonk(t3.vdvldrhtss vdvldrhtssVar) {
        byte[] bArrEablkybsjg = this.f505eablkybsjg.eablkybsjg();
        if (9400 - this.f505eablkybsjg.gxszxtbevo() < 188) {
            int iIobyxmoadg = this.f505eablkybsjg.iobyxmoadg();
            if (iIobyxmoadg > 0) {
                System.arraycopy(bArrEablkybsjg, this.f505eablkybsjg.gxszxtbevo(), bArrEablkybsjg, 0, iIobyxmoadg);
            }
            this.f505eablkybsjg.ntlheqmsrt(bArrEablkybsjg, iIobyxmoadg);
        }
        while (this.f505eablkybsjg.iobyxmoadg() < 188) {
            int iLqeggnwhkg = this.f505eablkybsjg.lqeggnwhkg();
            int iZoijcleaow = vdvldrhtssVar.zoijcleaow(bArrEablkybsjg, iLqeggnwhkg, 9400 - iLqeggnwhkg);
            if (iZoijcleaow == -1) {
                return false;
            }
            this.f505eablkybsjg.ulzqkzuiru(iLqeggnwhkg + iZoijcleaow);
        }
        return true;
    }

    private void lereixgezr(long j13) {
        if (this.f516vdvldrhtss) {
            return;
        }
        this.f516vdvldrhtss = true;
        if (this.f503draadjrbmk.zoijcleaow() == -9223372036854775807L) {
            this.f501agtfadlqog.gxszxtbevo(new t3.pkzmftpjix.zoijcleaow(this.f503draadjrbmk.zoijcleaow()));
            return;
        }
        wwaezpbzkn wwaezpbzknVar = new wwaezpbzkn(this.f503draadjrbmk.ppxfxbqfkf(), this.f503draadjrbmk.zoijcleaow(), j13, this.f519yggfygwlhe, this.f514ppxfxbqfkf);
        this.f517wflxmlrfwp = wwaezpbzknVar;
        this.f501agtfadlqog.gxszxtbevo(wwaezpbzknVar.zoijcleaow());
    }

    private void pmvmpeiblj() {
        this.f502btonecajqb.clear();
        this.f504dxjokdxxww.clear();
        SparseArray sparseArrayIobyxmoadg = this.f510lqeggnwhkg.iobyxmoadg();
        int size = sparseArrayIobyxmoadg.size();
        for (int i13 = 0; i13 < size; i13++) {
            this.f504dxjokdxxww.put(sparseArrayIobyxmoadg.keyAt(i13), (jpowsppfya) sparseArrayIobyxmoadg.valueAt(i13));
        }
        this.f504dxjokdxxww.put(0, new yadqdtsiqt(new iobyxmoadg()));
        this.f509kcexrzcfyt = null;
    }

    static /* synthetic */ int wflxmlrfwp(hcddaimhww hcddaimhwwVar) {
        int i13 = hcddaimhwwVar.f512ojitshcjhn;
        hcddaimhwwVar.f512ojitshcjhn = i13 + 1;
        return i13;
    }

    private boolean zynmafqrjb(int i13) {
        return this.f508iobyxmoadg == 2 || this.f515rgvfuqvkyq || !this.f506gtknphoqwx.get(i13, false);
    }

    @Override // t3.rgvfuqvkyq
    public boolean draadjrbmk(t3.vdvldrhtss vdvldrhtssVar) {
        byte[] bArrEablkybsjg = this.f505eablkybsjg.eablkybsjg();
        vdvldrhtssVar.ojitshcjhn(bArrEablkybsjg, 0, 940);
        for (int i13 = 0; i13 < 188; i13++) {
            int i14 = 0;
            while (true) {
                if (i14 >= 5) {
                    vdvldrhtssVar.draadjrbmk(i13);
                    return true;
                }
                if (bArrEablkybsjg[(i14 * 188) + i13] != 71) {
                    break;
                }
                i14++;
            }
        }
        return false;
    }

    @Override // t3.rgvfuqvkyq
    public void iobyxmoadg(long j13, long j14) {
        wwaezpbzkn wwaezpbzknVar;
        y2.iobyxmoadg.lqeggnwhkg(this.f508iobyxmoadg != 2);
        int size = this.f518wkgbmnqykc.size();
        for (int i13 = 0; i13 < size; i13++) {
            y2.hcddaimhww hcddaimhwwVar = (y2.hcddaimhww) this.f518wkgbmnqykc.get(i13);
            boolean z13 = hcddaimhwwVar.gxszxtbevo() == -9223372036854775807L;
            if (!z13) {
                long jWkgbmnqykc = hcddaimhwwVar.wkgbmnqykc();
                z13 = (jWkgbmnqykc == -9223372036854775807L || jWkgbmnqykc == 0 || jWkgbmnqykc == j14) ? false : true;
            }
            if (z13) {
                hcddaimhwwVar.dxjokdxxww(j14);
            }
        }
        if (j14 != 0 && (wwaezpbzknVar = this.f517wflxmlrfwp) != null) {
            wwaezpbzknVar.nufgyqmvbu(j14);
        }
        this.f505eablkybsjg.tzroggbefp(0);
        this.f507gxszxtbevo.clear();
        for (int i14 = 0; i14 < this.f504dxjokdxxww.size(); i14++) {
            ((jpowsppfya) this.f504dxjokdxxww.valueAt(i14)).ppxfxbqfkf();
        }
        this.f520zdlpuopuiu = 0;
    }

    @Override // t3.rgvfuqvkyq
    public void ppxfxbqfkf(t3.oxmwwwfdhm oxmwwwfdhmVar) {
        if ((this.f521zoijcleaow & 1) == 0) {
            oxmwwwfdhmVar = new q4.kcexrzcfyt(oxmwwwfdhmVar, this.f511nufgyqmvbu);
        }
        this.f501agtfadlqog = oxmwwwfdhmVar;
    }

    @Override // t3.rgvfuqvkyq
    public void release() {
    }

    @Override // t3.rgvfuqvkyq
    public int zoijcleaow(t3.vdvldrhtss vdvldrhtssVar, t3.ylkuphrtab ylkuphrtabVar) throws ParserException {
        long length = vdvldrhtssVar.getLength();
        boolean z13 = this.f508iobyxmoadg == 2;
        if (this.f515rgvfuqvkyq) {
            if (length != -1 && !z13 && !this.f503draadjrbmk.wkgbmnqykc()) {
                return this.f503draadjrbmk.eablkybsjg(vdvldrhtssVar, ylkuphrtabVar, this.f519yggfygwlhe);
            }
            lereixgezr(length);
            if (this.f513oxmwwwfdhm) {
                this.f513oxmwwwfdhm = false;
                iobyxmoadg(0L, 0L);
                if (vdvldrhtssVar.getPosition() != 0) {
                    ylkuphrtabVar.f109571iobyxmoadg = 0L;
                    return 1;
                }
            }
            wwaezpbzkn wwaezpbzknVar = this.f517wflxmlrfwp;
            if (wwaezpbzknVar != null && wwaezpbzknVar.wkgbmnqykc()) {
                return this.f517wflxmlrfwp.ppxfxbqfkf(vdvldrhtssVar, ylkuphrtabVar);
            }
        }
        if (!iwizpuwonk(vdvldrhtssVar)) {
            for (int i13 = 0; i13 < this.f504dxjokdxxww.size(); i13++) {
                jpowsppfya jpowsppfyaVar = (jpowsppfya) this.f504dxjokdxxww.valueAt(i13);
                if (jpowsppfyaVar instanceof esjtqupxsv) {
                    esjtqupxsv esjtqupxsvVar = (esjtqupxsv) jpowsppfyaVar;
                    if (esjtqupxsvVar.wkgbmnqykc(z13)) {
                        esjtqupxsvVar.iobyxmoadg(new y2.yadqdtsiqt(), 1);
                    }
                }
            }
            return -1;
        }
        int iCqumvgiudr = cqumvgiudr();
        int iLqeggnwhkg = this.f505eablkybsjg.lqeggnwhkg();
        if (iCqumvgiudr > iLqeggnwhkg) {
            return 0;
        }
        int iVdvldrhtss = this.f505eablkybsjg.vdvldrhtss();
        if ((8388608 & iVdvldrhtss) != 0) {
            this.f505eablkybsjg.sopmlzcsov(iCqumvgiudr);
            return 0;
        }
        int i14 = (4194304 & iVdvldrhtss) != 0 ? 1 : 0;
        int i15 = (2096896 & iVdvldrhtss) >> 8;
        boolean z14 = (iVdvldrhtss & 32) != 0;
        jpowsppfya jpowsppfyaVar2 = (iVdvldrhtss & 16) != 0 ? (jpowsppfya) this.f504dxjokdxxww.get(i15) : null;
        if (jpowsppfyaVar2 == null) {
            this.f505eablkybsjg.sopmlzcsov(iCqumvgiudr);
            return 0;
        }
        if (this.f508iobyxmoadg != 2) {
            int i16 = iVdvldrhtss & 15;
            int i17 = this.f507gxszxtbevo.get(i15, i16 - 1);
            this.f507gxszxtbevo.put(i15, i16);
            if (i17 == i16) {
                this.f505eablkybsjg.sopmlzcsov(iCqumvgiudr);
                return 0;
            }
            if (i16 != ((i17 + 1) & 15)) {
                jpowsppfyaVar2.ppxfxbqfkf();
            }
        }
        if (z14) {
            int iWwaezpbzkn = this.f505eablkybsjg.wwaezpbzkn();
            i14 |= (this.f505eablkybsjg.wwaezpbzkn() & 64) != 0 ? 2 : 0;
            this.f505eablkybsjg.crxdokpmqz(iWwaezpbzkn - 1);
        }
        boolean z15 = this.f515rgvfuqvkyq;
        if (zynmafqrjb(i15)) {
            this.f505eablkybsjg.ulzqkzuiru(iCqumvgiudr);
            jpowsppfyaVar2.iobyxmoadg(this.f505eablkybsjg, i14);
            this.f505eablkybsjg.ulzqkzuiru(iLqeggnwhkg);
        }
        if (this.f508iobyxmoadg != 2 && !z15 && this.f515rgvfuqvkyq && length != -1) {
            this.f513oxmwwwfdhm = true;
        }
        this.f505eablkybsjg.sopmlzcsov(iCqumvgiudr);
        return 0;
    }

    public hcddaimhww(int i13, int i14, q4.oxmwwwfdhm.iobyxmoadg iobyxmoadgVar, y2.hcddaimhww hcddaimhwwVar, jpowsppfya.ppxfxbqfkf ppxfxbqfkfVar, int i15) {
        this.f510lqeggnwhkg = (jpowsppfya.ppxfxbqfkf) y2.iobyxmoadg.eablkybsjg(ppxfxbqfkfVar);
        this.f514ppxfxbqfkf = i15;
        this.f508iobyxmoadg = i13;
        this.f521zoijcleaow = i14;
        this.f511nufgyqmvbu = iobyxmoadgVar;
        if (i13 == 1 || i13 == 2) {
            this.f518wkgbmnqykc = Collections.singletonList(hcddaimhwwVar);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f518wkgbmnqykc = arrayList;
            arrayList.add(hcddaimhwwVar);
        }
        this.f505eablkybsjg = new y2.yadqdtsiqt(new byte[9400], 0);
        this.f502btonecajqb = new SparseBooleanArray();
        this.f506gtknphoqwx = new SparseBooleanArray();
        this.f504dxjokdxxww = new SparseArray();
        this.f507gxszxtbevo = new SparseIntArray();
        this.f503draadjrbmk = new ylkuphrtab(i15);
        this.f501agtfadlqog = t3.oxmwwwfdhm.f109525vdvldrhtss;
        this.f519yggfygwlhe = -1;
        pmvmpeiblj();
    }
}
