package org.xbill.DNS;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v extends e {

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private static final lqeggnwhkg f74524istkbnxepw;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    protected int f74525lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    protected auzgnhcxok f74526pmvmpeiblj;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    protected final Map f74527zynmafqrjb = new TreeMap();

    public static class btonecajqb extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final int f74528iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private byte[] f74529zoijcleaow = new byte[0];

        public btonecajqb(int i13) {
            this.f74528iobyxmoadg = i13;
        }

        @Override // org.xbill.DNS.v.zoijcleaow
        public void iobyxmoadg(byte[] bArr) {
            this.f74529zoijcleaow = bArr;
        }

        @Override // org.xbill.DNS.v.zoijcleaow
        public String toString() {
            return e.iobyxmoadg(this.f74529zoijcleaow, false);
        }

        @Override // org.xbill.DNS.v.zoijcleaow
        public byte[] zoijcleaow() {
            return this.f74529zoijcleaow;
        }
    }

    public static class dxjokdxxww extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private int f74530iobyxmoadg;

        @Override // org.xbill.DNS.v.zoijcleaow
        public void iobyxmoadg(byte[] bArr) throws WireParseException {
            zdlpuopuiu zdlpuopuiuVar = new zdlpuopuiu(bArr);
            this.f74530iobyxmoadg = zdlpuopuiuVar.nufgyqmvbu();
            if (zdlpuopuiuVar.gtknphoqwx() > 0) {
                throw new WireParseException("Unexpected number of bytes in port parameter");
            }
        }

        @Override // org.xbill.DNS.v.zoijcleaow
        public String toString() {
            return Integer.toString(this.f74530iobyxmoadg);
        }

        @Override // org.xbill.DNS.v.zoijcleaow
        public byte[] zoijcleaow() {
            jyumaefscl jyumaefsclVar = new jyumaefscl();
            jyumaefsclVar.dxjokdxxww(this.f74530iobyxmoadg);
            return jyumaefsclVar.eablkybsjg();
        }
    }

    public static class eablkybsjg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f74531iobyxmoadg = new ArrayList();

        @Override // org.xbill.DNS.v.zoijcleaow
        public void iobyxmoadg(byte[] bArr) throws WireParseException {
            this.f74531iobyxmoadg.clear();
            zdlpuopuiu zdlpuopuiuVar = new zdlpuopuiu(bArr);
            while (zdlpuopuiuVar.gtknphoqwx() >= 16) {
                this.f74531iobyxmoadg.add(zdlpuopuiuVar.gxszxtbevo(16));
            }
            if (zdlpuopuiuVar.gtknphoqwx() > 0) {
                throw new WireParseException("Unexpected number of bytes in ipv6hint parameter");
            }
        }

        @Override // org.xbill.DNS.v.zoijcleaow
        public String toString() {
            StringBuilder sb3 = new StringBuilder();
            for (byte[] bArr : this.f74531iobyxmoadg) {
                if (sb3.length() > 0) {
                    sb3.append(StringUtils.COMMA);
                }
                try {
                    sb3.append(InetAddress.getByAddress(null, bArr).getHostAddress());
                } catch (UnknownHostException e13) {
                    return e13.getMessage();
                }
            }
            return sb3.toString();
        }

        @Override // org.xbill.DNS.v.zoijcleaow
        public byte[] zoijcleaow() {
            jyumaefscl jyumaefsclVar = new jyumaefscl();
            Iterator it = this.f74531iobyxmoadg.iterator();
            while (it.hasNext()) {
                jyumaefsclVar.gxszxtbevo((byte[]) it.next());
            }
            return jyumaefsclVar.eablkybsjg();
        }
    }

    public static class gxszxtbevo extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f74532iobyxmoadg = new ArrayList();

        @Override // org.xbill.DNS.v.zoijcleaow
        public void iobyxmoadg(byte[] bArr) throws WireParseException {
            this.f74532iobyxmoadg.clear();
            zdlpuopuiu zdlpuopuiuVar = new zdlpuopuiu(bArr);
            while (zdlpuopuiuVar.gtknphoqwx() >= 2) {
                this.f74532iobyxmoadg.add(Integer.valueOf(zdlpuopuiuVar.nufgyqmvbu()));
            }
            if (zdlpuopuiuVar.gtknphoqwx() > 0) {
                throw new WireParseException("Unexpected number of bytes in mandatory parameter");
            }
        }

        @Override // org.xbill.DNS.v.zoijcleaow
        public String toString() {
            StringBuilder sb3 = new StringBuilder();
            for (Integer num : this.f74532iobyxmoadg) {
                if (sb3.length() > 0) {
                    sb3.append(StringUtils.COMMA);
                }
                sb3.append(v.f74524istkbnxepw.wkgbmnqykc(num.intValue()));
            }
            return sb3.toString();
        }

        @Override // org.xbill.DNS.v.zoijcleaow
        public byte[] zoijcleaow() {
            jyumaefscl jyumaefsclVar = new jyumaefscl();
            Iterator it = this.f74532iobyxmoadg.iterator();
            while (it.hasNext()) {
                jyumaefsclVar.dxjokdxxww(((Integer) it.next()).intValue());
            }
            return jyumaefsclVar.eablkybsjg();
        }
    }

    public static class iobyxmoadg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f74533iobyxmoadg = new ArrayList();

        @Override // org.xbill.DNS.v.zoijcleaow
        public void iobyxmoadg(byte[] bArr) {
            this.f74533iobyxmoadg.clear();
            zdlpuopuiu zdlpuopuiuVar = new zdlpuopuiu(bArr);
            while (zdlpuopuiuVar.gtknphoqwx() > 0) {
                this.f74533iobyxmoadg.add(zdlpuopuiuVar.lqeggnwhkg());
            }
        }

        @Override // org.xbill.DNS.v.zoijcleaow
        public String toString() {
            StringBuilder sb3 = new StringBuilder();
            for (byte[] bArr : this.f74533iobyxmoadg) {
                if (sb3.length() > 0) {
                    sb3.append(StringUtils.COMMA);
                }
                sb3.append(e.iobyxmoadg(bArr, false).replaceAll(StringUtils.COMMA, "\\\\,"));
            }
            return sb3.toString();
        }

        @Override // org.xbill.DNS.v.zoijcleaow
        public byte[] zoijcleaow() {
            jyumaefscl jyumaefsclVar = new jyumaefscl();
            Iterator it = this.f74533iobyxmoadg.iterator();
            while (it.hasNext()) {
                jyumaefsclVar.nufgyqmvbu((byte[]) it.next());
            }
            return jyumaefsclVar.eablkybsjg();
        }
    }

    private static class lqeggnwhkg extends oipsdeybqn {

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private final HashMap f74534nufgyqmvbu;

        public lqeggnwhkg() {
            super("SVCB/HTTPS Parameters", 3);
            nufgyqmvbu("key");
            lqeggnwhkg(true);
            gxszxtbevo(65535);
            this.f74534nufgyqmvbu = new HashMap();
        }

        public Supplier btonecajqb(int i13) {
            return (Supplier) this.f74534nufgyqmvbu.get(Integer.valueOf(i13));
        }

        public void dxjokdxxww(int i13, String str, Supplier supplier) {
            super.iobyxmoadg(i13, str);
            this.f74534nufgyqmvbu.put(Integer.valueOf(i13), supplier);
        }
    }

    public static class nufgyqmvbu extends zoijcleaow {
        @Override // org.xbill.DNS.v.zoijcleaow
        public void iobyxmoadg(byte[] bArr) throws WireParseException {
            if (bArr.length > 0) {
                throw new WireParseException("No value can be specified for no-default-alpn");
            }
        }

        @Override // org.xbill.DNS.v.zoijcleaow
        public String toString() {
            return "";
        }

        @Override // org.xbill.DNS.v.zoijcleaow
        public byte[] zoijcleaow() {
            return new byte[0];
        }
    }

    public static class ppxfxbqfkf extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private byte[] f74535iobyxmoadg;

        @Override // org.xbill.DNS.v.zoijcleaow
        public void iobyxmoadg(byte[] bArr) {
            this.f74535iobyxmoadg = bArr;
        }

        @Override // org.xbill.DNS.v.zoijcleaow
        public String toString() {
            return km.ppxfxbqfkf.zoijcleaow(this.f74535iobyxmoadg);
        }

        @Override // org.xbill.DNS.v.zoijcleaow
        public byte[] zoijcleaow() {
            return this.f74535iobyxmoadg;
        }
    }

    public static class wkgbmnqykc extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final List f74536iobyxmoadg = new ArrayList();

        @Override // org.xbill.DNS.v.zoijcleaow
        public void iobyxmoadg(byte[] bArr) throws WireParseException {
            this.f74536iobyxmoadg.clear();
            zdlpuopuiu zdlpuopuiuVar = new zdlpuopuiu(bArr);
            while (zdlpuopuiuVar.gtknphoqwx() >= 4) {
                this.f74536iobyxmoadg.add(zdlpuopuiuVar.gxszxtbevo(4));
            }
            if (zdlpuopuiuVar.gtknphoqwx() > 0) {
                throw new WireParseException("Unexpected number of bytes in ipv4hint parameter");
            }
        }

        @Override // org.xbill.DNS.v.zoijcleaow
        public String toString() {
            StringBuilder sb3 = new StringBuilder();
            for (byte[] bArr : this.f74536iobyxmoadg) {
                if (sb3.length() > 0) {
                    sb3.append(StringUtils.COMMA);
                }
                sb3.append(org.xbill.DNS.gxszxtbevo.btonecajqb(bArr));
            }
            return sb3.toString();
        }

        @Override // org.xbill.DNS.v.zoijcleaow
        public byte[] zoijcleaow() {
            jyumaefscl jyumaefsclVar = new jyumaefscl();
            Iterator it = this.f74536iobyxmoadg.iterator();
            while (it.hasNext()) {
                jyumaefsclVar.gxszxtbevo((byte[]) it.next());
            }
            return jyumaefsclVar.eablkybsjg();
        }
    }

    public static abstract class zoijcleaow {
        public abstract void iobyxmoadg(byte[] bArr);

        public abstract String toString();

        public abstract byte[] zoijcleaow();
    }

    static {
        lqeggnwhkg lqeggnwhkgVar = new lqeggnwhkg();
        f74524istkbnxepw = lqeggnwhkgVar;
        lqeggnwhkgVar.dxjokdxxww(0, "mandatory", new Supplier() { // from class: org.xbill.DNS.o
            @Override // java.util.function.Supplier
            public final Object get() {
                return new v.gxszxtbevo();
            }
        });
        lqeggnwhkgVar.dxjokdxxww(1, "alpn", new Supplier() { // from class: org.xbill.DNS.p
            @Override // java.util.function.Supplier
            public final Object get() {
                return new v.iobyxmoadg();
            }
        });
        lqeggnwhkgVar.dxjokdxxww(2, "no-default-alpn", new Supplier() { // from class: org.xbill.DNS.q
            @Override // java.util.function.Supplier
            public final Object get() {
                return new v.nufgyqmvbu();
            }
        });
        lqeggnwhkgVar.dxjokdxxww(3, "port", new Supplier() { // from class: org.xbill.DNS.r
            @Override // java.util.function.Supplier
            public final Object get() {
                return new v.dxjokdxxww();
            }
        });
        lqeggnwhkgVar.dxjokdxxww(4, "ipv4hint", new Supplier() { // from class: org.xbill.DNS.s
            @Override // java.util.function.Supplier
            public final Object get() {
                return new v.wkgbmnqykc();
            }
        });
        lqeggnwhkgVar.dxjokdxxww(5, "ech", new Supplier() { // from class: org.xbill.DNS.t
            @Override // java.util.function.Supplier
            public final Object get() {
                return new v.ppxfxbqfkf();
            }
        });
        lqeggnwhkgVar.dxjokdxxww(6, "ipv6hint", new Supplier() { // from class: org.xbill.DNS.u
            @Override // java.util.function.Supplier
            public final Object get() {
                return new v.eablkybsjg();
            }
        });
        lqeggnwhkgVar.zoijcleaow(5, "echconfig");
    }

    protected v() {
    }

    public zoijcleaow crxdokpmqz(int i13) {
        return (zoijcleaow) this.f74527zynmafqrjb.get(Integer.valueOf(i13));
    }

    @Override // org.xbill.DNS.e
    protected String hcddaimhww() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f74525lereixgezr);
        sb3.append(" ");
        sb3.append(this.f74526pmvmpeiblj);
        for (Integer num : this.f74527zynmafqrjb.keySet()) {
            sb3.append(" ");
            sb3.append(f74524istkbnxepw.wkgbmnqykc(num.intValue()));
            String string = ((zoijcleaow) this.f74527zynmafqrjb.get(num)).toString();
            if (string != null && !string.isEmpty()) {
                sb3.append("=");
                sb3.append(string);
            }
        }
        return sb3.toString();
    }

    @Override // org.xbill.DNS.e
    protected void jpowsppfya(jyumaefscl jyumaefsclVar, agtfadlqog agtfadlqogVar, boolean z13) {
        jyumaefsclVar.dxjokdxxww(this.f74525lereixgezr);
        this.f74526pmvmpeiblj.lmojexxdyd(jyumaefsclVar, null, z13);
        for (Integer num : this.f74527zynmafqrjb.keySet()) {
            jyumaefsclVar.dxjokdxxww(num.intValue());
            byte[] bArrZoijcleaow = ((zoijcleaow) this.f74527zynmafqrjb.get(num)).zoijcleaow();
            jyumaefsclVar.dxjokdxxww(bArrZoijcleaow.length);
            jyumaefsclVar.gxszxtbevo(bArrZoijcleaow);
        }
    }

    @Override // org.xbill.DNS.e
    protected void pkzmftpjix(zdlpuopuiu zdlpuopuiuVar) throws WireParseException {
        this.f74525lereixgezr = zdlpuopuiuVar.nufgyqmvbu();
        this.f74526pmvmpeiblj = new auzgnhcxok(zdlpuopuiuVar);
        this.f74527zynmafqrjb.clear();
        while (zdlpuopuiuVar.gtknphoqwx() >= 4) {
            int iNufgyqmvbu = zdlpuopuiuVar.nufgyqmvbu();
            byte[] bArrGxszxtbevo = zdlpuopuiuVar.gxszxtbevo(zdlpuopuiuVar.nufgyqmvbu());
            Supplier supplierBtonecajqb = f74524istkbnxepw.btonecajqb(iNufgyqmvbu);
            zoijcleaow btonecajqbVar = supplierBtonecajqb != null ? (zoijcleaow) supplierBtonecajqb.get() : new btonecajqb(iNufgyqmvbu);
            btonecajqbVar.iobyxmoadg(bArrGxszxtbevo);
            this.f74527zynmafqrjb.put(Integer.valueOf(iNufgyqmvbu), btonecajqbVar);
        }
        if (zdlpuopuiuVar.gtknphoqwx() > 0) {
            throw new WireParseException("Record had unexpected number of bytes");
        }
        if (!sopmlzcsov()) {
            throw new WireParseException("Not all mandatory SvcParams are specified");
        }
    }

    protected boolean sopmlzcsov() {
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) crxdokpmqz(0);
        if (gxszxtbevoVar == null) {
            return true;
        }
        Iterator it = gxszxtbevoVar.f74532iobyxmoadg.iterator();
        while (it.hasNext()) {
            if (crxdokpmqz(((Integer) it.next()).intValue()) == null) {
                return false;
            }
        }
        return true;
    }
}
