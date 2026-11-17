package mj;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
final class dxjokdxxww implements Iterator, ug.iobyxmoadg {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static final iobyxmoadg f67251esjtqupxsv = new iobyxmoadg(null);

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private int f67252cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private int f67253iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private int f67254jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private int f67255yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final CharSequence f67256zdlpuopuiu;

    private static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public dxjokdxxww(CharSequence string) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(string, "string");
        this.f67256zdlpuopuiu = string;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i13;
        int i14;
        int i15 = this.f67255yggfygwlhe;
        if (i15 != 0) {
            return i15 == 1;
        }
        if (this.f67252cqumvgiudr < 0) {
            this.f67255yggfygwlhe = 2;
            return false;
        }
        int length = this.f67256zdlpuopuiu.length();
        int length2 = this.f67256zdlpuopuiu.length();
        for (int i16 = this.f67254jyumaefscl; i16 < length2; i16++) {
            char cCharAt = this.f67256zdlpuopuiu.charAt(i16);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i13 = (cCharAt == '\r' && (i14 = i16 + 1) < this.f67256zdlpuopuiu.length() && this.f67256zdlpuopuiu.charAt(i14) == '\n') ? 2 : 1;
                length = i16;
                this.f67255yggfygwlhe = 1;
                this.f67252cqumvgiudr = i13;
                this.f67253iwizpuwonk = length;
                return true;
            }
        }
        i13 = -1;
        this.f67255yggfygwlhe = 1;
        this.f67252cqumvgiudr = i13;
        this.f67253iwizpuwonk = length;
        return true;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f67255yggfygwlhe = 0;
        int i13 = this.f67253iwizpuwonk;
        int i14 = this.f67254jyumaefscl;
        this.f67254jyumaefscl = this.f67252cqumvgiudr + i13;
        return this.f67256zdlpuopuiu.subSequence(i14, i13).toString();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
