package dk;

import java.util.Iterator;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class btonecajqb {

    public static final class iobyxmoadg implements Iterator, ug.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gxszxtbevo f29059yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private int f29060zdlpuopuiu;

        iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            this.f29059yggfygwlhe = gxszxtbevoVar;
            this.f29060zdlpuopuiu = gxszxtbevoVar.wkgbmnqykc();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f29060zdlpuopuiu > 0;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public gxszxtbevo next() {
            gxszxtbevo gxszxtbevoVar = this.f29059yggfygwlhe;
            int iWkgbmnqykc = gxszxtbevoVar.wkgbmnqykc();
            int i13 = this.f29060zdlpuopuiu;
            this.f29060zdlpuopuiu = i13 - 1;
            return gxszxtbevoVar.lqeggnwhkg(iWkgbmnqykc - i13);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final class ppxfxbqfkf implements Iterable, ug.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gxszxtbevo f29061zdlpuopuiu;

        public ppxfxbqfkf(gxszxtbevo gxszxtbevoVar) {
            this.f29061zdlpuopuiu = gxszxtbevoVar;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new iobyxmoadg(this.f29061zdlpuopuiu);
        }
    }

    public static final class wkgbmnqykc implements Iterable, ug.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gxszxtbevo f29062zdlpuopuiu;

        public wkgbmnqykc(gxszxtbevo gxszxtbevoVar) {
            this.f29062zdlpuopuiu = gxszxtbevoVar;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new zoijcleaow(this.f29062zdlpuopuiu);
        }
    }

    public static final class zoijcleaow implements Iterator, ug.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gxszxtbevo f29063yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private int f29064zdlpuopuiu;

        zoijcleaow(gxszxtbevo gxszxtbevoVar) {
            this.f29063yggfygwlhe = gxszxtbevoVar;
            this.f29064zdlpuopuiu = gxszxtbevoVar.wkgbmnqykc();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f29064zdlpuopuiu > 0;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public String next() {
            gxszxtbevo gxszxtbevoVar = this.f29063yggfygwlhe;
            int iWkgbmnqykc = gxszxtbevoVar.wkgbmnqykc();
            int i13 = this.f29064zdlpuopuiu;
            this.f29064zdlpuopuiu = i13 - 1;
            return gxszxtbevoVar.eablkybsjg(iWkgbmnqykc - i13);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final Iterable iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
        zdlpuopuiu.btonecajqb(gxszxtbevoVar, "<this>");
        return new ppxfxbqfkf(gxszxtbevoVar);
    }

    public static final Iterable zoijcleaow(gxszxtbevo gxszxtbevoVar) {
        zdlpuopuiu.btonecajqb(gxszxtbevoVar, "<this>");
        return new wkgbmnqykc(gxszxtbevoVar);
    }
}
