package lk;

/* JADX INFO: loaded from: classes3.dex */
public enum lmojexxdyd {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");


    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final iobyxmoadg f63165yggfygwlhe = new iobyxmoadg(null);

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f63166zdlpuopuiu;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final lmojexxdyd iobyxmoadg(String javaName) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(javaName, "javaName");
            int iHashCode = javaName.hashCode();
            if (iHashCode != 79201641) {
                if (iHashCode != 79923350) {
                    switch (iHashCode) {
                        case -503070503:
                            if (javaName.equals("TLSv1.1")) {
                                return lmojexxdyd.TLS_1_1;
                            }
                            break;
                        case -503070502:
                            if (javaName.equals("TLSv1.2")) {
                                return lmojexxdyd.TLS_1_2;
                            }
                            break;
                        case -503070501:
                            if (javaName.equals("TLSv1.3")) {
                                return lmojexxdyd.TLS_1_3;
                            }
                            break;
                    }
                } else if (javaName.equals("TLSv1")) {
                    return lmojexxdyd.TLS_1_0;
                }
            } else if (javaName.equals("SSLv3")) {
                return lmojexxdyd.SSL_3_0;
            }
            throw new IllegalArgumentException("Unexpected TLS version: " + javaName);
        }

        private iobyxmoadg() {
        }
    }

    lmojexxdyd(String str) {
        this.f63166zdlpuopuiu = str;
    }

    public final String wkgbmnqykc() {
        return this.f63166zdlpuopuiu;
    }
}
