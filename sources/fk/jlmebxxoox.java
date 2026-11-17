package fk;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jlmebxxoox extends iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final bk.zoijcleaow f34183iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final bk.zoijcleaow f34184zoijcleaow;

    public /* synthetic */ jlmebxxoox(bk.zoijcleaow zoijcleaowVar, bk.zoijcleaow zoijcleaowVar2, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(zoijcleaowVar, zoijcleaowVar2);
    }

    @Override // bk.zoijcleaow, bk.agtfadlqog, bk.iobyxmoadg
    public abstract dk.gxszxtbevo iobyxmoadg();

    public final bk.zoijcleaow kcexrzcfyt() {
        return this.f34184zoijcleaow;
    }

    public final bk.zoijcleaow oxmwwwfdhm() {
        return this.f34183iobyxmoadg;
    }

    @Override // bk.agtfadlqog
    public void wkgbmnqykc(ek.gxszxtbevo encoder, Object obj) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(encoder, "encoder");
        int iBtonecajqb = btonecajqb(obj);
        dk.gxszxtbevo gxszxtbevoVarIobyxmoadg = iobyxmoadg();
        ek.wkgbmnqykc wkgbmnqykcVarIozdgvuglv = encoder.iozdgvuglv(gxszxtbevoVarIobyxmoadg, iBtonecajqb);
        Iterator itDxjokdxxww = dxjokdxxww(obj);
        int i13 = 0;
        while (itDxjokdxxww.hasNext()) {
            Map.Entry entry = (Map.Entry) itDxjokdxxww.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i14 = i13 + 1;
            wkgbmnqykcVarIozdgvuglv.lqeggnwhkg(iobyxmoadg(), i13, oxmwwwfdhm(), key);
            i13 += 2;
            wkgbmnqykcVarIozdgvuglv.lqeggnwhkg(iobyxmoadg(), i14, kcexrzcfyt(), value);
        }
        wkgbmnqykcVarIozdgvuglv.zoijcleaow(gxszxtbevoVarIobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fk.iobyxmoadg
    /* JADX INFO: renamed from: yggfygwlhe, reason: merged with bridge method [inline-methods] */
    public final void wflxmlrfwp(ek.ppxfxbqfkf decoder, int i13, Map builder, boolean z13) {
        int iYadqdtsiqt;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(decoder, "decoder");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(builder, "builder");
        Object objPpxfxbqfkf = ek.ppxfxbqfkf.iobyxmoadg.ppxfxbqfkf(decoder, iobyxmoadg(), i13, this.f34183iobyxmoadg, null, 8, null);
        if (z13) {
            iYadqdtsiqt = decoder.yadqdtsiqt(iobyxmoadg());
            if (iYadqdtsiqt != i13 + 1) {
                throw new IllegalArgumentException(("Value must follow key in a map, index for key: " + i13 + ", returned index for value: " + iYadqdtsiqt).toString());
            }
        } else {
            iYadqdtsiqt = i13 + 1;
        }
        int i14 = iYadqdtsiqt;
        builder.put(objPpxfxbqfkf, (!builder.containsKey(objPpxfxbqfkf) || (this.f34184zoijcleaow.iobyxmoadg().getKind() instanceof dk.eablkybsjg)) ? ek.ppxfxbqfkf.iobyxmoadg.ppxfxbqfkf(decoder, iobyxmoadg(), i14, this.f34184zoijcleaow, null, 8, null) : decoder.lereixgezr(iobyxmoadg(), i14, this.f34184zoijcleaow, hg.tzroggbefp.btonecajqb(builder, objPpxfxbqfkf)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fk.iobyxmoadg
    /* JADX INFO: renamed from: zdlpuopuiu, reason: merged with bridge method [inline-methods] */
    public final void draadjrbmk(ek.ppxfxbqfkf decoder, Map builder, int i13, int i14) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(decoder, "decoder");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(builder, "builder");
        if (i14 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        zg.nufgyqmvbu nufgyqmvbuVarZdlpuopuiu = zg.gtknphoqwx.zdlpuopuiu(zg.gtknphoqwx.jyumaefscl(0, i14 * 2), 2);
        int iWkgbmnqykc = nufgyqmvbuVarZdlpuopuiu.wkgbmnqykc();
        int iEablkybsjg = nufgyqmvbuVarZdlpuopuiu.eablkybsjg();
        int iGxszxtbevo = nufgyqmvbuVarZdlpuopuiu.gxszxtbevo();
        if ((iGxszxtbevo <= 0 || iWkgbmnqykc > iEablkybsjg) && (iGxszxtbevo >= 0 || iEablkybsjg > iWkgbmnqykc)) {
            return;
        }
        while (true) {
            wflxmlrfwp(decoder, i13 + iWkgbmnqykc, builder, false);
            if (iWkgbmnqykc == iEablkybsjg) {
                return;
            } else {
                iWkgbmnqykc += iGxszxtbevo;
            }
        }
    }

    private jlmebxxoox(bk.zoijcleaow zoijcleaowVar, bk.zoijcleaow zoijcleaowVar2) {
        super(null);
        this.f34183iobyxmoadg = zoijcleaowVar;
        this.f34184zoijcleaow = zoijcleaowVar2;
    }
}
