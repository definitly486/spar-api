package cl;

import bl.esjtqupxsv;
import bl.hcddaimhww;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.cqumvgiudr;
import gg.wwaezpbzkn;
import hg.tzroggbefp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.hkdspvbjdz;
import kotlin.jvm.internal.jpowsppfya;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.ylkuphrtab;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import modern.payments.ecomAndroid.util.view.CardDateFormatTextWatcher;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
public abstract class eablkybsjg {

    public static final class iobyxmoadg implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return kg.iobyxmoadg.wkgbmnqykc(((wkgbmnqykc) obj).iobyxmoadg(), ((wkgbmnqykc) obj2).iobyxmoadg());
        }
    }

    static final class ppxfxbqfkf extends jyumaefscl implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ hkdspvbjdz f19968iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ hkdspvbjdz f19969jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ hkdspvbjdz f19970yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ bl.eablkybsjg f19971zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(bl.eablkybsjg eablkybsjgVar, hkdspvbjdz hkdspvbjdzVar, hkdspvbjdz hkdspvbjdzVar2, hkdspvbjdz hkdspvbjdzVar3) {
            super(2);
            this.f19971zdlpuopuiu = eablkybsjgVar;
            this.f19970yggfygwlhe = hkdspvbjdzVar;
            this.f19969jyumaefscl = hkdspvbjdzVar2;
            this.f19968iwizpuwonk = hkdspvbjdzVar3;
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws IOException {
            iobyxmoadg(((Number) obj).intValue(), ((Number) obj2).longValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(int i13, long j13) throws IOException {
            if (i13 == 21589) {
                if (j13 < 1) {
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
                byte b13 = this.f19971zdlpuopuiu.readByte();
                boolean z13 = (b13 & 1) == 1;
                boolean z14 = (b13 & 2) == 2;
                boolean z15 = (b13 & 4) == 4;
                bl.eablkybsjg eablkybsjgVar = this.f19971zdlpuopuiu;
                long j14 = z13 ? 5L : 1L;
                if (z14) {
                    j14 += 4;
                }
                if (z15) {
                    j14 += 4;
                }
                if (j13 < j14) {
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
                if (z13) {
                    this.f19970yggfygwlhe.f60015zdlpuopuiu = Long.valueOf(((long) eablkybsjgVar.R()) * 1000);
                }
                if (z14) {
                    this.f19969jyumaefscl.f60015zdlpuopuiu = Long.valueOf(((long) this.f19971zdlpuopuiu.R()) * 1000);
                }
                if (z15) {
                    this.f19968iwizpuwonk.f60015zdlpuopuiu = Long.valueOf(((long) this.f19971zdlpuopuiu.R()) * 1000);
                }
            }
        }
    }

    static final class zoijcleaow extends jyumaefscl implements rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f19972cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f19973esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ bl.eablkybsjg f19974iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ jpowsppfya f19975jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ long f19976yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ ylkuphrtab f19977zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(ylkuphrtab ylkuphrtabVar, long j13, jpowsppfya jpowsppfyaVar, bl.eablkybsjg eablkybsjgVar, jpowsppfya jpowsppfyaVar2, jpowsppfya jpowsppfyaVar3) {
            super(2);
            this.f19977zdlpuopuiu = ylkuphrtabVar;
            this.f19976yggfygwlhe = j13;
            this.f19975jyumaefscl = jpowsppfyaVar;
            this.f19974iwizpuwonk = eablkybsjgVar;
            this.f19972cqumvgiudr = jpowsppfyaVar2;
            this.f19973esjtqupxsv = jpowsppfyaVar3;
        }

        @Override // tg.rgvfuqvkyq
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws IOException {
            iobyxmoadg(((Number) obj).intValue(), ((Number) obj2).longValue());
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(int i13, long j13) throws IOException {
            if (i13 == 1) {
                ylkuphrtab ylkuphrtabVar = this.f19977zdlpuopuiu;
                if (ylkuphrtabVar.f60038zdlpuopuiu) {
                    throw new IOException("bad zip: zip64 extra repeated");
                }
                ylkuphrtabVar.f60038zdlpuopuiu = true;
                if (j13 < this.f19976yggfygwlhe) {
                    throw new IOException("bad zip: zip64 extra too short");
                }
                jpowsppfya jpowsppfyaVar = this.f19975jyumaefscl;
                long jFiwbwshyhd = jpowsppfyaVar.f60024zdlpuopuiu;
                if (jFiwbwshyhd == 4294967295L) {
                    jFiwbwshyhd = this.f19974iwizpuwonk.fiwbwshyhd();
                }
                jpowsppfyaVar.f60024zdlpuopuiu = jFiwbwshyhd;
                jpowsppfya jpowsppfyaVar2 = this.f19972cqumvgiudr;
                jpowsppfyaVar2.f60024zdlpuopuiu = jpowsppfyaVar2.f60024zdlpuopuiu == 4294967295L ? this.f19974iwizpuwonk.fiwbwshyhd() : 0L;
                jpowsppfya jpowsppfyaVar3 = this.f19973esjtqupxsv;
                jpowsppfyaVar3.f60024zdlpuopuiu = jpowsppfyaVar3.f60024zdlpuopuiu == 4294967295L ? this.f19974iwizpuwonk.fiwbwshyhd() : 0L;
            }
        }
    }

    private static final cl.iobyxmoadg btonecajqb(bl.eablkybsjg eablkybsjgVar, cl.iobyxmoadg iobyxmoadgVar) throws IOException {
        eablkybsjgVar.wflxmlrfwp(12L);
        int iR = eablkybsjgVar.R();
        int iR2 = eablkybsjgVar.R();
        long jFiwbwshyhd = eablkybsjgVar.fiwbwshyhd();
        if (jFiwbwshyhd != eablkybsjgVar.fiwbwshyhd() || iR != 0 || iR2 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        eablkybsjgVar.wflxmlrfwp(8L);
        return new cl.iobyxmoadg(jFiwbwshyhd, eablkybsjgVar.fiwbwshyhd(), iobyxmoadgVar.zoijcleaow());
    }

    private static final bl.nufgyqmvbu dxjokdxxww(bl.eablkybsjg eablkybsjgVar, bl.nufgyqmvbu nufgyqmvbuVar) throws IOException {
        hkdspvbjdz hkdspvbjdzVar = new hkdspvbjdz();
        hkdspvbjdzVar.f60015zdlpuopuiu = nufgyqmvbuVar != null ? nufgyqmvbuVar.ppxfxbqfkf() : null;
        hkdspvbjdz hkdspvbjdzVar2 = new hkdspvbjdz();
        hkdspvbjdz hkdspvbjdzVar3 = new hkdspvbjdz();
        int iR = eablkybsjgVar.R();
        if (iR != 67324752) {
            throw new IOException("bad zip: expected " + ppxfxbqfkf(67324752) + " but was " + ppxfxbqfkf(iR));
        }
        eablkybsjgVar.wflxmlrfwp(2L);
        short sIgdgnonuha = eablkybsjgVar.igdgnonuha();
        int i13 = sIgdgnonuha & 65535;
        if ((sIgdgnonuha & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + ppxfxbqfkf(i13));
        }
        eablkybsjgVar.wflxmlrfwp(18L);
        long jIgdgnonuha = ((long) eablkybsjgVar.igdgnonuha()) & 65535;
        int iIgdgnonuha = eablkybsjgVar.igdgnonuha() & 65535;
        eablkybsjgVar.wflxmlrfwp(jIgdgnonuha);
        if (nufgyqmvbuVar == null) {
            eablkybsjgVar.wflxmlrfwp(iIgdgnonuha);
            return null;
        }
        lqeggnwhkg(eablkybsjgVar, iIgdgnonuha, new ppxfxbqfkf(eablkybsjgVar, hkdspvbjdzVar, hkdspvbjdzVar2, hkdspvbjdzVar3));
        return new bl.nufgyqmvbu(nufgyqmvbuVar.lqeggnwhkg(), nufgyqmvbuVar.gxszxtbevo(), null, nufgyqmvbuVar.wkgbmnqykc(), (Long) hkdspvbjdzVar3.f60015zdlpuopuiu, (Long) hkdspvbjdzVar.f60015zdlpuopuiu, (Long) hkdspvbjdzVar2.f60015zdlpuopuiu, null, UserVerificationMethods.USER_VERIFY_PATTERN, null);
    }

    public static final wkgbmnqykc eablkybsjg(bl.eablkybsjg eablkybsjgVar) throws IOException {
        zdlpuopuiu.btonecajqb(eablkybsjgVar, "<this>");
        int iR = eablkybsjgVar.R();
        if (iR != 33639248) {
            throw new IOException("bad zip: expected " + ppxfxbqfkf(33639248) + " but was " + ppxfxbqfkf(iR));
        }
        eablkybsjgVar.wflxmlrfwp(4L);
        short sIgdgnonuha = eablkybsjgVar.igdgnonuha();
        int i13 = sIgdgnonuha & 65535;
        if ((sIgdgnonuha & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + ppxfxbqfkf(i13));
        }
        int iIgdgnonuha = eablkybsjgVar.igdgnonuha() & 65535;
        Long lZoijcleaow = zoijcleaow(eablkybsjgVar.igdgnonuha() & 65535, eablkybsjgVar.igdgnonuha() & 65535);
        long jR = ((long) eablkybsjgVar.R()) & 4294967295L;
        jpowsppfya jpowsppfyaVar = new jpowsppfya();
        jpowsppfyaVar.f60024zdlpuopuiu = ((long) eablkybsjgVar.R()) & 4294967295L;
        jpowsppfya jpowsppfyaVar2 = new jpowsppfya();
        jpowsppfyaVar2.f60024zdlpuopuiu = ((long) eablkybsjgVar.R()) & 4294967295L;
        int iIgdgnonuha2 = eablkybsjgVar.igdgnonuha() & 65535;
        int iIgdgnonuha3 = eablkybsjgVar.igdgnonuha() & 65535;
        int iIgdgnonuha4 = eablkybsjgVar.igdgnonuha() & 65535;
        eablkybsjgVar.wflxmlrfwp(8L);
        jpowsppfya jpowsppfyaVar3 = new jpowsppfya();
        jpowsppfyaVar3.f60024zdlpuopuiu = ((long) eablkybsjgVar.R()) & 4294967295L;
        String strYzdjzghtvl = eablkybsjgVar.yzdjzghtvl(iIgdgnonuha2);
        if (kcexrzcfyt.ulzqkzuiru(strYzdjzghtvl, (char) 0, false, 2, null)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        long j13 = jpowsppfyaVar2.f60024zdlpuopuiu == 4294967295L ? 8 : 0L;
        long j14 = jpowsppfyaVar.f60024zdlpuopuiu == 4294967295L ? j13 + ((long) 8) : j13;
        if (jpowsppfyaVar3.f60024zdlpuopuiu == 4294967295L) {
            j14 += (long) 8;
        }
        long j15 = j14;
        ylkuphrtab ylkuphrtabVar = new ylkuphrtab();
        lqeggnwhkg(eablkybsjgVar, iIgdgnonuha3, new zoijcleaow(ylkuphrtabVar, j15, jpowsppfyaVar2, eablkybsjgVar, jpowsppfyaVar, jpowsppfyaVar3));
        if (j15 <= 0 || ylkuphrtabVar.f60038zdlpuopuiu) {
            return new wkgbmnqykc(esjtqupxsv.iobyxmoadg.eablkybsjg(esjtqupxsv.f16670yggfygwlhe, CardDateFormatTextWatcher.DIVIDER_CHARACTER, false, 1, null).gtknphoqwx(strYzdjzghtvl), kcexrzcfyt.zynmafqrjb(strYzdjzghtvl, CardDateFormatTextWatcher.DIVIDER_CHARACTER, false, 2, null), eablkybsjgVar.yzdjzghtvl(iIgdgnonuha4), jR, jpowsppfyaVar.f60024zdlpuopuiu, jpowsppfyaVar2.f60024zdlpuopuiu, iIgdgnonuha, lZoijcleaow, jpowsppfyaVar3.f60024zdlpuopuiu);
        }
        throw new IOException("bad zip: zip64 extra required but absent");
    }

    public static final void gtknphoqwx(bl.eablkybsjg eablkybsjgVar) {
        zdlpuopuiu.btonecajqb(eablkybsjgVar, "<this>");
        dxjokdxxww(eablkybsjgVar, null);
    }

    private static final cl.iobyxmoadg gxszxtbevo(bl.eablkybsjg eablkybsjgVar) throws IOException {
        int iIgdgnonuha = eablkybsjgVar.igdgnonuha() & 65535;
        int iIgdgnonuha2 = eablkybsjgVar.igdgnonuha() & 65535;
        long jIgdgnonuha = eablkybsjgVar.igdgnonuha() & 65535;
        if (jIgdgnonuha != (eablkybsjgVar.igdgnonuha() & 65535) || iIgdgnonuha != 0 || iIgdgnonuha2 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        eablkybsjgVar.wflxmlrfwp(4L);
        return new cl.iobyxmoadg(jIgdgnonuha, 4294967295L & ((long) eablkybsjgVar.R()), eablkybsjgVar.igdgnonuha() & 65535);
    }

    private static final Map iobyxmoadg(List list) {
        esjtqupxsv esjtqupxsvVarEablkybsjg = esjtqupxsv.iobyxmoadg.eablkybsjg(esjtqupxsv.f16670yggfygwlhe, CardDateFormatTextWatcher.DIVIDER_CHARACTER, false, 1, null);
        Map mapWflxmlrfwp = tzroggbefp.wflxmlrfwp(cqumvgiudr.iobyxmoadg(esjtqupxsvVarEablkybsjg, new wkgbmnqykc(esjtqupxsvVarEablkybsjg, true, null, 0L, 0L, 0L, 0, null, 0L, 508, null)));
        for (wkgbmnqykc wkgbmnqykcVar : hg.jyumaefscl.d(list, new iobyxmoadg())) {
            if (((wkgbmnqykc) mapWflxmlrfwp.put(wkgbmnqykcVar.iobyxmoadg(), wkgbmnqykcVar)) == null) {
                while (true) {
                    esjtqupxsv esjtqupxsvVarNufgyqmvbu = wkgbmnqykcVar.iobyxmoadg().nufgyqmvbu();
                    if (esjtqupxsvVarNufgyqmvbu == null) {
                        break;
                    }
                    wkgbmnqykc wkgbmnqykcVar2 = (wkgbmnqykc) mapWflxmlrfwp.get(esjtqupxsvVarNufgyqmvbu);
                    if (wkgbmnqykcVar2 != null) {
                        wkgbmnqykcVar2.zoijcleaow().add(wkgbmnqykcVar.iobyxmoadg());
                        break;
                    }
                    wkgbmnqykc wkgbmnqykcVar3 = new wkgbmnqykc(esjtqupxsvVarNufgyqmvbu, true, null, 0L, 0L, 0L, 0, null, 0L, 508, null);
                    mapWflxmlrfwp.put(esjtqupxsvVarNufgyqmvbu, wkgbmnqykcVar3);
                    wkgbmnqykcVar3.zoijcleaow().add(wkgbmnqykcVar.iobyxmoadg());
                    wkgbmnqykcVar = wkgbmnqykcVar3;
                }
            }
        }
        return mapWflxmlrfwp;
    }

    private static final void lqeggnwhkg(bl.eablkybsjg eablkybsjgVar, int i13, rgvfuqvkyq rgvfuqvkyqVar) throws IOException {
        long j13 = i13;
        while (j13 != 0) {
            if (j13 < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int iIgdgnonuha = eablkybsjgVar.igdgnonuha() & 65535;
            long jIgdgnonuha = ((long) eablkybsjgVar.igdgnonuha()) & 65535;
            long j14 = j13 - ((long) 4);
            if (j14 < jIgdgnonuha) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            eablkybsjgVar.grlcpdaxtj(jIgdgnonuha);
            long jDsvhmnatus = eablkybsjgVar.zoijcleaow().dsvhmnatus();
            rgvfuqvkyqVar.invoke(Integer.valueOf(iIgdgnonuha), Long.valueOf(jIgdgnonuha));
            long jDsvhmnatus2 = (eablkybsjgVar.zoijcleaow().dsvhmnatus() + jIgdgnonuha) - jDsvhmnatus;
            if (jDsvhmnatus2 < 0) {
                throw new IOException("unsupported zip: too many bytes processed for " + iIgdgnonuha);
            }
            if (jDsvhmnatus2 > 0) {
                eablkybsjgVar.zoijcleaow().wflxmlrfwp(jDsvhmnatus2);
            }
            j13 = j14 - jIgdgnonuha;
        }
    }

    public static final bl.nufgyqmvbu nufgyqmvbu(bl.eablkybsjg eablkybsjgVar, bl.nufgyqmvbu basicMetadata) throws IOException {
        zdlpuopuiu.btonecajqb(eablkybsjgVar, "<this>");
        zdlpuopuiu.btonecajqb(basicMetadata, "basicMetadata");
        bl.nufgyqmvbu nufgyqmvbuVarDxjokdxxww = dxjokdxxww(eablkybsjgVar, basicMetadata);
        zdlpuopuiu.lqeggnwhkg(nufgyqmvbuVarDxjokdxxww);
        return nufgyqmvbuVarDxjokdxxww;
    }

    private static final String ppxfxbqfkf(int i13) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append("0x");
        String string = Integer.toString(i13, mj.iobyxmoadg.iobyxmoadg(16));
        zdlpuopuiu.dxjokdxxww(string, "toString(this, checkRadix(radix))");
        sb3.append(string);
        return sb3.toString();
    }

    public static final hcddaimhww wkgbmnqykc(esjtqupxsv zipPath, bl.dxjokdxxww fileSystem, draadjrbmk predicate) {
        zdlpuopuiu.btonecajqb(zipPath, "zipPath");
        zdlpuopuiu.btonecajqb(fileSystem, "fileSystem");
        zdlpuopuiu.btonecajqb(predicate, "predicate");
        bl.lqeggnwhkg lqeggnwhkgVarAgtfadlqog = fileSystem.agtfadlqog(zipPath);
        try {
            long jRgvfuqvkyq = lqeggnwhkgVarAgtfadlqog.rgvfuqvkyq() - ((long) 22);
            if (jRgvfuqvkyq < 0) {
                throw new IOException("not a zip: size=" + lqeggnwhkgVarAgtfadlqog.rgvfuqvkyq());
            }
            long jMax = Math.max(jRgvfuqvkyq - 65536, 0L);
            do {
                bl.eablkybsjg eablkybsjgVarPpxfxbqfkf = bl.zdlpuopuiu.ppxfxbqfkf(lqeggnwhkgVarAgtfadlqog.vdvldrhtss(jRgvfuqvkyq));
                try {
                    if (eablkybsjgVarPpxfxbqfkf.R() == 101010256) {
                        cl.iobyxmoadg iobyxmoadgVarGxszxtbevo = gxszxtbevo(eablkybsjgVarPpxfxbqfkf);
                        String strYzdjzghtvl = eablkybsjgVarPpxfxbqfkf.yzdjzghtvl(iobyxmoadgVarGxszxtbevo.zoijcleaow());
                        eablkybsjgVarPpxfxbqfkf.close();
                        long j13 = jRgvfuqvkyq - ((long) 20);
                        if (j13 > 0) {
                            bl.eablkybsjg eablkybsjgVarPpxfxbqfkf2 = bl.zdlpuopuiu.ppxfxbqfkf(lqeggnwhkgVarAgtfadlqog.vdvldrhtss(j13));
                            try {
                                if (eablkybsjgVarPpxfxbqfkf2.R() == 117853008) {
                                    int iR = eablkybsjgVarPpxfxbqfkf2.R();
                                    long jFiwbwshyhd = eablkybsjgVarPpxfxbqfkf2.fiwbwshyhd();
                                    if (eablkybsjgVarPpxfxbqfkf2.R() != 1 || iR != 0) {
                                        throw new IOException("unsupported zip: spanned");
                                    }
                                    bl.eablkybsjg eablkybsjgVarPpxfxbqfkf3 = bl.zdlpuopuiu.ppxfxbqfkf(lqeggnwhkgVarAgtfadlqog.vdvldrhtss(jFiwbwshyhd));
                                    try {
                                        int iR2 = eablkybsjgVarPpxfxbqfkf3.R();
                                        if (iR2 != 101075792) {
                                            throw new IOException("bad zip: expected " + ppxfxbqfkf(101075792) + " but was " + ppxfxbqfkf(iR2));
                                        }
                                        iobyxmoadgVarGxszxtbevo = btonecajqb(eablkybsjgVarPpxfxbqfkf3, iobyxmoadgVarGxszxtbevo);
                                        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                                        rg.zoijcleaow.iobyxmoadg(eablkybsjgVarPpxfxbqfkf3, null);
                                    } catch (Throwable th2) {
                                        try {
                                            throw th2;
                                        } catch (Throwable th3) {
                                            rg.zoijcleaow.iobyxmoadg(eablkybsjgVarPpxfxbqfkf3, th2);
                                            throw th3;
                                        }
                                    }
                                    try {
                                        throw th;
                                    } catch (Throwable th4) {
                                        rg.zoijcleaow.iobyxmoadg(lqeggnwhkgVarAgtfadlqog, th);
                                        throw th4;
                                    }
                                }
                                wwaezpbzkn wwaezpbzknVar2 = wwaezpbzkn.f37140iobyxmoadg;
                                rg.zoijcleaow.iobyxmoadg(eablkybsjgVarPpxfxbqfkf2, null);
                            } catch (Throwable th5) {
                                try {
                                    throw th5;
                                } catch (Throwable th6) {
                                    rg.zoijcleaow.iobyxmoadg(eablkybsjgVarPpxfxbqfkf2, th5);
                                    throw th6;
                                }
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        bl.eablkybsjg eablkybsjgVarPpxfxbqfkf4 = bl.zdlpuopuiu.ppxfxbqfkf(lqeggnwhkgVarAgtfadlqog.vdvldrhtss(iobyxmoadgVarGxszxtbevo.iobyxmoadg()));
                        try {
                            long jPpxfxbqfkf = iobyxmoadgVarGxszxtbevo.ppxfxbqfkf();
                            for (long j14 = 0; j14 < jPpxfxbqfkf; j14++) {
                                wkgbmnqykc wkgbmnqykcVarEablkybsjg = eablkybsjg(eablkybsjgVarPpxfxbqfkf4);
                                if (wkgbmnqykcVarEablkybsjg.gxszxtbevo() >= iobyxmoadgVarGxszxtbevo.iobyxmoadg()) {
                                    throw new IOException("bad zip: local file header offset >= central directory offset");
                                }
                                if (((Boolean) predicate.invoke(wkgbmnqykcVarEablkybsjg)).booleanValue()) {
                                    arrayList.add(wkgbmnqykcVarEablkybsjg);
                                }
                            }
                            wwaezpbzkn wwaezpbzknVar3 = wwaezpbzkn.f37140iobyxmoadg;
                            rg.zoijcleaow.iobyxmoadg(eablkybsjgVarPpxfxbqfkf4, null);
                            hcddaimhww hcddaimhwwVar = new hcddaimhww(zipPath, fileSystem, iobyxmoadg(arrayList), strYzdjzghtvl);
                            rg.zoijcleaow.iobyxmoadg(lqeggnwhkgVarAgtfadlqog, null);
                            return hcddaimhwwVar;
                        } catch (Throwable th7) {
                            try {
                                throw th7;
                            } catch (Throwable th8) {
                                rg.zoijcleaow.iobyxmoadg(eablkybsjgVarPpxfxbqfkf4, th7);
                                throw th8;
                            }
                        }
                    }
                    eablkybsjgVarPpxfxbqfkf.close();
                    jRgvfuqvkyq--;
                } catch (Throwable th9) {
                    eablkybsjgVarPpxfxbqfkf.close();
                    throw th9;
                }
            } while (jRgvfuqvkyq >= jMax);
            throw new IOException("not a zip: end of central directory signature not found");
        } catch (Throwable th10) {
            throw th10;
        }
    }

    private static final Long zoijcleaow(int i13, int i14) {
        if (i14 == -1) {
            return null;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(14, 0);
        gregorianCalendar.set(((i13 >> 9) & 127) + 1980, ((i13 >> 5) & 15) - 1, i13 & 31, (i14 >> 11) & 31, (i14 >> 5) & 63, (i14 & 31) << 1);
        return Long.valueOf(gregorianCalendar.getTime().getTime());
    }
}
