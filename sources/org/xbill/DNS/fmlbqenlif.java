package org.xbill.DNS;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class fmlbqenlif extends e {

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private List f74362lereixgezr;

    fmlbqenlif() {
    }

    public int crxdokpmqz() {
        return this.f74321jyumaefscl;
    }

    @Override // org.xbill.DNS.e
    public boolean equals(Object obj) {
        return super.equals(obj) && this.f74320iwizpuwonk == ((fmlbqenlif) obj).f74320iwizpuwonk;
    }

    @Override // org.xbill.DNS.e
    public int hashCode() {
        int i13 = 0;
        for (byte b13 : tzroggbefp()) {
            i13 += (i13 << 3) + (b13 & 255);
        }
        return i13;
    }

    @Override // org.xbill.DNS.e
    protected String hcddaimhww() {
        StringBuilder sb3 = new StringBuilder();
        List list = this.f74362lereixgezr;
        if (list != null) {
            sb3.append(list);
            sb3.append(" ");
        }
        sb3.append(" ; payload ");
        sb3.append(crxdokpmqz());
        sb3.append(", xrcode ");
        sb3.append(ulzqkzuiru());
        sb3.append(", version ");
        sb3.append(jlmebxxoox());
        sb3.append(", flags ");
        sb3.append(sopmlzcsov());
        return sb3.toString();
    }

    public int jlmebxxoox() {
        return (int) ((this.f74320iwizpuwonk >>> 16) & 255);
    }

    @Override // org.xbill.DNS.e
    protected void jpowsppfya(jyumaefscl jyumaefsclVar, agtfadlqog agtfadlqogVar, boolean z13) {
        List list = this.f74362lereixgezr;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((yadqdtsiqt) it.next()).lqeggnwhkg(jyumaefsclVar);
        }
    }

    @Override // org.xbill.DNS.e
    protected void pkzmftpjix(zdlpuopuiu zdlpuopuiuVar) throws WireParseException {
        if (zdlpuopuiuVar.gtknphoqwx() > 0) {
            this.f74362lereixgezr = new ArrayList();
        }
        while (zdlpuopuiuVar.gtknphoqwx() > 0) {
            this.f74362lereixgezr.add(yadqdtsiqt.iobyxmoadg(zdlpuopuiuVar));
        }
    }

    void ribwqtqdhb(StringBuilder sb3) {
        sb3.append(";; OPT PSEUDOSECTION: \n; EDNS: version: ");
        sb3.append(jlmebxxoox());
        sb3.append("; flags: ");
        for (int i13 = 0; i13 < 16; i13++) {
            if ((sopmlzcsov() & (1 << (15 - i13))) != 0) {
                sb3.append(wwaezpbzkn.iobyxmoadg(i13));
                sb3.append(" ");
            }
        }
        sb3.append("; udp: ");
        sb3.append(crxdokpmqz());
        List<yadqdtsiqt> list = this.f74362lereixgezr;
        if (list != null) {
            for (yadqdtsiqt yadqdtsiqtVar : list) {
                sb3.append("\n; ");
                sb3.append(yadqdtsiqt.iobyxmoadg.iobyxmoadg(yadqdtsiqtVar.zoijcleaow()));
                sb3.append(": ");
                sb3.append(yadqdtsiqtVar.eablkybsjg());
            }
        }
    }

    public int sopmlzcsov() {
        return (int) (this.f74320iwizpuwonk & 65535);
    }

    @Override // org.xbill.DNS.e
    public String toString() {
        return auzgnhcxok.f74233pmvmpeiblj + "\t\t\t\t" + x2.wkgbmnqykc(this.f74322yggfygwlhe) + "\t" + hcddaimhww();
    }

    public int ulzqkzuiru() {
        return (int) (this.f74320iwizpuwonk >>> 24);
    }

    public fmlbqenlif(int i13, int i14, int i15, int i16) {
        super(auzgnhcxok.f74233pmvmpeiblj, 41, i13, 0L);
        e.lqeggnwhkg("payloadSize", i13);
        e.draadjrbmk("xrcode", i14);
        e.draadjrbmk("version", i15);
        e.lqeggnwhkg("flags", i16);
        this.f74320iwizpuwonk = (((long) i14) << 24) + (((long) i15) << 16) + ((long) i16);
    }
}
