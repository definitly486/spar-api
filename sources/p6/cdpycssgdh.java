package p6;

import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import g6.hkdspvbjdz;
import gg.wwaezpbzkn;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class cdpycssgdh {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final cdpycssgdh f75698iobyxmoadg = new cdpycssgdh();

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f75699iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final /* synthetic */ int[] f75700ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public static final /* synthetic */ int[] f75701wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final /* synthetic */ int[] f75702zoijcleaow;

        static {
            int[] iArr = new int[hkdspvbjdz.ppxfxbqfkf.values().length];
            try {
                iArr[hkdspvbjdz.ppxfxbqfkf.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[hkdspvbjdz.ppxfxbqfkf.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[hkdspvbjdz.ppxfxbqfkf.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[hkdspvbjdz.ppxfxbqfkf.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[hkdspvbjdz.ppxfxbqfkf.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[hkdspvbjdz.ppxfxbqfkf.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f75699iobyxmoadg = iArr;
            int[] iArr2 = new int[g6.iobyxmoadg.values().length];
            try {
                iArr2[g6.iobyxmoadg.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[g6.iobyxmoadg.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            f75702zoijcleaow = iArr2;
            int[] iArr3 = new int[g6.jyumaefscl.values().length];
            try {
                iArr3[g6.jyumaefscl.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[g6.jyumaefscl.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[g6.jyumaefscl.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[g6.jyumaefscl.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[g6.jyumaefscl.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            f75700ppxfxbqfkf = iArr3;
            int[] iArr4 = new int[g6.cdpycssgdh.values().length];
            try {
                iArr4[g6.cdpycssgdh.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[g6.cdpycssgdh.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            f75701wkgbmnqykc = iArr4;
        }
    }

    private cdpycssgdh() {
    }

    public static final byte[] btonecajqb(Set triggers) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(triggers, "triggers");
        if (triggers.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(triggers.size());
                Iterator it = triggers.iterator();
                while (it.hasNext()) {
                    g6.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVar = (g6.wkgbmnqykc.ppxfxbqfkf) it.next();
                    objectOutputStream.writeUTF(ppxfxbqfkfVar.iobyxmoadg().toString());
                    objectOutputStream.writeBoolean(ppxfxbqfkfVar.zoijcleaow());
                }
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                rg.zoijcleaow.iobyxmoadg(objectOutputStream, null);
                rg.zoijcleaow.iobyxmoadg(byteArrayOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(byteArray, "outputStream.toByteArray()");
                return byteArray;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    rg.zoijcleaow.iobyxmoadg(objectOutputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                rg.zoijcleaow.iobyxmoadg(byteArrayOutputStream, th4);
                throw th5;
            }
        }
    }

    public static final q6.lereixgezr draadjrbmk(byte[] bytes) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bytes, "bytes");
        if (Build.VERSION.SDK_INT < 28 || bytes.length == 0) {
            return new q6.lereixgezr(null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int i13 = objectInputStream.readInt();
                int[] iArr = new int[i13];
                for (int i14 = 0; i14 < i13; i14++) {
                    iArr[i14] = objectInputStream.readInt();
                }
                int i15 = objectInputStream.readInt();
                int[] iArr2 = new int[i15];
                for (int i16 = 0; i16 < i15; i16++) {
                    iArr2[i16] = objectInputStream.readInt();
                }
                q6.lereixgezr lereixgezrVarZoijcleaow = q6.jyumaefscl.f77946iobyxmoadg.zoijcleaow(iArr2, iArr);
                rg.zoijcleaow.iobyxmoadg(objectInputStream, null);
                rg.zoijcleaow.iobyxmoadg(byteArrayInputStream, null);
                return lereixgezrVarZoijcleaow;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    rg.zoijcleaow.iobyxmoadg(objectInputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                rg.zoijcleaow.iobyxmoadg(byteArrayInputStream, th4);
                throw th5;
            }
        }
    }

    public static final int dxjokdxxww(g6.cdpycssgdh policy) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(policy, "policy");
        int i13 = iobyxmoadg.f75701wkgbmnqykc[policy.ordinal()];
        if (i13 == 1) {
            return 0;
        }
        if (i13 == 2) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final g6.jyumaefscl eablkybsjg(int i13) {
        if (i13 == 0) {
            return g6.jyumaefscl.NOT_REQUIRED;
        }
        if (i13 == 1) {
            return g6.jyumaefscl.CONNECTED;
        }
        if (i13 == 2) {
            return g6.jyumaefscl.UNMETERED;
        }
        if (i13 == 3) {
            return g6.jyumaefscl.NOT_ROAMING;
        }
        if (i13 == 4) {
            return g6.jyumaefscl.METERED;
        }
        if (Build.VERSION.SDK_INT >= 30 && i13 == 5) {
            return g6.jyumaefscl.TEMPORARILY_UNMETERED;
        }
        throw new IllegalArgumentException("Could not convert " + i13 + " to NetworkType");
    }

    public static final int gtknphoqwx(hkdspvbjdz.ppxfxbqfkf state) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(state, "state");
        switch (iobyxmoadg.f75699iobyxmoadg[state.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final g6.cdpycssgdh gxszxtbevo(int i13) {
        if (i13 == 0) {
            return g6.cdpycssgdh.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i13 == 1) {
            return g6.cdpycssgdh.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException("Could not convert " + i13 + " to OutOfQuotaPolicy");
    }

    public static final int iobyxmoadg(g6.iobyxmoadg backoffPolicy) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(backoffPolicy, "backoffPolicy");
        int i13 = iobyxmoadg.f75702zoijcleaow[backoffPolicy.ordinal()];
        if (i13 == 1) {
            return 0;
        }
        if (i13 == 2) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final hkdspvbjdz.ppxfxbqfkf lqeggnwhkg(int i13) {
        if (i13 == 0) {
            return hkdspvbjdz.ppxfxbqfkf.ENQUEUED;
        }
        if (i13 == 1) {
            return hkdspvbjdz.ppxfxbqfkf.RUNNING;
        }
        if (i13 == 2) {
            return hkdspvbjdz.ppxfxbqfkf.SUCCEEDED;
        }
        if (i13 == 3) {
            return hkdspvbjdz.ppxfxbqfkf.FAILED;
        }
        if (i13 == 4) {
            return hkdspvbjdz.ppxfxbqfkf.BLOCKED;
        }
        if (i13 == 5) {
            return hkdspvbjdz.ppxfxbqfkf.CANCELLED;
        }
        throw new IllegalArgumentException("Could not convert " + i13 + " to State");
    }

    public static final int nufgyqmvbu(g6.jyumaefscl networkType) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(networkType, "networkType");
        int i13 = iobyxmoadg.f75700ppxfxbqfkf[networkType.ordinal()];
        if (i13 == 1) {
            return 0;
        }
        int i14 = 2;
        if (i13 == 2) {
            return 1;
        }
        if (i13 != 3) {
            i14 = 4;
            if (i13 == 4) {
                return 3;
            }
            if (i13 != 5) {
                if (Build.VERSION.SDK_INT >= 30 && networkType == g6.jyumaefscl.TEMPORARILY_UNMETERED) {
                    return 5;
                }
                throw new IllegalArgumentException("Could not convert " + networkType + " to int");
            }
        }
        return i14;
    }

    public static final byte[] ppxfxbqfkf(q6.lereixgezr requestCompat) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(requestCompat, "requestCompat");
        if (Build.VERSION.SDK_INT < 28) {
            return new byte[0];
        }
        NetworkRequest networkRequestZoijcleaow = requestCompat.zoijcleaow();
        if (networkRequestZoijcleaow == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                int[] iArrZoijcleaow = q6.pmvmpeiblj.zoijcleaow(networkRequestZoijcleaow);
                int[] iArrIobyxmoadg = q6.pmvmpeiblj.iobyxmoadg(networkRequestZoijcleaow);
                objectOutputStream.writeInt(iArrZoijcleaow.length);
                for (int i13 : iArrZoijcleaow) {
                    objectOutputStream.writeInt(i13);
                }
                objectOutputStream.writeInt(iArrIobyxmoadg.length);
                for (int i14 : iArrIobyxmoadg) {
                    objectOutputStream.writeInt(i14);
                }
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                rg.zoijcleaow.iobyxmoadg(objectOutputStream, null);
                rg.zoijcleaow.iobyxmoadg(byteArrayOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(byteArray, "outputStream.toByteArray()");
                return byteArray;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    rg.zoijcleaow.iobyxmoadg(objectOutputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                rg.zoijcleaow.iobyxmoadg(byteArrayOutputStream, th4);
                throw th5;
            }
        }
    }

    public static final g6.iobyxmoadg wkgbmnqykc(int i13) {
        if (i13 == 0) {
            return g6.iobyxmoadg.EXPONENTIAL;
        }
        if (i13 == 1) {
            return g6.iobyxmoadg.LINEAR;
        }
        throw new IllegalArgumentException("Could not convert " + i13 + " to BackoffPolicy");
    }

    public static final Set zoijcleaow(byte[] bytes) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bytes, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bytes.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i13 = objectInputStream.readInt();
                    for (int i14 = 0; i14 < i13; i14++) {
                        Uri uri = Uri.parse(objectInputStream.readUTF());
                        boolean z13 = objectInputStream.readBoolean();
                        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(uri, "uri");
                        linkedHashSet.add(new g6.wkgbmnqykc.ppxfxbqfkf(uri, z13));
                    }
                    wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                    rg.zoijcleaow.iobyxmoadg(objectInputStream, null);
                    wwaezpbzkn wwaezpbzknVar2 = wwaezpbzkn.f37140iobyxmoadg;
                    rg.zoijcleaow.iobyxmoadg(byteArrayInputStream, null);
                    return linkedHashSet;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        rg.zoijcleaow.iobyxmoadg(objectInputStream, th2);
                        throw th3;
                    }
                }
            } catch (IOException e13) {
                e13.printStackTrace();
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                rg.zoijcleaow.iobyxmoadg(byteArrayInputStream, th4);
                throw th5;
            }
        }
    }
}
