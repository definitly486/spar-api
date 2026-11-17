package modern.payments.ecomAndroid.util.interceptor.impl;

import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000bJ.\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t¨\u0006\u0018"}, d2 = {"Lmodern/payments/ecomAndroid/util/interceptor/impl/HostConfig;", "", "protocol", "", "host", "port", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getHost", "()Ljava/lang/String;", "getPort", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getProtocol", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lmodern/payments/ecomAndroid/util/interceptor/impl/HostConfig;", "equals", "", "other", "hashCode", "toString", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class HostConfig {
    private final String host;
    private final Integer port;
    private final String protocol;

    public HostConfig(String protocol, String host, Integer num) {
        zdlpuopuiu.btonecajqb(protocol, "protocol");
        zdlpuopuiu.btonecajqb(host, "host");
        this.protocol = protocol;
        this.host = host;
        this.port = num;
    }

    public static /* synthetic */ HostConfig copy$default(HostConfig hostConfig, String str, String str2, Integer num, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = hostConfig.protocol;
        }
        if ((i13 & 2) != 0) {
            str2 = hostConfig.host;
        }
        if ((i13 & 4) != 0) {
            num = hostConfig.port;
        }
        return hostConfig.copy(str, str2, num);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getProtocol() {
        return this.protocol;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHost() {
        return this.host;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getPort() {
        return this.port;
    }

    public final HostConfig copy(String protocol, String host, Integer port) {
        zdlpuopuiu.btonecajqb(protocol, "protocol");
        zdlpuopuiu.btonecajqb(host, "host");
        return new HostConfig(protocol, host, port);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HostConfig)) {
            return false;
        }
        HostConfig hostConfig = (HostConfig) other;
        return zdlpuopuiu.eablkybsjg(this.protocol, hostConfig.protocol) && zdlpuopuiu.eablkybsjg(this.host, hostConfig.host) && zdlpuopuiu.eablkybsjg(this.port, hostConfig.port);
    }

    public final String getHost() {
        return this.host;
    }

    public final Integer getPort() {
        return this.port;
    }

    public final String getProtocol() {
        return this.protocol;
    }

    public int hashCode() {
        int iHashCode = ((this.protocol.hashCode() * 31) + this.host.hashCode()) * 31;
        Integer num = this.port;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "HostConfig(protocol=" + this.protocol + ", host=" + this.host + ", port=" + this.port + ')';
    }

    public /* synthetic */ HostConfig(String str, String str2, Integer num, int i13, gtknphoqwx gtknphoqwxVar) {
        this(str, str2, (i13 & 4) != 0 ? null : num);
    }
}
