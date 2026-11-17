package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public abstract class VersionedParcel {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    protected final androidx.collection.iobyxmoadg f13696iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    protected final androidx.collection.iobyxmoadg f13697ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    protected final androidx.collection.iobyxmoadg f13698zoijcleaow;

    public static class ParcelException extends RuntimeException {
    }

    public VersionedParcel(androidx.collection.iobyxmoadg iobyxmoadgVar, androidx.collection.iobyxmoadg iobyxmoadgVar2, androidx.collection.iobyxmoadg iobyxmoadgVar3) {
        this.f13696iobyxmoadg = iobyxmoadgVar;
        this.f13698zoijcleaow = iobyxmoadgVar2;
        this.f13697ppxfxbqfkf = iobyxmoadgVar3;
    }

    private void cllcsxoeiz(z5.iobyxmoadg iobyxmoadgVar) {
        try {
            ylkuphrtab(ppxfxbqfkf(iobyxmoadgVar.getClass()).getName());
        } catch (ClassNotFoundException e13) {
            throw new RuntimeException(iobyxmoadgVar.getClass().getSimpleName() + " does not have a Parcelizer", e13);
        }
    }

    private Method eablkybsjg(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        Method method = (Method) this.f13698zoijcleaow.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class clsPpxfxbqfkf = ppxfxbqfkf(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsPpxfxbqfkf.getDeclaredMethod("write", cls, VersionedParcel.class);
        this.f13698zoijcleaow.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    private Class ppxfxbqfkf(Class cls) throws ClassNotFoundException {
        Class cls2 = (Class) this.f13697ppxfxbqfkf.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f13697ppxfxbqfkf.put(cls.getName(), cls3);
        return cls3;
    }

    private Method wkgbmnqykc(String str) throws NoSuchMethodException {
        Method method = (Method) this.f13696iobyxmoadg.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, VersionedParcel.class.getClassLoader()).getDeclaredMethod("read", VersionedParcel.class);
        this.f13696iobyxmoadg.put(str, declaredMethod);
        return declaredMethod;
    }

    protected z5.iobyxmoadg agtfadlqog(String str, VersionedParcel versionedParcel) {
        try {
            return (z5.iobyxmoadg) wkgbmnqykc(str).invoke(null, versionedParcel);
        } catch (ClassNotFoundException e13) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e13);
        } catch (IllegalAccessException e14) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e14);
        } catch (NoSuchMethodException e15) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e15);
        } catch (InvocationTargetException e16) {
            if (e16.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e16.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e16);
        }
    }

    public byte[] btonecajqb(byte[] bArr, int i13) {
        return !wflxmlrfwp(i13) ? bArr : dxjokdxxww();
    }

    public void cdpycssgdh(CharSequence charSequence, int i13) {
        iwizpuwonk(i13);
        istkbnxepw(charSequence);
    }

    public void cqumvgiudr(boolean z13, boolean z14) {
    }

    public CharSequence draadjrbmk(CharSequence charSequence, int i13) {
        return !wflxmlrfwp(i13) ? charSequence : gtknphoqwx();
    }

    protected abstract byte[] dxjokdxxww();

    protected abstract void esjtqupxsv(boolean z13);

    protected abstract CharSequence gtknphoqwx();

    public boolean gxszxtbevo() {
        return false;
    }

    protected void hcddaimhww(z5.iobyxmoadg iobyxmoadgVar, VersionedParcel versionedParcel) {
        try {
            eablkybsjg(iobyxmoadgVar.getClass()).invoke(null, iobyxmoadgVar, versionedParcel);
        } catch (ClassNotFoundException e13) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e13);
        } catch (IllegalAccessException e14) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e14);
        } catch (NoSuchMethodException e15) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e15);
        } catch (InvocationTargetException e16) {
            if (!(e16.getCause() instanceof RuntimeException)) {
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e16);
            }
            throw ((RuntimeException) e16.getCause());
        }
    }

    public void hkdspvbjdz(z5.iobyxmoadg iobyxmoadgVar, int i13) {
        iwizpuwonk(i13);
        jpowsppfya(iobyxmoadgVar);
    }

    protected abstract void iobyxmoadg();

    public void iozdgvuglv(int i13, int i14) {
        iwizpuwonk(i14);
        yadqdtsiqt(i13);
    }

    protected abstract void istkbnxepw(CharSequence charSequence);

    protected abstract void iwizpuwonk(int i13);

    protected void jpowsppfya(z5.iobyxmoadg iobyxmoadgVar) {
        if (iobyxmoadgVar == null) {
            ylkuphrtab(null);
            return;
        }
        cllcsxoeiz(iobyxmoadgVar);
        VersionedParcel versionedParcelZoijcleaow = zoijcleaow();
        hcddaimhww(iobyxmoadgVar, versionedParcelZoijcleaow);
        versionedParcelZoijcleaow.iobyxmoadg();
    }

    public z5.iobyxmoadg jyumaefscl(z5.iobyxmoadg iobyxmoadgVar, int i13) {
        return !wflxmlrfwp(i13) ? iobyxmoadgVar : yggfygwlhe();
    }

    protected abstract String kcexrzcfyt();

    public void lereixgezr(boolean z13, int i13) {
        iwizpuwonk(i13);
        esjtqupxsv(z13);
    }

    protected abstract void lmojexxdyd(Parcelable parcelable);

    protected abstract boolean lqeggnwhkg();

    public boolean nufgyqmvbu(boolean z13, int i13) {
        return !wflxmlrfwp(i13) ? z13 : lqeggnwhkg();
    }

    protected abstract int ojitshcjhn();

    public Parcelable oxmwwwfdhm(Parcelable parcelable, int i13) {
        return !wflxmlrfwp(i13) ? parcelable : vdvldrhtss();
    }

    public void pkzmftpjix(String str, int i13) {
        iwizpuwonk(i13);
        ylkuphrtab(str);
    }

    protected abstract void pmvmpeiblj(byte[] bArr);

    public int rgvfuqvkyq(int i13, int i14) {
        return !wflxmlrfwp(i14) ? i13 : ojitshcjhn();
    }

    protected abstract Parcelable vdvldrhtss();

    protected abstract boolean wflxmlrfwp(int i13);

    public void wwaezpbzkn(Parcelable parcelable, int i13) {
        iwizpuwonk(i13);
        lmojexxdyd(parcelable);
    }

    protected abstract void yadqdtsiqt(int i13);

    protected z5.iobyxmoadg yggfygwlhe() {
        String strKcexrzcfyt = kcexrzcfyt();
        if (strKcexrzcfyt == null) {
            return null;
        }
        return agtfadlqog(strKcexrzcfyt, zoijcleaow());
    }

    protected abstract void ylkuphrtab(String str);

    public String zdlpuopuiu(String str, int i13) {
        return !wflxmlrfwp(i13) ? str : kcexrzcfyt();
    }

    protected abstract VersionedParcel zoijcleaow();

    public void zynmafqrjb(byte[] bArr, int i13) {
        iwizpuwonk(i13);
        pmvmpeiblj(bArr);
    }
}
