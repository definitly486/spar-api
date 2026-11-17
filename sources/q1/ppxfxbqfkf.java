package q1;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import gg.vdvldrhtss;
import java.io.Serializable;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public abstract class ppxfxbqfkf {
    public static final Bundle iobyxmoadg() {
        return new Bundle(0);
    }

    public static final Bundle zoijcleaow(vdvldrhtss... vdvldrhtssVarArr) {
        Bundle bundle = new Bundle(vdvldrhtssVarArr.length);
        for (vdvldrhtss vdvldrhtssVar : vdvldrhtssVarArr) {
            String str = (String) vdvldrhtssVar.iobyxmoadg();
            Object objWkgbmnqykc = vdvldrhtssVar.wkgbmnqykc();
            if (objWkgbmnqykc == null) {
                bundle.putString(str, null);
            } else if (objWkgbmnqykc instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) objWkgbmnqykc).booleanValue());
            } else if (objWkgbmnqykc instanceof Byte) {
                bundle.putByte(str, ((Number) objWkgbmnqykc).byteValue());
            } else if (objWkgbmnqykc instanceof Character) {
                bundle.putChar(str, ((Character) objWkgbmnqykc).charValue());
            } else if (objWkgbmnqykc instanceof Double) {
                bundle.putDouble(str, ((Number) objWkgbmnqykc).doubleValue());
            } else if (objWkgbmnqykc instanceof Float) {
                bundle.putFloat(str, ((Number) objWkgbmnqykc).floatValue());
            } else if (objWkgbmnqykc instanceof Integer) {
                bundle.putInt(str, ((Number) objWkgbmnqykc).intValue());
            } else if (objWkgbmnqykc instanceof Long) {
                bundle.putLong(str, ((Number) objWkgbmnqykc).longValue());
            } else if (objWkgbmnqykc instanceof Short) {
                bundle.putShort(str, ((Number) objWkgbmnqykc).shortValue());
            } else if (objWkgbmnqykc instanceof Bundle) {
                bundle.putBundle(str, (Bundle) objWkgbmnqykc);
            } else if (objWkgbmnqykc instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) objWkgbmnqykc);
            } else if (objWkgbmnqykc instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) objWkgbmnqykc);
            } else if (objWkgbmnqykc instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) objWkgbmnqykc);
            } else if (objWkgbmnqykc instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) objWkgbmnqykc);
            } else if (objWkgbmnqykc instanceof char[]) {
                bundle.putCharArray(str, (char[]) objWkgbmnqykc);
            } else if (objWkgbmnqykc instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) objWkgbmnqykc);
            } else if (objWkgbmnqykc instanceof float[]) {
                bundle.putFloatArray(str, (float[]) objWkgbmnqykc);
            } else if (objWkgbmnqykc instanceof int[]) {
                bundle.putIntArray(str, (int[]) objWkgbmnqykc);
            } else if (objWkgbmnqykc instanceof long[]) {
                bundle.putLongArray(str, (long[]) objWkgbmnqykc);
            } else if (objWkgbmnqykc instanceof short[]) {
                bundle.putShortArray(str, (short[]) objWkgbmnqykc);
            } else if (objWkgbmnqykc instanceof Object[]) {
                Class<?> componentType = objWkgbmnqykc.getClass().getComponentType();
                zdlpuopuiu.lqeggnwhkg(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    zdlpuopuiu.nufgyqmvbu(objWkgbmnqykc, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
                    bundle.putParcelableArray(str, (Parcelable[]) objWkgbmnqykc);
                } else if (String.class.isAssignableFrom(componentType)) {
                    zdlpuopuiu.nufgyqmvbu(objWkgbmnqykc, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    bundle.putStringArray(str, (String[]) objWkgbmnqykc);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    zdlpuopuiu.nufgyqmvbu(objWkgbmnqykc, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
                    bundle.putCharSequenceArray(str, (CharSequence[]) objWkgbmnqykc);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) objWkgbmnqykc);
                }
            } else if (objWkgbmnqykc instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) objWkgbmnqykc);
            } else if (objWkgbmnqykc instanceof IBinder) {
                bundle.putBinder(str, (IBinder) objWkgbmnqykc);
            } else if (objWkgbmnqykc instanceof Size) {
                zoijcleaow.iobyxmoadg(bundle, str, (Size) objWkgbmnqykc);
            } else {
                if (!(objWkgbmnqykc instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + objWkgbmnqykc.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                zoijcleaow.zoijcleaow(bundle, str, (SizeF) objWkgbmnqykc);
            }
        }
        return bundle;
    }
}
