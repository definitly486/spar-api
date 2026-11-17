package hg;

import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class rgvfuqvkyq extends ojitshcjhn {
    public static boolean wkgbmnqykc(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr == null || objArr2 == null || objArr.length != objArr2.length) {
            return false;
        }
        int length = objArr.length;
        for (int i13 = 0; i13 < length; i13++) {
            Object obj = objArr[i13];
            Object obj2 = objArr2[i13];
            if (obj != obj2) {
                if (obj == null || obj2 == null) {
                    return false;
                }
                if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                    if (!agtfadlqog.wkgbmnqykc((Object[]) obj, (Object[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                    if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                    if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                    if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                    if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                    if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                    if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof gg.lereixgezr) && (obj2 instanceof gg.lereixgezr)) {
                    if (!jg.iobyxmoadg.ppxfxbqfkf(((gg.lereixgezr) obj).oxmwwwfdhm(), ((gg.lereixgezr) obj2).oxmwwwfdhm())) {
                        return false;
                    }
                } else if ((obj instanceof gg.lmojexxdyd) && (obj2 instanceof gg.lmojexxdyd)) {
                    if (!jg.iobyxmoadg.iobyxmoadg(((gg.lmojexxdyd) obj).oxmwwwfdhm(), ((gg.lmojexxdyd) obj2).oxmwwwfdhm())) {
                        return false;
                    }
                } else if ((obj instanceof gg.zynmafqrjb) && (obj2 instanceof gg.zynmafqrjb)) {
                    if (!jg.iobyxmoadg.zoijcleaow(((gg.zynmafqrjb) obj).oxmwwwfdhm(), ((gg.zynmafqrjb) obj2).oxmwwwfdhm())) {
                        return false;
                    }
                } else if ((obj instanceof gg.cdpycssgdh) && (obj2 instanceof gg.cdpycssgdh)) {
                    if (!jg.iobyxmoadg.wkgbmnqykc(((gg.cdpycssgdh) obj).oxmwwwfdhm(), ((gg.cdpycssgdh) obj2).oxmwwwfdhm())) {
                        return false;
                    }
                } else if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(obj, obj2)) {
                    return false;
                }
            }
        }
        return true;
    }
}
