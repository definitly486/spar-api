package org.xbill.DNS;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes3.dex */
public class sopmlzcsov extends e {

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final List f74514istkbnxepw = new ArrayList();

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private byte[] f74515lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private int f74516pmvmpeiblj;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private byte[] f74517zynmafqrjb;

    sopmlzcsov() {
    }

    @Override // org.xbill.DNS.e
    protected String hcddaimhww() {
        StringBuilder sb3 = new StringBuilder();
        if (rhgxfdycjh.iobyxmoadg("multiline")) {
            sb3.append("( ");
        }
        String str = rhgxfdycjh.iobyxmoadg("multiline") ? "\n\t" : " ";
        sb3.append(this.f74516pmvmpeiblj);
        sb3.append(" ");
        sb3.append(km.iobyxmoadg.iobyxmoadg(this.f74515lereixgezr));
        sb3.append(str);
        sb3.append(km.ppxfxbqfkf.zoijcleaow(this.f74517zynmafqrjb));
        if (!this.f74514istkbnxepw.isEmpty()) {
            sb3.append(str);
        }
        sb3.append((String) this.f74514istkbnxepw.stream().map(new Function() { // from class: org.xbill.DNS.ntlheqmsrt
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((auzgnhcxok) obj).toString();
            }
        }).collect(Collectors.joining(str)));
        if (rhgxfdycjh.iobyxmoadg("multiline")) {
            sb3.append(" )");
        }
        return sb3.toString();
    }

    @Override // org.xbill.DNS.e
    protected void jpowsppfya(final jyumaefscl jyumaefsclVar, agtfadlqog agtfadlqogVar, final boolean z13) {
        jyumaefsclVar.draadjrbmk(this.f74515lereixgezr.length);
        jyumaefsclVar.draadjrbmk(this.f74516pmvmpeiblj);
        jyumaefsclVar.dxjokdxxww(this.f74517zynmafqrjb.length);
        jyumaefsclVar.gxszxtbevo(this.f74515lereixgezr);
        jyumaefsclVar.gxszxtbevo(this.f74517zynmafqrjb);
        this.f74514istkbnxepw.forEach(new Consumer() { // from class: org.xbill.DNS.ulzqkzuiru
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((auzgnhcxok) obj).lmojexxdyd(jyumaefsclVar, null, z13);
            }
        });
    }

    @Override // org.xbill.DNS.e
    protected void pkzmftpjix(zdlpuopuiu zdlpuopuiuVar) throws WireParseException {
        int iBtonecajqb = zdlpuopuiuVar.btonecajqb();
        this.f74516pmvmpeiblj = zdlpuopuiuVar.btonecajqb();
        int iNufgyqmvbu = zdlpuopuiuVar.nufgyqmvbu();
        this.f74515lereixgezr = zdlpuopuiuVar.gxszxtbevo(iBtonecajqb);
        this.f74517zynmafqrjb = zdlpuopuiuVar.gxszxtbevo(iNufgyqmvbu);
        while (zdlpuopuiuVar.gtknphoqwx() > 0) {
            this.f74514istkbnxepw.add(new auzgnhcxok(zdlpuopuiuVar));
        }
    }
}
