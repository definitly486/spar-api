package org.xbill.DNS;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import modern.payments.ecomAndroid.util.view.CardDateFormatTextWatcher;

/* JADX INFO: loaded from: classes3.dex */
public class dsvhmnatus implements f {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final am.iobyxmoadg f74302gxszxtbevo = am.zoijcleaow.dxjokdxxww(dsvhmnatus.class);

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public static final Duration f74303lqeggnwhkg = Duration.ofSeconds(10);

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public static final Duration f74304nufgyqmvbu = Duration.ofSeconds(5);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private Duration f74305eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f74306iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private boolean f74307ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f74308wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final AtomicInteger f74309zoijcleaow;

    /* JADX INFO: Access modifiers changed from: private */
    static class iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private List f74310eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private int f74311gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final zfvoamnweg f74312iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final int f74313ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final long f74314wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int[] f74315zoijcleaow;

        iobyxmoadg(dsvhmnatus dsvhmnatusVar, zfvoamnweg zfvoamnwegVar) {
            this.f74310eablkybsjg = new ArrayList(dsvhmnatusVar.f74306iobyxmoadg);
            this.f74314wkgbmnqykc = System.nanoTime() + dsvhmnatusVar.f74305eablkybsjg.toNanos();
            if (dsvhmnatusVar.f74307ppxfxbqfkf) {
                int iUpdateAndGet = dsvhmnatusVar.f74309zoijcleaow.updateAndGet(new IntUnaryOperator() { // from class: org.xbill.DNS.pkzmftpjix
                    @Override // java.util.function.IntUnaryOperator
                    public final int applyAsInt(int i13) {
                        return this.f74497iobyxmoadg.btonecajqb(i13);
                    }
                });
                if (iUpdateAndGet > 0) {
                    ArrayList arrayList = new ArrayList(this.f74310eablkybsjg.size());
                    for (int i13 = 0; i13 < this.f74310eablkybsjg.size(); i13++) {
                        arrayList.add(this.f74310eablkybsjg.get((i13 + iUpdateAndGet) % this.f74310eablkybsjg.size()));
                    }
                    this.f74310eablkybsjg = arrayList;
                }
            } else {
                this.f74310eablkybsjg = (List) this.f74310eablkybsjg.stream().sorted(Comparator.comparingInt(new ToIntFunction() { // from class: org.xbill.DNS.hcddaimhww
                    @Override // java.util.function.ToIntFunction
                    public final int applyAsInt(Object obj) {
                        return dsvhmnatus.iobyxmoadg.gtknphoqwx((dsvhmnatus.zoijcleaow) obj);
                    }
                })).collect(Collectors.toList());
            }
            this.f74315zoijcleaow = new int[this.f74310eablkybsjg.size()];
            this.f74313ppxfxbqfkf = dsvhmnatusVar.f74308wkgbmnqykc;
            this.f74312iobyxmoadg = zfvoamnwegVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public CompletionStage agtfadlqog(final Executor executor) {
            return wflxmlrfwp(executor).handle(new BiFunction() { // from class: org.xbill.DNS.jpowsppfya
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    return this.f74428iobyxmoadg.draadjrbmk(executor, (zfvoamnweg) obj, (Throwable) obj2);
                }
            }).thenCompose(Function.identity());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ int btonecajqb(int i13) {
            return (i13 + 1) % this.f74310eablkybsjg.size();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int dxjokdxxww(int i13) {
            if (i13 > 0) {
                return (int) Math.log(i13);
            }
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int gtknphoqwx(zoijcleaow zoijcleaowVar) {
            return zoijcleaowVar.f74317zoijcleaow.get();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public CompletionStage nufgyqmvbu(zfvoamnweg zfvoamnwegVar, Throwable th2, final Executor executor) {
            AtomicInteger atomicInteger = ((zoijcleaow) this.f74310eablkybsjg.get(this.f74311gxszxtbevo)).f74317zoijcleaow;
            if (th2 == null) {
                atomicInteger.updateAndGet(new IntUnaryOperator() { // from class: org.xbill.DNS.cllcsxoeiz
                    @Override // java.util.function.IntUnaryOperator
                    public final int applyAsInt(int i13) {
                        return dsvhmnatus.iobyxmoadg.dxjokdxxww(i13);
                    }
                });
                return CompletableFuture.completedFuture(zfvoamnwegVar);
            }
            dsvhmnatus.f74302gxszxtbevo.agtfadlqog("Failed to resolve {}/{}, id={} with resolver {} ({}) on attempt {} of {}, reason={}", this.f74312iobyxmoadg.eablkybsjg().cqumvgiudr(), x2.wkgbmnqykc(this.f74312iobyxmoadg.eablkybsjg().zynmafqrjb()), Integer.valueOf(this.f74312iobyxmoadg.ppxfxbqfkf().gxszxtbevo()), Integer.valueOf(this.f74311gxszxtbevo), ((zoijcleaow) this.f74310eablkybsjg.get(this.f74311gxszxtbevo)).f74316iobyxmoadg, Integer.valueOf(this.f74315zoijcleaow[this.f74311gxszxtbevo]), Integer.valueOf(this.f74313ppxfxbqfkf), th2.getMessage());
            atomicInteger.incrementAndGet();
            if (this.f74314wkgbmnqykc - System.nanoTime() >= 0) {
                int size = (this.f74311gxszxtbevo + 1) % this.f74310eablkybsjg.size();
                this.f74311gxszxtbevo = size;
                if (this.f74315zoijcleaow[size] < this.f74313ppxfxbqfkf) {
                    return wflxmlrfwp(executor).handle(new BiFunction() { // from class: org.xbill.DNS.hkdspvbjdz
                        @Override // java.util.function.BiFunction
                        public final Object apply(Object obj, Object obj2) {
                            return this.f74389iobyxmoadg.nufgyqmvbu(executor, (zfvoamnweg) obj, (Throwable) obj2);
                        }
                    }).thenCompose(Function.identity());
                }
                CompletableFuture completableFuture = new CompletableFuture();
                completableFuture.completeExceptionally(th2);
                return completableFuture;
            }
            CompletableFuture completableFuture2 = new CompletableFuture();
            completableFuture2.completeExceptionally(new IOException("Timed out while trying to resolve " + this.f74312iobyxmoadg.eablkybsjg().cqumvgiudr() + CardDateFormatTextWatcher.DIVIDER_CHARACTER + x2.wkgbmnqykc(this.f74312iobyxmoadg.eablkybsjg().f74322yggfygwlhe) + ", id=" + this.f74312iobyxmoadg.ppxfxbqfkf().gxszxtbevo()));
            return completableFuture2;
        }

        private CompletionStage wflxmlrfwp(Executor executor) {
            zoijcleaow zoijcleaowVar = (zoijcleaow) this.f74310eablkybsjg.get(this.f74311gxszxtbevo);
            dsvhmnatus.f74302gxszxtbevo.agtfadlqog("Sending {}/{}, id={} to resolver {} ({}), attempt {} of {}", this.f74312iobyxmoadg.eablkybsjg().cqumvgiudr(), x2.wkgbmnqykc(this.f74312iobyxmoadg.eablkybsjg().zynmafqrjb()), Integer.valueOf(this.f74312iobyxmoadg.ppxfxbqfkf().gxszxtbevo()), Integer.valueOf(this.f74311gxszxtbevo), zoijcleaowVar.f74316iobyxmoadg, Integer.valueOf(this.f74315zoijcleaow[this.f74311gxszxtbevo] + 1), Integer.valueOf(this.f74313ppxfxbqfkf));
            int[] iArr = this.f74315zoijcleaow;
            int i13 = this.f74311gxszxtbevo;
            iArr[i13] = iArr[i13] + 1;
            return zoijcleaowVar.f74316iobyxmoadg.wkgbmnqykc(this.f74312iobyxmoadg, executor);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final f f74316iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AtomicInteger f74317zoijcleaow;

        public zoijcleaow(f fVar, AtomicInteger atomicInteger) {
            this.f74316iobyxmoadg = fVar;
            this.f74317zoijcleaow = atomicInteger;
        }

        public String toString() {
            return this.f74316iobyxmoadg.toString();
        }

        zoijcleaow(f fVar) {
            this(fVar, new AtomicInteger(0));
        }
    }

    public dsvhmnatus() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f74306iobyxmoadg = copyOnWriteArrayList;
        this.f74309zoijcleaow = new AtomicInteger();
        this.f74308wkgbmnqykc = 3;
        this.f74305eablkybsjg = f74303lqeggnwhkg;
        copyOnWriteArrayList.addAll((Collection) g.zoijcleaow().lqeggnwhkg().stream().map(new Function() { // from class: org.xbill.DNS.ylkuphrtab
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return dsvhmnatus.wflxmlrfwp((InetSocketAddress) obj);
            }
        }).collect(Collectors.toList()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ zoijcleaow wflxmlrfwp(InetSocketAddress inetSocketAddress) {
        c0 c0Var = new c0(inetSocketAddress);
        c0Var.iobyxmoadg(f74304nufgyqmvbu);
        return new zoijcleaow(c0Var);
    }

    @Override // org.xbill.DNS.f
    public CompletionStage eablkybsjg(zfvoamnweg zfvoamnwegVar) {
        return wkgbmnqykc(zfvoamnwegVar, ForkJoinPool.commonPool());
    }

    @Override // org.xbill.DNS.f
    public void iobyxmoadg(Duration duration) {
        this.f74305eablkybsjg = duration;
    }

    public String toString() {
        return "ExtendedResolver of " + this.f74306iobyxmoadg;
    }

    @Override // org.xbill.DNS.f
    public CompletionStage wkgbmnqykc(zfvoamnweg zfvoamnwegVar, Executor executor) {
        return new iobyxmoadg(this, zfvoamnwegVar).agtfadlqog(executor);
    }

    @Override // org.xbill.DNS.f
    public Duration zoijcleaow() {
        return this.f74305eablkybsjg;
    }

    public dsvhmnatus(Iterable iterable) {
        this.f74306iobyxmoadg = new CopyOnWriteArrayList();
        this.f74309zoijcleaow = new AtomicInteger();
        this.f74308wkgbmnqykc = 3;
        this.f74305eablkybsjg = f74303lqeggnwhkg;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.f74306iobyxmoadg.add(new zoijcleaow((f) it.next()));
        }
    }
}
