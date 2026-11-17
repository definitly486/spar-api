package org.xbill.DNS;

import java.io.EOFException;
import java.io.IOException;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes3.dex */
class f0 implements AutoCloseable {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final SelectionKey f74358jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final Duration f74359yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final long f74360zdlpuopuiu = System.nanoTime();

    f0(Duration duration) throws Throwable {
        Selector selectorOpen;
        this.f74359yggfygwlhe = duration;
        SocketChannel socketChannelOpen = SocketChannel.open();
        try {
            selectorOpen = Selector.open();
            try {
                socketChannelOpen.configureBlocking(false);
                this.f74358jyumaefscl = socketChannelOpen.register(selectorOpen, 1);
            } catch (Throwable th2) {
                th = th2;
                if (selectorOpen != null) {
                    selectorOpen.close();
                }
                socketChannelOpen.close();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            selectorOpen = null;
        }
    }

    private byte[] iobyxmoadg(int i13) {
        SocketChannel socketChannel = (SocketChannel) this.f74358jyumaefscl.channel();
        byte[] bArr = new byte[i13];
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        this.f74358jyumaefscl.interestOps(1);
        int i14 = 0;
        while (i14 < i13) {
            try {
                if (this.f74358jyumaefscl.isReadable()) {
                    long j13 = socketChannel.read(byteBufferWrap);
                    if (j13 < 0) {
                        throw new EOFException();
                    }
                    i14 += (int) j13;
                    if (i14 < i13 && System.nanoTime() - this.f74360zdlpuopuiu >= this.f74359yggfygwlhe.toNanos()) {
                        throw new SocketTimeoutException();
                    }
                } else {
                    lqeggnwhkg(this.f74358jyumaefscl);
                }
            } catch (Throwable th2) {
                if (this.f74358jyumaefscl.isValid()) {
                    this.f74358jyumaefscl.interestOps(0);
                }
                throw th2;
            }
        }
        if (this.f74358jyumaefscl.isValid()) {
            this.f74358jyumaefscl.interestOps(0);
        }
        return bArr;
    }

    private void lqeggnwhkg(SelectionKey selectionKey) throws IOException {
        int iSelectNow;
        long millis = this.f74359yggfygwlhe.minus(System.nanoTime() - this.f74360zdlpuopuiu, ChronoUnit.NANOS).toMillis();
        if (millis > 0) {
            iSelectNow = selectionKey.selector().select(millis);
        } else {
            iSelectNow = millis == 0 ? selectionKey.selector().selectNow() : 0;
        }
        if (iSelectNow == 0) {
            throw new SocketTimeoutException();
        }
    }

    void btonecajqb(byte[] bArr) {
        SocketChannel socketChannel = (SocketChannel) this.f74358jyumaefscl.channel();
        skhdrjzrfn.draadjrbmk("TCP write", socketChannel.socket().getLocalSocketAddress(), socketChannel.socket().getRemoteSocketAddress(), bArr);
        ByteBuffer[] byteBufferArr = {ByteBuffer.wrap(new byte[]{(byte) (bArr.length >>> 8), (byte) (bArr.length & KotlinVersion.MAX_COMPONENT_VALUE)}), ByteBuffer.wrap(bArr)};
        this.f74358jyumaefscl.interestOps(4);
        int i13 = 0;
        while (i13 < bArr.length + 2) {
            try {
                if (this.f74358jyumaefscl.isWritable()) {
                    long jWrite = socketChannel.write(byteBufferArr);
                    if (jWrite < 0) {
                        throw new EOFException();
                    }
                    i13 += (int) jWrite;
                    if (i13 < bArr.length + 2 && System.nanoTime() - this.f74360zdlpuopuiu >= this.f74359yggfygwlhe.toNanos()) {
                        throw new SocketTimeoutException();
                    }
                } else {
                    lqeggnwhkg(this.f74358jyumaefscl);
                }
            } catch (Throwable th2) {
                if (this.f74358jyumaefscl.isValid()) {
                    this.f74358jyumaefscl.interestOps(0);
                }
                throw th2;
            }
        }
        if (this.f74358jyumaefscl.isValid()) {
            this.f74358jyumaefscl.interestOps(0);
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() throws IOException {
        this.f74358jyumaefscl.selector().close();
        this.f74358jyumaefscl.channel().close();
    }

    byte[] dxjokdxxww() {
        byte[] bArrIobyxmoadg = iobyxmoadg(2);
        byte[] bArrIobyxmoadg2 = iobyxmoadg(((bArrIobyxmoadg[0] & 255) << 8) + (bArrIobyxmoadg[1] & 255));
        SocketChannel socketChannel = (SocketChannel) this.f74358jyumaefscl.channel();
        skhdrjzrfn.draadjrbmk("TCP read", socketChannel.socket().getLocalSocketAddress(), socketChannel.socket().getRemoteSocketAddress(), bArrIobyxmoadg2);
        return bArrIobyxmoadg2;
    }

    void nufgyqmvbu(SocketAddress socketAddress) {
        SocketChannel socketChannel = (SocketChannel) this.f74358jyumaefscl.channel();
        if (socketChannel.connect(socketAddress)) {
            return;
        }
        this.f74358jyumaefscl.interestOps(8);
        while (true) {
            try {
                if (socketChannel.finishConnect()) {
                    break;
                } else if (!this.f74358jyumaefscl.isConnectable()) {
                    lqeggnwhkg(this.f74358jyumaefscl);
                }
            } finally {
                if (this.f74358jyumaefscl.isValid()) {
                    this.f74358jyumaefscl.interestOps(0);
                }
            }
        }
    }

    void wkgbmnqykc(SocketAddress socketAddress) throws IOException {
        ((SocketChannel) this.f74358jyumaefscl.channel()).socket().bind(socketAddress);
    }
}
