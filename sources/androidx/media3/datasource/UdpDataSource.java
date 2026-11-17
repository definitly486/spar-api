package androidx.media3.datasource;

import android.net.Uri;
import b3.lqeggnwhkg;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class UdpDataSource extends b3.iobyxmoadg {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private MulticastSocket f9879btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private boolean f9880draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private DatagramSocket f9881dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final int f9882eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private InetAddress f9883gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final byte[] f9884gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final DatagramPacket f9885lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private Uri f9886nufgyqmvbu;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private int f9887wflxmlrfwp;

    public static final class UdpDataSourceException extends DataSourceException {
        public UdpDataSourceException(Throwable th2, int i13) {
            super(th2, i13);
        }
    }

    public UdpDataSource() {
        this(2000);
    }

    @Override // androidx.media3.datasource.iobyxmoadg
    public Uri agtfadlqog() {
        return this.f9886nufgyqmvbu;
    }

    @Override // androidx.media3.datasource.iobyxmoadg
    public void close() {
        this.f9886nufgyqmvbu = null;
        MulticastSocket multicastSocket = this.f9879btonecajqb;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup((InetAddress) y2.iobyxmoadg.eablkybsjg(this.f9883gtknphoqwx));
            } catch (IOException unused) {
            }
            this.f9879btonecajqb = null;
        }
        DatagramSocket datagramSocket = this.f9881dxjokdxxww;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f9881dxjokdxxww = null;
        }
        this.f9883gtknphoqwx = null;
        this.f9887wflxmlrfwp = 0;
        if (this.f9880draadjrbmk) {
            this.f9880draadjrbmk = false;
            vdvldrhtss();
        }
    }

    @Override // androidx.media3.datasource.iobyxmoadg
    public long iobyxmoadg(lqeggnwhkg lqeggnwhkgVar) throws UdpDataSourceException {
        Uri uri = lqeggnwhkgVar.f15057iobyxmoadg;
        this.f9886nufgyqmvbu = uri;
        String str = (String) y2.iobyxmoadg.eablkybsjg(uri.getHost());
        int port = this.f9886nufgyqmvbu.getPort();
        oxmwwwfdhm(lqeggnwhkgVar);
        try {
            this.f9883gtknphoqwx = InetAddress.getByName(str);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f9883gtknphoqwx, port);
            if (this.f9883gtknphoqwx.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f9879btonecajqb = multicastSocket;
                multicastSocket.joinGroup(this.f9883gtknphoqwx);
                this.f9881dxjokdxxww = this.f9879btonecajqb;
            } else {
                this.f9881dxjokdxxww = new DatagramSocket(inetSocketAddress);
            }
            this.f9881dxjokdxxww.setSoTimeout(this.f9882eablkybsjg);
            this.f9880draadjrbmk = true;
            kcexrzcfyt(lqeggnwhkgVar);
            return -1L;
        } catch (IOException e13) {
            throw new UdpDataSourceException(e13, 2001);
        } catch (SecurityException e14) {
            throw new UdpDataSourceException(e14, 2006);
        }
    }

    @Override // v2.btonecajqb
    public int zoijcleaow(byte[] bArr, int i13, int i14) throws UdpDataSourceException {
        if (i14 == 0) {
            return 0;
        }
        if (this.f9887wflxmlrfwp == 0) {
            try {
                ((DatagramSocket) y2.iobyxmoadg.eablkybsjg(this.f9881dxjokdxxww)).receive(this.f9885lqeggnwhkg);
                int length = this.f9885lqeggnwhkg.getLength();
                this.f9887wflxmlrfwp = length;
                rgvfuqvkyq(length);
            } catch (SocketTimeoutException e13) {
                throw new UdpDataSourceException(e13, 2002);
            } catch (IOException e14) {
                throw new UdpDataSourceException(e14, 2001);
            }
        }
        int length2 = this.f9885lqeggnwhkg.getLength();
        int i15 = this.f9887wflxmlrfwp;
        int iMin = Math.min(i15, i14);
        System.arraycopy(this.f9884gxszxtbevo, length2 - i15, bArr, i13, iMin);
        this.f9887wflxmlrfwp -= iMin;
        return iMin;
    }

    public UdpDataSource(int i13) {
        this(i13, 8000);
    }

    public UdpDataSource(int i13, int i14) {
        super(true);
        this.f9882eablkybsjg = i14;
        byte[] bArr = new byte[i13];
        this.f9884gxszxtbevo = bArr;
        this.f9885lqeggnwhkg = new DatagramPacket(bArr, 0, i13);
    }
}
