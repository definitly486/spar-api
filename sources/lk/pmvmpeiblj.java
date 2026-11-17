package lk;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public enum pmvmpeiblj {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic"),
    HTTP_3("h3");


    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final iobyxmoadg f63187yggfygwlhe = new iobyxmoadg(null);

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f63189zdlpuopuiu;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final pmvmpeiblj iobyxmoadg(String protocol) throws IOException {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(protocol, "protocol");
            pmvmpeiblj pmvmpeibljVar = pmvmpeiblj.HTTP_1_0;
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(protocol, pmvmpeibljVar.f63189zdlpuopuiu)) {
                pmvmpeibljVar = pmvmpeiblj.HTTP_1_1;
                if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(protocol, pmvmpeibljVar.f63189zdlpuopuiu)) {
                    pmvmpeibljVar = pmvmpeiblj.H2_PRIOR_KNOWLEDGE;
                    if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(protocol, pmvmpeibljVar.f63189zdlpuopuiu)) {
                        pmvmpeibljVar = pmvmpeiblj.HTTP_2;
                        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(protocol, pmvmpeibljVar.f63189zdlpuopuiu)) {
                            pmvmpeibljVar = pmvmpeiblj.SPDY_3;
                            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(protocol, pmvmpeibljVar.f63189zdlpuopuiu)) {
                                pmvmpeibljVar = pmvmpeiblj.QUIC;
                                if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(protocol, pmvmpeibljVar.f63189zdlpuopuiu)) {
                                    pmvmpeibljVar = pmvmpeiblj.HTTP_3;
                                    if (!mj.kcexrzcfyt.stevsuqkhv(protocol, pmvmpeibljVar.f63189zdlpuopuiu, false, 2, null)) {
                                        throw new IOException("Unexpected protocol: " + protocol);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return pmvmpeibljVar;
        }

        private iobyxmoadg() {
        }
    }

    pmvmpeiblj(String str) {
        this.f63189zdlpuopuiu = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f63189zdlpuopuiu;
    }
}
