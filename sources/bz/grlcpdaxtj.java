package bz;

import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
class grlcpdaxtj extends metgxyhuhe implements t6.agtfadlqog {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final t6.zdlpuopuiu f17423eablkybsjg;

    grlcpdaxtj(t6.zdlpuopuiu zdlpuopuiuVar) {
        super(kc2.lqeggnwhkg.AppKey);
        this.f17423eablkybsjg = zdlpuopuiuVar;
    }

    private String cdpycssgdh() {
        return UUID.randomUUID().toString();
    }

    @Override // t6.agtfadlqog
    public t6.zdlpuopuiu jyumaefscl() {
        return this.f17423eablkybsjg;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bz.metgxyhuhe
    /* JADX INFO: renamed from: yadqdtsiqt, reason: merged with bridge method [inline-methods] */
    public String lereixgezr() {
        String str = (String) ppxfxbqfkf();
        if (str != null) {
            return str;
        }
        String strCdpycssgdh = cdpycssgdh();
        btonecajqb(strCdpycssgdh);
        return strCdpycssgdh;
    }
}
