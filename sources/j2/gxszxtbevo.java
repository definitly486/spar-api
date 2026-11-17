package j2;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final zoijcleaow f50541iobyxmoadg;

    private static class iobyxmoadg extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final TextView f50542iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private boolean f50543ppxfxbqfkf = true;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final wkgbmnqykc f50544zoijcleaow;

        iobyxmoadg(TextView textView) {
            this.f50542iobyxmoadg = textView;
            this.f50544zoijcleaow = new wkgbmnqykc(textView);
        }

        private TransformationMethod btonecajqb(TransformationMethod transformationMethod) {
            return transformationMethod instanceof nufgyqmvbu ? ((nufgyqmvbu) transformationMethod).iobyxmoadg() : transformationMethod;
        }

        private void gtknphoqwx() {
            this.f50542iobyxmoadg.setFilters(iobyxmoadg(this.f50542iobyxmoadg.getFilters()));
        }

        private InputFilter[] gxszxtbevo(InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f50544zoijcleaow) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f50544zoijcleaow;
            return inputFilterArr2;
        }

        private SparseArray lqeggnwhkg(InputFilter[] inputFilterArr) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i13 = 0; i13 < inputFilterArr.length; i13++) {
                InputFilter inputFilter = inputFilterArr[i13];
                if (inputFilter instanceof wkgbmnqykc) {
                    sparseArray.put(i13, inputFilter);
                }
            }
            return sparseArray;
        }

        private InputFilter[] nufgyqmvbu(InputFilter[] inputFilterArr) {
            SparseArray sparseArrayLqeggnwhkg = lqeggnwhkg(inputFilterArr);
            if (sparseArrayLqeggnwhkg.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArrayLqeggnwhkg.size()];
            int i13 = 0;
            for (int i14 = 0; i14 < length; i14++) {
                if (sparseArrayLqeggnwhkg.indexOfKey(i14) < 0) {
                    inputFilterArr2[i13] = inputFilterArr[i14];
                    i13++;
                }
            }
            return inputFilterArr2;
        }

        private TransformationMethod wflxmlrfwp(TransformationMethod transformationMethod) {
            return ((transformationMethod instanceof nufgyqmvbu) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new nufgyqmvbu(transformationMethod);
        }

        void draadjrbmk() {
            this.f50542iobyxmoadg.setTransformationMethod(eablkybsjg(this.f50542iobyxmoadg.getTransformationMethod()));
        }

        void dxjokdxxww(boolean z13) {
            this.f50543ppxfxbqfkf = z13;
        }

        @Override // j2.gxszxtbevo.zoijcleaow
        TransformationMethod eablkybsjg(TransformationMethod transformationMethod) {
            return this.f50543ppxfxbqfkf ? wflxmlrfwp(transformationMethod) : btonecajqb(transformationMethod);
        }

        @Override // j2.gxszxtbevo.zoijcleaow
        InputFilter[] iobyxmoadg(InputFilter[] inputFilterArr) {
            return !this.f50543ppxfxbqfkf ? nufgyqmvbu(inputFilterArr) : gxszxtbevo(inputFilterArr);
        }

        @Override // j2.gxszxtbevo.zoijcleaow
        void ppxfxbqfkf(boolean z13) {
            if (z13) {
                draadjrbmk();
            }
        }

        @Override // j2.gxszxtbevo.zoijcleaow
        void wkgbmnqykc(boolean z13) {
            this.f50543ppxfxbqfkf = z13;
            draadjrbmk();
            gtknphoqwx();
        }

        @Override // j2.gxszxtbevo.zoijcleaow
        public boolean zoijcleaow() {
            return this.f50543ppxfxbqfkf;
        }
    }

    private static class ppxfxbqfkf extends zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final iobyxmoadg f50545iobyxmoadg;

        ppxfxbqfkf(TextView textView) {
            this.f50545iobyxmoadg = new iobyxmoadg(textView);
        }

        private boolean gxszxtbevo() {
            return !i2.iobyxmoadg.wkgbmnqykc();
        }

        @Override // j2.gxszxtbevo.zoijcleaow
        TransformationMethod eablkybsjg(TransformationMethod transformationMethod) {
            return gxszxtbevo() ? transformationMethod : this.f50545iobyxmoadg.eablkybsjg(transformationMethod);
        }

        @Override // j2.gxszxtbevo.zoijcleaow
        InputFilter[] iobyxmoadg(InputFilter[] inputFilterArr) {
            return gxszxtbevo() ? inputFilterArr : this.f50545iobyxmoadg.iobyxmoadg(inputFilterArr);
        }

        @Override // j2.gxszxtbevo.zoijcleaow
        void ppxfxbqfkf(boolean z13) {
            if (gxszxtbevo()) {
                return;
            }
            this.f50545iobyxmoadg.ppxfxbqfkf(z13);
        }

        @Override // j2.gxszxtbevo.zoijcleaow
        void wkgbmnqykc(boolean z13) {
            if (gxszxtbevo()) {
                this.f50545iobyxmoadg.dxjokdxxww(z13);
            } else {
                this.f50545iobyxmoadg.wkgbmnqykc(z13);
            }
        }

        @Override // j2.gxszxtbevo.zoijcleaow
        public boolean zoijcleaow() {
            return this.f50545iobyxmoadg.zoijcleaow();
        }
    }

    static class zoijcleaow {
        zoijcleaow() {
        }

        abstract TransformationMethod eablkybsjg(TransformationMethod transformationMethod);

        abstract InputFilter[] iobyxmoadg(InputFilter[] inputFilterArr);

        abstract void ppxfxbqfkf(boolean z13);

        abstract void wkgbmnqykc(boolean z13);

        public abstract boolean zoijcleaow();
    }

    public gxszxtbevo(TextView textView, boolean z13) {
        u1.nufgyqmvbu.lqeggnwhkg(textView, "textView cannot be null");
        if (z13) {
            this.f50541iobyxmoadg = new iobyxmoadg(textView);
        } else {
            this.f50541iobyxmoadg = new ppxfxbqfkf(textView);
        }
    }

    public TransformationMethod eablkybsjg(TransformationMethod transformationMethod) {
        return this.f50541iobyxmoadg.eablkybsjg(transformationMethod);
    }

    public InputFilter[] iobyxmoadg(InputFilter[] inputFilterArr) {
        return this.f50541iobyxmoadg.iobyxmoadg(inputFilterArr);
    }

    public void ppxfxbqfkf(boolean z13) {
        this.f50541iobyxmoadg.ppxfxbqfkf(z13);
    }

    public void wkgbmnqykc(boolean z13) {
        this.f50541iobyxmoadg.wkgbmnqykc(z13);
    }

    public boolean zoijcleaow() {
        return this.f50541iobyxmoadg.zoijcleaow();
    }
}
