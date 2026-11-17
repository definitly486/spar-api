package org.xbill.DNS;

import java.io.EOFException;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.time.Duration;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.BiConsumer;
import java.util.function.Function;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes3.dex */
abstract class ageimvtcrz extends skhdrjzrfn {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private static final am.iobyxmoadg f74208dxjokdxxww = am.zoijcleaow.dxjokdxxww(ageimvtcrz.class);

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private static final Queue f74207btonecajqb = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private static final Map f74209gtknphoqwx = new ConcurrentHashMap();

    /* JADX INFO: Access modifiers changed from: private */
    static class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final InetSocketAddress f74210iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final InetSocketAddress f74211zoijcleaow;

        public iobyxmoadg(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2) {
            this.f74210iobyxmoadg = inetSocketAddress;
            this.f74211zoijcleaow = inetSocketAddress2;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof iobyxmoadg)) {
                return false;
            }
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
            if (!iobyxmoadgVar.iobyxmoadg(this)) {
                return false;
            }
            InetSocketAddress inetSocketAddress = this.f74210iobyxmoadg;
            InetSocketAddress inetSocketAddress2 = iobyxmoadgVar.f74210iobyxmoadg;
            if (inetSocketAddress != null ? !inetSocketAddress.equals(inetSocketAddress2) : inetSocketAddress2 != null) {
                return false;
            }
            InetSocketAddress inetSocketAddress3 = this.f74211zoijcleaow;
            InetSocketAddress inetSocketAddress4 = iobyxmoadgVar.f74211zoijcleaow;
            return inetSocketAddress3 != null ? inetSocketAddress3.equals(inetSocketAddress4) : inetSocketAddress4 == null;
        }

        public int hashCode() {
            InetSocketAddress inetSocketAddress = this.f74210iobyxmoadg;
            int iHashCode = inetSocketAddress == null ? 43 : inetSocketAddress.hashCode();
            InetSocketAddress inetSocketAddress2 = this.f74211zoijcleaow;
            return ((iHashCode + 59) * 59) + (inetSocketAddress2 != null ? inetSocketAddress2.hashCode() : 43);
        }

        protected boolean iobyxmoadg(Object obj) {
            return obj instanceof iobyxmoadg;
        }
    }

    private static class ppxfxbqfkf {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final CompletableFuture f74212eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private boolean f74213gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final zfvoamnweg f74214iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final long f74215ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final SocketChannel f74216wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final byte[] f74217zoijcleaow;

        public ppxfxbqfkf(zfvoamnweg zfvoamnwegVar, byte[] bArr, long j13, SocketChannel socketChannel, CompletableFuture completableFuture) {
            this.f74214iobyxmoadg = zfvoamnwegVar;
            this.f74217zoijcleaow = bArr;
            this.f74215ppxfxbqfkf = j13;
            this.f74216wkgbmnqykc = socketChannel;
            this.f74212eablkybsjg = completableFuture;
        }

        void wkgbmnqykc() throws EOFException {
            if (this.f74213gxszxtbevo) {
                return;
            }
            skhdrjzrfn.draadjrbmk("TCP write: transaction id=" + this.f74214iobyxmoadg.ppxfxbqfkf().gxszxtbevo(), this.f74216wkgbmnqykc.socket().getLocalSocketAddress(), this.f74216wkgbmnqykc.socket().getRemoteSocketAddress(), this.f74217zoijcleaow);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this.f74217zoijcleaow.length + 2);
            byteBufferAllocate.put((byte) (this.f74217zoijcleaow.length >>> 8));
            byteBufferAllocate.put((byte) (this.f74217zoijcleaow.length & KotlinVersion.MAX_COMPONENT_VALUE));
            byteBufferAllocate.put(this.f74217zoijcleaow);
            byteBufferAllocate.flip();
            while (byteBufferAllocate.hasRemaining()) {
                long jWrite = this.f74216wkgbmnqykc.write(byteBufferAllocate);
                if (jWrite == 0) {
                    throw new EOFException("Insufficient room for the data in the underlying output buffer for transaction " + this.f74214iobyxmoadg.ppxfxbqfkf().gxszxtbevo());
                }
                if (jWrite < this.f74217zoijcleaow.length) {
                    throw new EOFException("Could not write all data for transaction " + this.f74214iobyxmoadg.ppxfxbqfkf().gxszxtbevo());
                }
            }
            this.f74213gxszxtbevo = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class zoijcleaow implements skhdrjzrfn.iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final SocketChannel f74219iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final Queue f74222zoijcleaow = new ConcurrentLinkedQueue();

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        ByteBuffer f74220ppxfxbqfkf = ByteBuffer.allocate(2);

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        ByteBuffer f74221wkgbmnqykc = ByteBuffer.allocate(65535);

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        int f74218eablkybsjg = 0;

        public zoijcleaow(SocketChannel socketChannel) {
            this.f74219iobyxmoadg = socketChannel;
        }

        private void eablkybsjg(SelectionKey selectionKey) {
            try {
                this.f74219iobyxmoadg.finishConnect();
                selectionKey.interestOps(4);
            } catch (IOException e13) {
                ppxfxbqfkf(e13);
            }
        }

        private void gxszxtbevo() {
            try {
                if (this.f74218eablkybsjg == 0) {
                    if (this.f74219iobyxmoadg.read(this.f74220ppxfxbqfkf) < 0) {
                        ppxfxbqfkf(new EOFException());
                        return;
                    } else if (this.f74220ppxfxbqfkf.position() == 2) {
                        int i13 = ((this.f74220ppxfxbqfkf.get(0) & 255) << 8) + (this.f74220ppxfxbqfkf.get(1) & 255);
                        this.f74220ppxfxbqfkf.flip();
                        this.f74221wkgbmnqykc.limit(i13);
                        this.f74218eablkybsjg = 1;
                    }
                }
                if (this.f74219iobyxmoadg.read(this.f74221wkgbmnqykc) < 0) {
                    ppxfxbqfkf(new EOFException());
                    return;
                }
                if (this.f74221wkgbmnqykc.hasRemaining()) {
                    return;
                }
                this.f74218eablkybsjg = 0;
                this.f74221wkgbmnqykc.flip();
                int iLimit = this.f74221wkgbmnqykc.limit();
                byte[] bArr = new byte[iLimit];
                System.arraycopy(this.f74221wkgbmnqykc.array(), this.f74221wkgbmnqykc.arrayOffset(), bArr, 0, this.f74221wkgbmnqykc.limit());
                if (iLimit < 2) {
                    skhdrjzrfn.draadjrbmk("TCP read: response too short for a valid reply, discarding", this.f74219iobyxmoadg.socket().getLocalSocketAddress(), this.f74219iobyxmoadg.socket().getRemoteSocketAddress(), bArr);
                    return;
                }
                int i14 = ((bArr[0] & 255) << 8) + (bArr[1] & 255);
                skhdrjzrfn.draadjrbmk("TCP read: transaction id=" + i14, this.f74219iobyxmoadg.socket().getLocalSocketAddress(), this.f74219iobyxmoadg.socket().getRemoteSocketAddress(), bArr);
                Iterator it = this.f74222zoijcleaow.iterator();
                while (it.hasNext()) {
                    ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) it.next();
                    if (i14 == ppxfxbqfkfVar.f74214iobyxmoadg.ppxfxbqfkf().gxszxtbevo()) {
                        ppxfxbqfkfVar.f74212eablkybsjg.complete(bArr);
                        it.remove();
                        return;
                    }
                }
                ageimvtcrz.f74208dxjokdxxww.kcexrzcfyt("Transaction for answer to id {} not found", Integer.valueOf(i14));
            } catch (IOException e13) {
                ppxfxbqfkf(e13);
            }
        }

        private void lqeggnwhkg(SelectionKey selectionKey) {
            Iterator it = this.f74222zoijcleaow.iterator();
            while (it.hasNext()) {
                ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) it.next();
                try {
                    ppxfxbqfkfVar.wkgbmnqykc();
                } catch (IOException e13) {
                    ppxfxbqfkfVar.f74212eablkybsjg.completeExceptionally(e13);
                    it.remove();
                }
            }
            selectionKey.interestOps(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ppxfxbqfkf(IOException iOException) {
            wkgbmnqykc(iOException);
            for (Map.Entry entry : ageimvtcrz.f74209gtknphoqwx.entrySet()) {
                if (entry.getValue() == this) {
                    ageimvtcrz.f74209gtknphoqwx.remove(entry.getKey());
                    try {
                        this.f74219iobyxmoadg.close();
                        return;
                    } catch (IOException e13) {
                        ageimvtcrz.f74208dxjokdxxww.btonecajqb("Failed to close channel l={}/r={}", ((iobyxmoadg) entry.getKey()).f74210iobyxmoadg, ((iobyxmoadg) entry.getKey()).f74211zoijcleaow, e13);
                        return;
                    }
                }
            }
        }

        @Override // org.xbill.DNS.skhdrjzrfn.iobyxmoadg
        public void iobyxmoadg(SelectionKey selectionKey) {
            if (selectionKey.isValid()) {
                if (selectionKey.isConnectable()) {
                    eablkybsjg(selectionKey);
                    return;
                }
                if (selectionKey.isWritable()) {
                    lqeggnwhkg(selectionKey);
                }
                if (selectionKey.isReadable()) {
                    gxszxtbevo();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void wkgbmnqykc(IOException iOException) {
            Iterator it = this.f74222zoijcleaow.iterator();
            while (it.hasNext()) {
                ((ppxfxbqfkf) it.next()).f74212eablkybsjg.completeExceptionally(iOException);
                it.remove();
            }
        }
    }

    static {
        skhdrjzrfn.btonecajqb(new Runnable() { // from class: org.xbill.DNS.lxfrhoxuzk
            @Override // java.lang.Runnable
            public final void run() {
                ageimvtcrz.cqumvgiudr();
            }
        }, true);
        skhdrjzrfn.gtknphoqwx(new Runnable() { // from class: org.xbill.DNS.wizcaqwiak
            @Override // java.lang.Runnable
            public final void run() {
                ageimvtcrz.zdlpuopuiu();
            }
        }, true);
        skhdrjzrfn.dxjokdxxww(new Runnable() { // from class: org.xbill.DNS.hszhottldk
            @Override // java.lang.Runnable
            public final void run() {
                ageimvtcrz.yggfygwlhe();
            }
        }, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void cqumvgiudr() {
        while (true) {
            Queue queue = f74207btonecajqb;
            if (queue.isEmpty()) {
                return;
            }
            zoijcleaow zoijcleaowVar = (zoijcleaow) queue.remove();
            try {
                Selector selectorNufgyqmvbu = skhdrjzrfn.nufgyqmvbu();
                if (zoijcleaowVar.f74219iobyxmoadg.isConnected()) {
                    zoijcleaowVar.f74219iobyxmoadg.keyFor(selectorNufgyqmvbu).interestOps(4);
                } else {
                    zoijcleaowVar.f74219iobyxmoadg.register(selectorNufgyqmvbu, 8, zoijcleaowVar);
                }
            } catch (IOException e13) {
                zoijcleaowVar.ppxfxbqfkf(e13);
            }
        }
    }

    static CompletableFuture esjtqupxsv(final InetSocketAddress inetSocketAddress, final InetSocketAddress inetSocketAddress2, zfvoamnweg zfvoamnwegVar, byte[] bArr, Duration duration) {
        final CompletableFuture completableFuture = new CompletableFuture();
        try {
            Selector selectorNufgyqmvbu = skhdrjzrfn.nufgyqmvbu();
            long jNanoTime = System.nanoTime() + duration.toNanos();
            zoijcleaow zoijcleaowVar = (zoijcleaow) f74209gtknphoqwx.computeIfAbsent(new iobyxmoadg(inetSocketAddress, inetSocketAddress2), new Function() { // from class: org.xbill.DNS.igdgnonuha
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ageimvtcrz.iwizpuwonk(inetSocketAddress, inetSocketAddress2, completableFuture, (ageimvtcrz.iobyxmoadg) obj);
                }
            });
            if (zoijcleaowVar != null) {
                f74208dxjokdxxww.rgvfuqvkyq("Creating transaction for id {} ({}/{})", Integer.valueOf(zfvoamnwegVar.ppxfxbqfkf().gxszxtbevo()), zfvoamnwegVar.eablkybsjg().cqumvgiudr(), x2.wkgbmnqykc(zfvoamnwegVar.eablkybsjg().zynmafqrjb()));
                zoijcleaowVar.f74222zoijcleaow.add(new ppxfxbqfkf(zfvoamnwegVar, bArr, jNanoTime, zoijcleaowVar.f74219iobyxmoadg, completableFuture));
                f74207btonecajqb.add(zoijcleaowVar);
                selectorNufgyqmvbu.wakeup();
            }
        } catch (IOException e13) {
            completableFuture.completeExceptionally(e13);
        }
        return completableFuture;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ zoijcleaow iwizpuwonk(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, CompletableFuture completableFuture, iobyxmoadg iobyxmoadgVar) {
        SocketChannel socketChannelOpen;
        f74208dxjokdxxww.lqeggnwhkg("Opening async channel for l={}/r={}", inetSocketAddress, inetSocketAddress2);
        try {
            socketChannelOpen = SocketChannel.open();
            try {
                socketChannelOpen.configureBlocking(false);
                if (inetSocketAddress != null) {
                    socketChannelOpen.bind((SocketAddress) inetSocketAddress);
                }
                socketChannelOpen.connect(inetSocketAddress2);
                return new zoijcleaow(socketChannelOpen);
            } catch (IOException e13) {
                e = e13;
                if (socketChannelOpen != null) {
                    try {
                        socketChannelOpen.close();
                    } catch (IOException unused) {
                    }
                }
                completableFuture.completeExceptionally(e);
                return null;
            }
        } catch (IOException e14) {
            e = e14;
            socketChannelOpen = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void yggfygwlhe() {
        f74207btonecajqb.clear();
        final EOFException eOFException = new EOFException("Client is closing");
        Map map = f74209gtknphoqwx;
        map.forEach(new BiConsumer() { // from class: org.xbill.DNS.fiwbwshyhd
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((ageimvtcrz.zoijcleaow) obj2).wkgbmnqykc(eOFException);
            }
        });
        map.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zdlpuopuiu() {
        Iterator it = f74209gtknphoqwx.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((zoijcleaow) it.next()).f74222zoijcleaow.iterator();
            while (it2.hasNext()) {
                ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) it2.next();
                if (ppxfxbqfkfVar.f74215ppxfxbqfkf - System.nanoTime() < 0) {
                    ppxfxbqfkfVar.f74212eablkybsjg.completeExceptionally(new SocketTimeoutException("Query timed out"));
                    it2.remove();
                }
            }
        }
    }
}
