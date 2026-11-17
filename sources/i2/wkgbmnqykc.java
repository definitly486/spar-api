package i2;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import u1.nufgyqmvbu;

/* JADX INFO: loaded from: classes.dex */
public final class wkgbmnqykc extends SpannableStringBuilder {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final List f41707yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Class f41708zdlpuopuiu;

    private static class iobyxmoadg implements TextWatcher, SpanWatcher {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final AtomicInteger f41709yggfygwlhe = new AtomicInteger(0);

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final Object f41710zdlpuopuiu;

        iobyxmoadg(Object obj) {
            this.f41710zdlpuopuiu = obj;
        }

        private boolean zoijcleaow(Object obj) {
            return false;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f41710zdlpuopuiu).afterTextChanged(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
            ((TextWatcher) this.f41710zdlpuopuiu).beforeTextChanged(charSequence, i13, i14, i15);
        }

        final void iobyxmoadg() {
            this.f41709yggfygwlhe.incrementAndGet();
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(Spannable spannable, Object obj, int i13, int i14) {
            if (this.f41709yggfygwlhe.get() <= 0 || !zoijcleaow(obj)) {
                ((SpanWatcher) this.f41710zdlpuopuiu).onSpanAdded(spannable, obj, i13, i14);
            }
        }

        /* JADX WARN: Code duplicated, block: B:14:0x001e A[PHI: r11
          0x001e: PHI (r11v1 int) = (r11v0 int), (r11v3 int) binds: [B:8:0x0013, B:12:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // android.text.SpanWatcher
        public void onSpanChanged(Spannable spannable, Object obj, int i13, int i14, int i15, int i16) {
            int i17;
            int i18;
            if (this.f41709yggfygwlhe.get() <= 0 || !zoijcleaow(obj)) {
                if (Build.VERSION.SDK_INT >= 28) {
                    i17 = i13;
                    i18 = i15;
                } else {
                    if (i13 > i14) {
                        i13 = 0;
                    }
                    if (i15 > i16) {
                        i17 = i13;
                        i18 = 0;
                    } else {
                        i17 = i13;
                        i18 = i15;
                    }
                }
                ((SpanWatcher) this.f41710zdlpuopuiu).onSpanChanged(spannable, obj, i17, i14, i18, i16);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(Spannable spannable, Object obj, int i13, int i14) {
            if (this.f41709yggfygwlhe.get() <= 0 || !zoijcleaow(obj)) {
                ((SpanWatcher) this.f41710zdlpuopuiu).onSpanRemoved(spannable, obj, i13, i14);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
            ((TextWatcher) this.f41710zdlpuopuiu).onTextChanged(charSequence, i13, i14, i15);
        }

        final void ppxfxbqfkf() {
            this.f41709yggfygwlhe.decrementAndGet();
        }
    }

    wkgbmnqykc(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f41707yggfygwlhe = new ArrayList();
        nufgyqmvbu.lqeggnwhkg(cls, "watcherClass cannot be null");
        this.f41708zdlpuopuiu = cls;
    }

    private boolean eablkybsjg(Object obj) {
        return obj != null && wkgbmnqykc(obj.getClass());
    }

    private void gxszxtbevo() {
        for (int i13 = 0; i13 < this.f41707yggfygwlhe.size(); i13++) {
            ((iobyxmoadg) this.f41707yggfygwlhe.get(i13)).ppxfxbqfkf();
        }
    }

    private void iobyxmoadg() {
        for (int i13 = 0; i13 < this.f41707yggfygwlhe.size(); i13++) {
            ((iobyxmoadg) this.f41707yggfygwlhe.get(i13)).iobyxmoadg();
        }
    }

    private iobyxmoadg ppxfxbqfkf(Object obj) {
        for (int i13 = 0; i13 < this.f41707yggfygwlhe.size(); i13++) {
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) this.f41707yggfygwlhe.get(i13);
            if (iobyxmoadgVar.f41710zdlpuopuiu == obj) {
                return iobyxmoadgVar;
            }
        }
        return null;
    }

    private boolean wkgbmnqykc(Class cls) {
        return this.f41708zdlpuopuiu == cls;
    }

    public static wkgbmnqykc zoijcleaow(Class cls, CharSequence charSequence) {
        return new wkgbmnqykc(cls, charSequence);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanEnd(Object obj) {
        iobyxmoadg iobyxmoadgVarPpxfxbqfkf;
        if (eablkybsjg(obj) && (iobyxmoadgVarPpxfxbqfkf = ppxfxbqfkf(obj)) != null) {
            obj = iobyxmoadgVarPpxfxbqfkf;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanFlags(Object obj) {
        iobyxmoadg iobyxmoadgVarPpxfxbqfkf;
        if (eablkybsjg(obj) && (iobyxmoadgVarPpxfxbqfkf = ppxfxbqfkf(obj)) != null) {
            obj = iobyxmoadgVarPpxfxbqfkf;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanStart(Object obj) {
        iobyxmoadg iobyxmoadgVarPpxfxbqfkf;
        if (eablkybsjg(obj) && (iobyxmoadgVarPpxfxbqfkf = ppxfxbqfkf(obj)) != null) {
            obj = iobyxmoadgVarPpxfxbqfkf;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public Object[] getSpans(int i13, int i14, Class cls) {
        if (!wkgbmnqykc(cls)) {
            return super.getSpans(i13, i14, cls);
        }
        iobyxmoadg[] iobyxmoadgVarArr = (iobyxmoadg[]) super.getSpans(i13, i14, iobyxmoadg.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, iobyxmoadgVarArr.length);
        for (int i15 = 0; i15 < iobyxmoadgVarArr.length; i15++) {
            objArr[i15] = iobyxmoadgVarArr[i15].f41710zdlpuopuiu;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int nextSpanTransition(int i13, int i14, Class cls) {
        if (cls == null || wkgbmnqykc(cls)) {
            cls = iobyxmoadg.class;
        }
        return super.nextSpanTransition(i13, i14, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void removeSpan(Object obj) {
        iobyxmoadg iobyxmoadgVarPpxfxbqfkf;
        if (eablkybsjg(obj)) {
            iobyxmoadgVarPpxfxbqfkf = ppxfxbqfkf(obj);
            if (iobyxmoadgVarPpxfxbqfkf != null) {
                obj = iobyxmoadgVarPpxfxbqfkf;
            }
        } else {
            iobyxmoadgVarPpxfxbqfkf = null;
        }
        super.removeSpan(obj);
        if (iobyxmoadgVarPpxfxbqfkf != null) {
            this.f41707yggfygwlhe.remove(iobyxmoadgVarPpxfxbqfkf);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(Object obj, int i13, int i14, int i15) {
        if (eablkybsjg(obj)) {
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg(obj);
            this.f41707yggfygwlhe.add(iobyxmoadgVar);
            obj = iobyxmoadgVar;
        }
        super.setSpan(obj, i13, i14, i15);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public CharSequence subSequence(int i13, int i14) {
        return new wkgbmnqykc(this.f41708zdlpuopuiu, this, i13, i14);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder delete(int i13, int i14) {
        super.delete(i13, i14);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder insert(int i13, CharSequence charSequence) {
        super.insert(i13, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i13, int i14, CharSequence charSequence) {
        iobyxmoadg();
        super.replace(i13, i14, charSequence);
        gxszxtbevo();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder insert(int i13, CharSequence charSequence, int i14, int i15) {
        super.insert(i13, charSequence, i14, i15);
        return this;
    }

    wkgbmnqykc(Class cls, CharSequence charSequence, int i13, int i14) {
        super(charSequence, i13, i14);
        this.f41707yggfygwlhe = new ArrayList();
        nufgyqmvbu.lqeggnwhkg(cls, "watcherClass cannot be null");
        this.f41708zdlpuopuiu = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i13, int i14, CharSequence charSequence, int i15, int i16) {
        iobyxmoadg();
        super.replace(i13, i14, charSequence, i15, i16);
        gxszxtbevo();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(char c13) {
        super.append(c13);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(CharSequence charSequence, int i13, int i14) {
        super.append(charSequence, i13, i14);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i13) {
        super.append(charSequence, obj, i13);
        return this;
    }
}
