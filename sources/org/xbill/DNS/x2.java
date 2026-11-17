package org.xbill.DNS;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.HashMap;
import java.util.function.Supplier;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x2 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final iobyxmoadg f74558iobyxmoadg;

    private static class iobyxmoadg extends oipsdeybqn {

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private final HashMap f74559nufgyqmvbu;

        public iobyxmoadg() {
            super("Type", 2);
            nufgyqmvbu("TYPE");
            gxszxtbevo(65535);
            this.f74559nufgyqmvbu = new HashMap();
        }

        public Supplier btonecajqb(int i13) {
            ppxfxbqfkf(i13);
            return (Supplier) this.f74559nufgyqmvbu.get(Integer.valueOf(i13));
        }

        public void dxjokdxxww(int i13, String str, Supplier supplier) {
            super.iobyxmoadg(i13, str);
            this.f74559nufgyqmvbu.put(Integer.valueOf(i13), supplier);
        }

        @Override // org.xbill.DNS.oipsdeybqn
        public void ppxfxbqfkf(int i13) {
            x2.iobyxmoadg(i13);
        }
    }

    static {
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
        f74558iobyxmoadg = iobyxmoadgVar;
        iobyxmoadgVar.dxjokdxxww(1, "A", new Supplier() { // from class: org.xbill.DNS.o0
            @Override // java.util.function.Supplier
            public final Object get() {
                return new eablkybsjg();
            }
        });
        iobyxmoadgVar.dxjokdxxww(2, "NS", new Supplier() { // from class: org.xbill.DNS.q0
            @Override // java.util.function.Supplier
            public final Object get() {
                return new tbqsvytpvh();
            }
        });
        iobyxmoadgVar.dxjokdxxww(3, "MD", new Supplier() { // from class: org.xbill.DNS.c1
            @Override // java.util.function.Supplier
            public final Object get() {
                return new rlfsiqarku();
            }
        });
        iobyxmoadgVar.dxjokdxxww(4, "MF", new Supplier() { // from class: org.xbill.DNS.o1
            @Override // java.util.function.Supplier
            public final Object get() {
                return new czzsidtyhn();
            }
        });
        iobyxmoadgVar.dxjokdxxww(5, "CNAME", new Supplier() { // from class: org.xbill.DNS.a2
            @Override // java.util.function.Supplier
            public final Object get() {
                return new gtknphoqwx();
            }
        });
        iobyxmoadgVar.dxjokdxxww(6, "SOA", new Supplier() { // from class: org.xbill.DNS.m2
            @Override // java.util.function.Supplier
            public final Object get() {
                return new k();
            }
        });
        iobyxmoadgVar.dxjokdxxww(7, "MB", new Supplier() { // from class: org.xbill.DNS.o2
            @Override // java.util.function.Supplier
            public final Object get() {
                return new metgxyhuhe();
            }
        });
        iobyxmoadgVar.dxjokdxxww(8, "MG", new Supplier() { // from class: org.xbill.DNS.p2
            @Override // java.util.function.Supplier
            public final Object get() {
                return new uwvvkdfqfp();
            }
        });
        iobyxmoadgVar.dxjokdxxww(9, "MR", new Supplier() { // from class: org.xbill.DNS.q2
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ydmasvzmpa();
            }
        });
        iobyxmoadgVar.dxjokdxxww(10, "NULL", new Supplier() { // from class: org.xbill.DNS.s2
            @Override // java.util.function.Supplier
            public final Object get() {
                return new roivzttewh();
            }
        });
        iobyxmoadgVar.dxjokdxxww(11, "WKS", new Supplier() { // from class: org.xbill.DNS.z0
            @Override // java.util.function.Supplier
            public final Object get() {
                return new c3();
            }
        });
        iobyxmoadgVar.dxjokdxxww(12, "PTR", new Supplier() { // from class: org.xbill.DNS.k1
            @Override // java.util.function.Supplier
            public final Object get() {
                return new yzdjzghtvl();
            }
        });
        iobyxmoadgVar.dxjokdxxww(13, "HINFO", new Supplier() { // from class: org.xbill.DNS.v1
            @Override // java.util.function.Supplier
            public final Object get() {
                return new mbcevpiqjq();
            }
        });
        iobyxmoadgVar.dxjokdxxww(14, "MINFO", new Supplier() { // from class: org.xbill.DNS.g2
            @Override // java.util.function.Supplier
            public final Object get() {
                return new yfnezrywwk();
            }
        });
        iobyxmoadgVar.dxjokdxxww(15, "MX", new Supplier() { // from class: org.xbill.DNS.r2
            @Override // java.util.function.Supplier
            public final Object get() {
                return new sflfametgt();
            }
        });
        iobyxmoadgVar.dxjokdxxww(16, "TXT", new Supplier() { // from class: org.xbill.DNS.t2
            @Override // java.util.function.Supplier
            public final Object get() {
                return new m0();
            }
        });
        iobyxmoadgVar.dxjokdxxww(17, "RP", new Supplier() { // from class: org.xbill.DNS.u2
            @Override // java.util.function.Supplier
            public final Object get() {
                return new krqnebusok();
            }
        });
        iobyxmoadgVar.dxjokdxxww(18, "AFSDB", new Supplier() { // from class: org.xbill.DNS.v2
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ppxfxbqfkf();
            }
        });
        iobyxmoadgVar.dxjokdxxww(19, "X25", new Supplier() { // from class: org.xbill.DNS.w2
            @Override // java.util.function.Supplier
            public final Object get() {
                return new d3();
            }
        });
        iobyxmoadgVar.dxjokdxxww(20, "ISDN", new Supplier() { // from class: org.xbill.DNS.p0
            @Override // java.util.function.Supplier
            public final Object get() {
                return new vipkmwdibw();
            }
        });
        iobyxmoadgVar.dxjokdxxww(21, "RT", new Supplier() { // from class: org.xbill.DNS.r0
            @Override // java.util.function.Supplier
            public final Object get() {
                return new c();
            }
        });
        iobyxmoadgVar.dxjokdxxww(22, "NSAP", new Supplier() { // from class: org.xbill.DNS.s0
            @Override // java.util.function.Supplier
            public final Object get() {
                return new opjhrmiecq();
            }
        });
        iobyxmoadgVar.dxjokdxxww(23, "NSAP-PTR", new Supplier() { // from class: org.xbill.DNS.t0
            @Override // java.util.function.Supplier
            public final Object get() {
                return new iyctptxqzt();
            }
        });
        iobyxmoadgVar.dxjokdxxww(24, "SIG", new Supplier() { // from class: org.xbill.DNS.u0
            @Override // java.util.function.Supplier
            public final Object get() {
                return new i();
            }
        });
        iobyxmoadgVar.dxjokdxxww(25, "KEY", new Supplier() { // from class: org.xbill.DNS.v0
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ikoacuggdj();
            }
        });
        iobyxmoadgVar.dxjokdxxww(26, "PX", new Supplier() { // from class: org.xbill.DNS.w0
            @Override // java.util.function.Supplier
            public final Object get() {
                return new eslsurpljm();
            }
        });
        iobyxmoadgVar.dxjokdxxww(27, "GPOS", new Supplier() { // from class: org.xbill.DNS.x0
            @Override // java.util.function.Supplier
            public final Object get() {
                return new kegysxyocb();
            }
        });
        iobyxmoadgVar.dxjokdxxww(28, "AAAA", new Supplier() { // from class: org.xbill.DNS.y0
            @Override // java.util.function.Supplier
            public final Object get() {
                return new zoijcleaow();
            }
        });
        iobyxmoadgVar.dxjokdxxww(29, "LOC", new Supplier() { // from class: org.xbill.DNS.a1
            @Override // java.util.function.Supplier
            public final Object get() {
                return new jztzpxfvev();
            }
        });
        iobyxmoadgVar.dxjokdxxww(30, "NXT", new Supplier() { // from class: org.xbill.DNS.b1
            @Override // java.util.function.Supplier
            public final Object get() {
                return new uawqvzlxes();
            }
        });
        iobyxmoadgVar.iobyxmoadg(31, "EID");
        iobyxmoadgVar.iobyxmoadg(32, "NIMLOC");
        iobyxmoadgVar.dxjokdxxww(33, "SRV", new Supplier() { // from class: org.xbill.DNS.d1
            @Override // java.util.function.Supplier
            public final Object get() {
                return new m();
            }
        });
        iobyxmoadgVar.iobyxmoadg(34, "ATMA");
        iobyxmoadgVar.dxjokdxxww(35, "NAPTR", new Supplier() { // from class: org.xbill.DNS.e1
            @Override // java.util.function.Supplier
            public final Object get() {
                return new bfopjjpdmp();
            }
        });
        iobyxmoadgVar.dxjokdxxww(36, "KX", new Supplier() { // from class: org.xbill.DNS.f1
            @Override // java.util.function.Supplier
            public final Object get() {
                return new okpsazkaxt();
            }
        });
        iobyxmoadgVar.dxjokdxxww(37, "CERT", new Supplier() { // from class: org.xbill.DNS.g1
            @Override // java.util.function.Supplier
            public final Object get() {
                return new btonecajqb();
            }
        });
        iobyxmoadgVar.dxjokdxxww(38, "A6", new Supplier() { // from class: org.xbill.DNS.h1
            @Override // java.util.function.Supplier
            public final Object get() {
                return new iobyxmoadg();
            }
        });
        iobyxmoadgVar.dxjokdxxww(39, "DNAME", new Supplier() { // from class: org.xbill.DNS.i1
            @Override // java.util.function.Supplier
            public final Object get() {
                return new kcexrzcfyt();
            }
        });
        iobyxmoadgVar.iobyxmoadg(40, "SINK");
        iobyxmoadgVar.dxjokdxxww(41, "OPT", new Supplier() { // from class: org.xbill.DNS.j1
            @Override // java.util.function.Supplier
            public final Object get() {
                return new fmlbqenlif();
            }
        });
        iobyxmoadgVar.dxjokdxxww(42, "APL", new Supplier() { // from class: org.xbill.DNS.l1
            @Override // java.util.function.Supplier
            public final Object get() {
                return new wkgbmnqykc();
            }
        });
        iobyxmoadgVar.dxjokdxxww(43, "DS", new Supplier() { // from class: org.xbill.DNS.m1
            @Override // java.util.function.Supplier
            public final Object get() {
                return new esjtqupxsv();
            }
        });
        iobyxmoadgVar.dxjokdxxww(44, "SSHFP", new Supplier() { // from class: org.xbill.DNS.n1
            @Override // java.util.function.Supplier
            public final Object get() {
                return new n();
            }
        });
        iobyxmoadgVar.dxjokdxxww(45, "IPSECKEY", new Supplier() { // from class: org.xbill.DNS.p1
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ribwqtqdhb();
            }
        });
        iobyxmoadgVar.dxjokdxxww(46, "RRSIG", new Supplier() { // from class: org.xbill.DNS.q1
            @Override // java.util.function.Supplier
            public final Object get() {
                return new a();
            }
        });
        iobyxmoadgVar.dxjokdxxww(47, "NSEC", new Supplier() { // from class: org.xbill.DNS.r1
            @Override // java.util.function.Supplier
            public final Object get() {
                return new zeieaojujs();
            }
        });
        iobyxmoadgVar.dxjokdxxww(48, "DNSKEY", new Supplier() { // from class: org.xbill.DNS.s1
            @Override // java.util.function.Supplier
            public final Object get() {
                return new yggfygwlhe();
            }
        });
        iobyxmoadgVar.dxjokdxxww(49, "DHCID", new Supplier() { // from class: org.xbill.DNS.t1
            @Override // java.util.function.Supplier
            public final Object get() {
                return new vdvldrhtss();
            }
        });
        iobyxmoadgVar.dxjokdxxww(50, "NSEC3", new Supplier() { // from class: org.xbill.DNS.u1
            @Override // java.util.function.Supplier
            public final Object get() {
                return new lrnfpwlwnk();
            }
        });
        iobyxmoadgVar.dxjokdxxww(51, "NSEC3PARAM", new Supplier() { // from class: org.xbill.DNS.w1
            @Override // java.util.function.Supplier
            public final Object get() {
                return new weqkydbzbr();
            }
        });
        iobyxmoadgVar.dxjokdxxww(52, "TLSA", new Supplier() { // from class: org.xbill.DNS.x1
            @Override // java.util.function.Supplier
            public final Object get() {
                return new h0();
            }
        });
        iobyxmoadgVar.dxjokdxxww(53, "SMIMEA", new Supplier() { // from class: org.xbill.DNS.y1
            @Override // java.util.function.Supplier
            public final Object get() {
                return new j();
            }
        });
        iobyxmoadgVar.dxjokdxxww(55, "HIP", new Supplier() { // from class: org.xbill.DNS.z1
            @Override // java.util.function.Supplier
            public final Object get() {
                return new sopmlzcsov();
            }
        });
        iobyxmoadgVar.iobyxmoadg(56, "NINFO");
        iobyxmoadgVar.iobyxmoadg(57, "RKEY");
        iobyxmoadgVar.iobyxmoadg(58, "TALINK");
        iobyxmoadgVar.dxjokdxxww(59, "CDS", new Supplier() { // from class: org.xbill.DNS.b2
            @Override // java.util.function.Supplier
            public final Object get() {
                return new dxjokdxxww();
            }
        });
        iobyxmoadgVar.dxjokdxxww(60, "CDNSKEY", new Supplier() { // from class: org.xbill.DNS.c2
            @Override // java.util.function.Supplier
            public final Object get() {
                return new nufgyqmvbu();
            }
        });
        iobyxmoadgVar.dxjokdxxww(61, "OPENPGPKEY", new Supplier() { // from class: org.xbill.DNS.d2
            @Override // java.util.function.Supplier
            public final Object get() {
                return new jrbgnlbqoe();
            }
        });
        iobyxmoadgVar.iobyxmoadg(62, "CSYNC");
        iobyxmoadgVar.iobyxmoadg(63, "ZONEMD");
        iobyxmoadgVar.dxjokdxxww(64, "SVCB", new Supplier() { // from class: org.xbill.DNS.e2
            @Override // java.util.function.Supplier
            public final Object get() {
                return new w();
            }
        });
        iobyxmoadgVar.dxjokdxxww(65, "HTTPS", new Supplier() { // from class: org.xbill.DNS.f2
            @Override // java.util.function.Supplier
            public final Object get() {
                return new crxdokpmqz();
            }
        });
        iobyxmoadgVar.dxjokdxxww(99, "SPF", new Supplier() { // from class: org.xbill.DNS.h2
            @Override // java.util.function.Supplier
            public final Object get() {
                return new l();
            }
        });
        iobyxmoadgVar.iobyxmoadg(100, "UINFO");
        iobyxmoadgVar.iobyxmoadg(101, "UID");
        iobyxmoadgVar.iobyxmoadg(102, "GID");
        iobyxmoadgVar.iobyxmoadg(103, "UNSPEC");
        iobyxmoadgVar.iobyxmoadg(104, "NID");
        iobyxmoadgVar.iobyxmoadg(105, "L32");
        iobyxmoadgVar.iobyxmoadg(106, "L64");
        iobyxmoadgVar.iobyxmoadg(107, "LP");
        iobyxmoadgVar.iobyxmoadg(108, "EUI48");
        iobyxmoadgVar.iobyxmoadg(109, "EUI64");
        iobyxmoadgVar.dxjokdxxww(249, "TKEY", new Supplier() { // from class: org.xbill.DNS.i2
            @Override // java.util.function.Supplier
            public final Object get() {
                return new g0();
            }
        });
        iobyxmoadgVar.dxjokdxxww(250, "TSIG", new Supplier() { // from class: org.xbill.DNS.j2
            @Override // java.util.function.Supplier
            public final Object get() {
                return new j0();
            }
        });
        iobyxmoadgVar.iobyxmoadg(251, "IXFR");
        iobyxmoadgVar.iobyxmoadg(252, "AXFR");
        iobyxmoadgVar.iobyxmoadg(253, "MAILB");
        iobyxmoadgVar.iobyxmoadg(254, "MAILA");
        iobyxmoadgVar.iobyxmoadg(KotlinVersion.MAX_COMPONENT_VALUE, "ANY");
        iobyxmoadgVar.dxjokdxxww(UserVerificationMethods.USER_VERIFY_HANDPRINT, "URI", new Supplier() { // from class: org.xbill.DNS.k2
            @Override // java.util.function.Supplier
            public final Object get() {
                return new b3();
            }
        });
        iobyxmoadgVar.dxjokdxxww(257, "CAA", new Supplier() { // from class: org.xbill.DNS.l2
            @Override // java.util.function.Supplier
            public final Object get() {
                return new lqeggnwhkg();
            }
        });
        iobyxmoadgVar.iobyxmoadg(258, "AVC");
        iobyxmoadgVar.iobyxmoadg(259, "DOA");
        iobyxmoadgVar.iobyxmoadg(260, "AMTRELAY");
        iobyxmoadgVar.iobyxmoadg(32768, "TA");
        iobyxmoadgVar.dxjokdxxww(32769, "DLV", new Supplier() { // from class: org.xbill.DNS.n2
            @Override // java.util.function.Supplier
            public final Object get() {
                return new oxmwwwfdhm();
            }
        });
    }

    public static void iobyxmoadg(int i13) {
        if (i13 < 0 || i13 > 65535) {
            throw new InvalidTypeException(i13);
        }
    }

    public static boolean ppxfxbqfkf(int i13) {
        if (i13 == 41) {
            return false;
        }
        switch (i13) {
            case 249:
            case 250:
            case 251:
            case 252:
            case 253:
            case 254:
            case KotlinVersion.MAX_COMPONENT_VALUE /* 255 */:
                return false;
            default:
                return true;
        }
    }

    public static String wkgbmnqykc(int i13) {
        return f74558iobyxmoadg.wkgbmnqykc(i13);
    }

    static Supplier zoijcleaow(int i13) {
        return f74558iobyxmoadg.btonecajqb(i13);
    }
}
