package k0;

import java.text.CharacterIterator;

/* JADX INFO: loaded from: classes.dex */
public final class cdpycssgdh implements CharacterIterator {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private int f53296iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final int f53297jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final int f53298yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final CharSequence f53299zdlpuopuiu;

    public cdpycssgdh(CharSequence charSequence, int i13, int i14) {
        this.f53299zdlpuopuiu = charSequence;
        this.f53298yggfygwlhe = i13;
        this.f53297jyumaefscl = i14;
        this.f53296iwizpuwonk = i13;
    }

    @Override // java.text.CharacterIterator
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public char current() {
        int i13 = this.f53296iwizpuwonk;
        if (i13 == this.f53297jyumaefscl) {
            return (char) 65535;
        }
        return this.f53299zdlpuopuiu.charAt(i13);
    }

    @Override // java.text.CharacterIterator
    public char first() {
        this.f53296iwizpuwonk = this.f53298yggfygwlhe;
        return current();
    }

    @Override // java.text.CharacterIterator
    public int getBeginIndex() {
        return this.f53298yggfygwlhe;
    }

    @Override // java.text.CharacterIterator
    public int getEndIndex() {
        return this.f53297jyumaefscl;
    }

    @Override // java.text.CharacterIterator
    public int getIndex() {
        return this.f53296iwizpuwonk;
    }

    @Override // java.text.CharacterIterator
    public char last() {
        int i13 = this.f53298yggfygwlhe;
        int i14 = this.f53297jyumaefscl;
        if (i13 == i14) {
            this.f53296iwizpuwonk = i14;
            return (char) 65535;
        }
        int i15 = i14 - 1;
        this.f53296iwizpuwonk = i15;
        return this.f53299zdlpuopuiu.charAt(i15);
    }

    @Override // java.text.CharacterIterator
    public char next() {
        int i13 = this.f53296iwizpuwonk + 1;
        this.f53296iwizpuwonk = i13;
        int i14 = this.f53297jyumaefscl;
        if (i13 < i14) {
            return this.f53299zdlpuopuiu.charAt(i13);
        }
        this.f53296iwizpuwonk = i14;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public char previous() {
        int i13 = this.f53296iwizpuwonk;
        if (i13 <= this.f53298yggfygwlhe) {
            return (char) 65535;
        }
        int i14 = i13 - 1;
        this.f53296iwizpuwonk = i14;
        return this.f53299zdlpuopuiu.charAt(i14);
    }

    @Override // java.text.CharacterIterator
    public char setIndex(int i13) {
        int i14 = this.f53298yggfygwlhe;
        if (i13 > this.f53297jyumaefscl || i14 > i13) {
            throw new IllegalArgumentException("invalid position");
        }
        this.f53296iwizpuwonk = i13;
        return current();
    }
}
