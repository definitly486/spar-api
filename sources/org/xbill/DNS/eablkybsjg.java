package org.xbill.DNS;

import java.net.InetAddress;
import java.net.UnknownHostException;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes3.dex */
public class eablkybsjg extends e {

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private int f74349lereixgezr;

    eablkybsjg() {
    }

    private static byte[] crxdokpmqz(int i13) {
        return new byte[]{(byte) ((i13 >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE), (byte) ((i13 >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE), (byte) ((i13 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE), (byte) (i13 & KotlinVersion.MAX_COMPONENT_VALUE)};
    }

    private static int ulzqkzuiru(byte[] bArr) {
        return (bArr[3] & 255) | ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
    }

    @Override // org.xbill.DNS.e
    protected String hcddaimhww() {
        return gxszxtbevo.btonecajqb(crxdokpmqz(this.f74349lereixgezr));
    }

    @Override // org.xbill.DNS.e
    protected void jpowsppfya(jyumaefscl jyumaefsclVar, agtfadlqog agtfadlqogVar, boolean z13) {
        jyumaefsclVar.gtknphoqwx(((long) this.f74349lereixgezr) & 4294967295L);
    }

    @Override // org.xbill.DNS.e
    protected void pkzmftpjix(zdlpuopuiu zdlpuopuiuVar) {
        this.f74349lereixgezr = ulzqkzuiru(zdlpuopuiuVar.gxszxtbevo(4));
    }

    public InetAddress sopmlzcsov() {
        try {
            auzgnhcxok auzgnhcxokVar = this.f74323zdlpuopuiu;
            return auzgnhcxokVar == null ? InetAddress.getByAddress(crxdokpmqz(this.f74349lereixgezr)) : InetAddress.getByAddress(auzgnhcxokVar.toString(), crxdokpmqz(this.f74349lereixgezr));
        } catch (UnknownHostException unused) {
            return null;
        }
    }

    public eablkybsjg(auzgnhcxok auzgnhcxokVar, int i13, long j13, InetAddress inetAddress) {
        super(auzgnhcxokVar, 1, i13, j13);
        if (gxszxtbevo.ppxfxbqfkf(inetAddress) != 1) {
            throw new IllegalArgumentException("invalid IPv4 address");
        }
        this.f74349lereixgezr = ulzqkzuiru(inetAddress.getAddress());
    }
}
