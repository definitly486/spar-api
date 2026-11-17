package io.appmetrica.analytics.impl;

import com.google.protobuf.DescriptorProtos;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import modern.payments.ecomAndroid.util.networkErrorHandler.impl.OrderServiceErrorHandlerImpl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.xm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3970xm extends MessageNano {
    public static final int E = -1;
    public static final int F = 0;
    public static final int G = 1;
    public static volatile C3970xm[] H;
    public C3721nm A;
    public C3920vm B;
    public C3870tm[] C;
    public C3820rm D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f48459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f48460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f48461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f48462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f48463e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String[] f48464f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String[] f48465g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C3796qm[] f48466h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C3845sm f48467i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f48468j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f48469k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f48470l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f48471m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f48472n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String[] f48473o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C3945wm f48474p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f48475q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f48476r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f48477s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f48478t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f48479u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C3895um f48480v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f48481w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f48482x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public C3771pm f48483y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C3746om f48484z;

    public C3970xm() {
        a();
    }

    public static C3970xm[] b() {
        if (H == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (H == null) {
                        H = new C3970xm[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return H;
    }

    public final C3970xm a() {
        this.f48459a = "";
        this.f48460b = 0L;
        String[] strArr = WireFormatNano.EMPTY_STRING_ARRAY;
        this.f48461c = strArr;
        this.f48462d = "";
        this.f48463e = "";
        this.f48464f = strArr;
        this.f48465g = strArr;
        this.f48466h = C3796qm.b();
        this.f48467i = null;
        this.f48468j = "";
        this.f48469k = "";
        this.f48470l = "";
        this.f48471m = false;
        this.f48472n = "";
        this.f48473o = strArr;
        this.f48474p = null;
        this.f48475q = false;
        this.f48476r = "";
        this.f48477s = 0L;
        this.f48478t = 0L;
        this.f48479u = false;
        this.f48480v = null;
        this.f48481w = 600;
        this.f48482x = 1;
        this.f48483y = null;
        this.f48484z = null;
        this.A = null;
        this.B = null;
        this.C = C3870tm.b();
        this.D = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f48459a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f48459a);
        }
        int iComputeInt64Size = CodedOutputByteBufferNano.computeInt64Size(2, this.f48460b) + iComputeSerializedSize;
        String[] strArr = this.f48461c;
        int i13 = 0;
        if (strArr != null && strArr.length > 0) {
            int i14 = 0;
            int iComputeStringSizeNoTag = 0;
            int i15 = 0;
            while (true) {
                String[] strArr2 = this.f48461c;
                if (i14 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i14];
                if (str != null) {
                    i15++;
                    iComputeStringSizeNoTag += CodedOutputByteBufferNano.computeStringSizeNoTag(str);
                }
                i14++;
            }
            iComputeInt64Size = iComputeInt64Size + iComputeStringSizeNoTag + i15;
        }
        if (!this.f48462d.equals("")) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeStringSize(4, this.f48462d);
        }
        if (!this.f48463e.equals("")) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeStringSize(5, this.f48463e);
        }
        String[] strArr3 = this.f48464f;
        if (strArr3 != null && strArr3.length > 0) {
            int i16 = 0;
            int iComputeStringSizeNoTag2 = 0;
            int i17 = 0;
            while (true) {
                String[] strArr4 = this.f48464f;
                if (i16 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i16];
                if (str2 != null) {
                    i17++;
                    iComputeStringSizeNoTag2 += CodedOutputByteBufferNano.computeStringSizeNoTag(str2);
                }
                i16++;
            }
            iComputeInt64Size = iComputeInt64Size + iComputeStringSizeNoTag2 + i17;
        }
        String[] strArr5 = this.f48465g;
        if (strArr5 != null && strArr5.length > 0) {
            int i18 = 0;
            int iComputeStringSizeNoTag3 = 0;
            int i19 = 0;
            while (true) {
                String[] strArr6 = this.f48465g;
                if (i18 >= strArr6.length) {
                    break;
                }
                String str3 = strArr6[i18];
                if (str3 != null) {
                    i19++;
                    iComputeStringSizeNoTag3 += CodedOutputByteBufferNano.computeStringSizeNoTag(str3);
                }
                i18++;
            }
            iComputeInt64Size = iComputeInt64Size + iComputeStringSizeNoTag3 + i19;
        }
        C3796qm[] c3796qmArr = this.f48466h;
        if (c3796qmArr != null && c3796qmArr.length > 0) {
            int i23 = 0;
            while (true) {
                C3796qm[] c3796qmArr2 = this.f48466h;
                if (i23 >= c3796qmArr2.length) {
                    break;
                }
                C3796qm c3796qm = c3796qmArr2[i23];
                if (c3796qm != null) {
                    iComputeInt64Size = CodedOutputByteBufferNano.computeMessageSize(8, c3796qm) + iComputeInt64Size;
                }
                i23++;
            }
        }
        C3845sm c3845sm = this.f48467i;
        if (c3845sm != null) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeMessageSize(9, c3845sm);
        }
        if (!this.f48468j.equals("")) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeStringSize(10, this.f48468j);
        }
        if (!this.f48469k.equals("")) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeStringSize(11, this.f48469k);
        }
        if (!this.f48470l.equals("")) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeStringSize(12, this.f48470l);
        }
        int iComputeBoolSize = CodedOutputByteBufferNano.computeBoolSize(13, this.f48471m) + iComputeInt64Size;
        if (!this.f48472n.equals("")) {
            iComputeBoolSize += CodedOutputByteBufferNano.computeStringSize(14, this.f48472n);
        }
        String[] strArr7 = this.f48473o;
        if (strArr7 != null && strArr7.length > 0) {
            int i24 = 0;
            int iComputeStringSizeNoTag4 = 0;
            int i25 = 0;
            while (true) {
                String[] strArr8 = this.f48473o;
                if (i24 >= strArr8.length) {
                    break;
                }
                String str4 = strArr8[i24];
                if (str4 != null) {
                    i25++;
                    iComputeStringSizeNoTag4 += CodedOutputByteBufferNano.computeStringSizeNoTag(str4);
                }
                i24++;
            }
            iComputeBoolSize = iComputeBoolSize + iComputeStringSizeNoTag4 + i25;
        }
        C3945wm c3945wm = this.f48474p;
        if (c3945wm != null) {
            iComputeBoolSize += CodedOutputByteBufferNano.computeMessageSize(16, c3945wm);
        }
        boolean z13 = this.f48475q;
        if (z13) {
            iComputeBoolSize += CodedOutputByteBufferNano.computeBoolSize(17, z13);
        }
        if (!this.f48476r.equals("")) {
            iComputeBoolSize += CodedOutputByteBufferNano.computeStringSize(20, this.f48476r);
        }
        int iComputeInt64Size2 = CodedOutputByteBufferNano.computeInt64Size(22, this.f48478t) + CodedOutputByteBufferNano.computeInt64Size(21, this.f48477s) + iComputeBoolSize;
        boolean z14 = this.f48479u;
        if (z14) {
            iComputeInt64Size2 += CodedOutputByteBufferNano.computeBoolSize(23, z14);
        }
        C3895um c3895um = this.f48480v;
        if (c3895um != null) {
            iComputeInt64Size2 += CodedOutputByteBufferNano.computeMessageSize(24, c3895um);
        }
        int iComputeInt32Size = CodedOutputByteBufferNano.computeInt32Size(26, this.f48482x) + CodedOutputByteBufferNano.computeInt32Size(25, this.f48481w) + iComputeInt64Size2;
        C3771pm c3771pm = this.f48483y;
        if (c3771pm != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(27, c3771pm);
        }
        C3746om c3746om = this.f48484z;
        if (c3746om != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(28, c3746om);
        }
        C3721nm c3721nm = this.A;
        if (c3721nm != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(29, c3721nm);
        }
        C3920vm c3920vm = this.B;
        if (c3920vm != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(30, c3920vm);
        }
        C3870tm[] c3870tmArr = this.C;
        if (c3870tmArr != null && c3870tmArr.length > 0) {
            while (true) {
                C3870tm[] c3870tmArr2 = this.C;
                if (i13 >= c3870tmArr2.length) {
                    break;
                }
                C3870tm c3870tm = c3870tmArr2[i13];
                if (c3870tm != null) {
                    iComputeInt32Size = CodedOutputByteBufferNano.computeMessageSize(31, c3870tm) + iComputeInt32Size;
                }
                i13++;
            }
        }
        C3820rm c3820rm = this.D;
        return c3820rm != null ? iComputeInt32Size + CodedOutputByteBufferNano.computeMessageSize(32, c3820rm) : iComputeInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f48459a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f48459a);
        }
        codedOutputByteBufferNano.writeInt64(2, this.f48460b);
        String[] strArr = this.f48461c;
        int i13 = 0;
        if (strArr != null && strArr.length > 0) {
            int i14 = 0;
            while (true) {
                String[] strArr2 = this.f48461c;
                if (i14 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i14];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(3, str);
                }
                i14++;
            }
        }
        if (!this.f48462d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f48462d);
        }
        if (!this.f48463e.equals("")) {
            codedOutputByteBufferNano.writeString(5, this.f48463e);
        }
        String[] strArr3 = this.f48464f;
        if (strArr3 != null && strArr3.length > 0) {
            int i15 = 0;
            while (true) {
                String[] strArr4 = this.f48464f;
                if (i15 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i15];
                if (str2 != null) {
                    codedOutputByteBufferNano.writeString(6, str2);
                }
                i15++;
            }
        }
        String[] strArr5 = this.f48465g;
        if (strArr5 != null && strArr5.length > 0) {
            int i16 = 0;
            while (true) {
                String[] strArr6 = this.f48465g;
                if (i16 >= strArr6.length) {
                    break;
                }
                String str3 = strArr6[i16];
                if (str3 != null) {
                    codedOutputByteBufferNano.writeString(7, str3);
                }
                i16++;
            }
        }
        C3796qm[] c3796qmArr = this.f48466h;
        if (c3796qmArr != null && c3796qmArr.length > 0) {
            int i17 = 0;
            while (true) {
                C3796qm[] c3796qmArr2 = this.f48466h;
                if (i17 >= c3796qmArr2.length) {
                    break;
                }
                C3796qm c3796qm = c3796qmArr2[i17];
                if (c3796qm != null) {
                    codedOutputByteBufferNano.writeMessage(8, c3796qm);
                }
                i17++;
            }
        }
        C3845sm c3845sm = this.f48467i;
        if (c3845sm != null) {
            codedOutputByteBufferNano.writeMessage(9, c3845sm);
        }
        if (!this.f48468j.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.f48468j);
        }
        if (!this.f48469k.equals("")) {
            codedOutputByteBufferNano.writeString(11, this.f48469k);
        }
        if (!this.f48470l.equals("")) {
            codedOutputByteBufferNano.writeString(12, this.f48470l);
        }
        codedOutputByteBufferNano.writeBool(13, this.f48471m);
        if (!this.f48472n.equals("")) {
            codedOutputByteBufferNano.writeString(14, this.f48472n);
        }
        String[] strArr7 = this.f48473o;
        if (strArr7 != null && strArr7.length > 0) {
            int i18 = 0;
            while (true) {
                String[] strArr8 = this.f48473o;
                if (i18 >= strArr8.length) {
                    break;
                }
                String str4 = strArr8[i18];
                if (str4 != null) {
                    codedOutputByteBufferNano.writeString(15, str4);
                }
                i18++;
            }
        }
        C3945wm c3945wm = this.f48474p;
        if (c3945wm != null) {
            codedOutputByteBufferNano.writeMessage(16, c3945wm);
        }
        boolean z13 = this.f48475q;
        if (z13) {
            codedOutputByteBufferNano.writeBool(17, z13);
        }
        if (!this.f48476r.equals("")) {
            codedOutputByteBufferNano.writeString(20, this.f48476r);
        }
        codedOutputByteBufferNano.writeInt64(21, this.f48477s);
        codedOutputByteBufferNano.writeInt64(22, this.f48478t);
        boolean z14 = this.f48479u;
        if (z14) {
            codedOutputByteBufferNano.writeBool(23, z14);
        }
        C3895um c3895um = this.f48480v;
        if (c3895um != null) {
            codedOutputByteBufferNano.writeMessage(24, c3895um);
        }
        codedOutputByteBufferNano.writeInt32(25, this.f48481w);
        codedOutputByteBufferNano.writeInt32(26, this.f48482x);
        C3771pm c3771pm = this.f48483y;
        if (c3771pm != null) {
            codedOutputByteBufferNano.writeMessage(27, c3771pm);
        }
        C3746om c3746om = this.f48484z;
        if (c3746om != null) {
            codedOutputByteBufferNano.writeMessage(28, c3746om);
        }
        C3721nm c3721nm = this.A;
        if (c3721nm != null) {
            codedOutputByteBufferNano.writeMessage(29, c3721nm);
        }
        C3920vm c3920vm = this.B;
        if (c3920vm != null) {
            codedOutputByteBufferNano.writeMessage(30, c3920vm);
        }
        C3870tm[] c3870tmArr = this.C;
        if (c3870tmArr != null && c3870tmArr.length > 0) {
            while (true) {
                C3870tm[] c3870tmArr2 = this.C;
                if (i13 >= c3870tmArr2.length) {
                    break;
                }
                C3870tm c3870tm = c3870tmArr2[i13];
                if (c3870tm != null) {
                    codedOutputByteBufferNano.writeMessage(31, c3870tm);
                }
                i13++;
            }
        }
        C3820rm c3820rm = this.D;
        if (c3820rm != null) {
            codedOutputByteBufferNano.writeMessage(32, c3820rm);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    public static C3970xm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C3970xm().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3970xm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    return this;
                case 10:
                    this.f48459a = codedInputByteBufferNano.readString();
                    break;
                case 16:
                    this.f48460b = codedInputByteBufferNano.readInt64();
                    break;
                case C4007z9.G /* 26 */:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                    String[] strArr = this.f48461c;
                    int length = strArr == null ? 0 : strArr.length;
                    int i13 = repeatedFieldArrayLength + length;
                    String[] strArr2 = new String[i13];
                    if (length != 0) {
                        System.arraycopy(strArr, 0, strArr2, 0, length);
                    }
                    while (length < i13 - 1) {
                        strArr2[length] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    strArr2[length] = codedInputByteBufferNano.readString();
                    this.f48461c = strArr2;
                    break;
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    this.f48462d = codedInputByteBufferNano.readString();
                    break;
                case 42:
                    this.f48463e = codedInputByteBufferNano.readString();
                    break;
                case 50:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 50);
                    String[] strArr3 = this.f48464f;
                    int length2 = strArr3 == null ? 0 : strArr3.length;
                    int i14 = repeatedFieldArrayLength2 + length2;
                    String[] strArr4 = new String[i14];
                    if (length2 != 0) {
                        System.arraycopy(strArr3, 0, strArr4, 0, length2);
                    }
                    while (length2 < i14 - 1) {
                        strArr4[length2] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    strArr4[length2] = codedInputByteBufferNano.readString();
                    this.f48464f = strArr4;
                    break;
                case 58:
                    int repeatedFieldArrayLength3 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                    String[] strArr5 = this.f48465g;
                    int length3 = strArr5 == null ? 0 : strArr5.length;
                    int i15 = repeatedFieldArrayLength3 + length3;
                    String[] strArr6 = new String[i15];
                    if (length3 != 0) {
                        System.arraycopy(strArr5, 0, strArr6, 0, length3);
                    }
                    while (length3 < i15 - 1) {
                        strArr6[length3] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length3++;
                    }
                    strArr6[length3] = codedInputByteBufferNano.readString();
                    this.f48465g = strArr6;
                    break;
                case 66:
                    int repeatedFieldArrayLength4 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 66);
                    C3796qm[] c3796qmArr = this.f48466h;
                    int length4 = c3796qmArr == null ? 0 : c3796qmArr.length;
                    int i16 = repeatedFieldArrayLength4 + length4;
                    C3796qm[] c3796qmArr2 = new C3796qm[i16];
                    if (length4 != 0) {
                        System.arraycopy(c3796qmArr, 0, c3796qmArr2, 0, length4);
                    }
                    while (length4 < i16 - 1) {
                        C3796qm c3796qm = new C3796qm();
                        c3796qmArr2[length4] = c3796qm;
                        codedInputByteBufferNano.readMessage(c3796qm);
                        codedInputByteBufferNano.readTag();
                        length4++;
                    }
                    C3796qm c3796qm2 = new C3796qm();
                    c3796qmArr2[length4] = c3796qm2;
                    codedInputByteBufferNano.readMessage(c3796qm2);
                    this.f48466h = c3796qmArr2;
                    break;
                case 74:
                    if (this.f48467i == null) {
                        this.f48467i = new C3845sm();
                    }
                    codedInputByteBufferNano.readMessage(this.f48467i);
                    break;
                case 82:
                    this.f48468j = codedInputByteBufferNano.readString();
                    break;
                case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                    this.f48469k = codedInputByteBufferNano.readString();
                    break;
                case 98:
                    this.f48470l = codedInputByteBufferNano.readString();
                    break;
                case 104:
                    this.f48471m = codedInputByteBufferNano.readBool();
                    break;
                case 114:
                    this.f48472n = codedInputByteBufferNano.readString();
                    break;
                case 122:
                    int repeatedFieldArrayLength5 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 122);
                    String[] strArr7 = this.f48473o;
                    int length5 = strArr7 == null ? 0 : strArr7.length;
                    int i17 = repeatedFieldArrayLength5 + length5;
                    String[] strArr8 = new String[i17];
                    if (length5 != 0) {
                        System.arraycopy(strArr7, 0, strArr8, 0, length5);
                    }
                    while (length5 < i17 - 1) {
                        strArr8[length5] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length5++;
                    }
                    strArr8[length5] = codedInputByteBufferNano.readString();
                    this.f48473o = strArr8;
                    break;
                case 130:
                    if (this.f48474p == null) {
                        this.f48474p = new C3945wm();
                    }
                    codedInputByteBufferNano.readMessage(this.f48474p);
                    break;
                case 136:
                    this.f48475q = codedInputByteBufferNano.readBool();
                    break;
                case 162:
                    this.f48476r = codedInputByteBufferNano.readString();
                    break;
                case 168:
                    this.f48477s = codedInputByteBufferNano.readInt64();
                    break;
                case 176:
                    this.f48478t = codedInputByteBufferNano.readInt64();
                    break;
                case 184:
                    this.f48479u = codedInputByteBufferNano.readBool();
                    break;
                case 194:
                    if (this.f48480v == null) {
                        this.f48480v = new C3895um();
                    }
                    codedInputByteBufferNano.readMessage(this.f48480v);
                    break;
                case 200:
                    this.f48481w = codedInputByteBufferNano.readInt32();
                    break;
                case OrderServiceErrorHandlerImpl.ORDER_STATUS_INCORRECT /* 208 */:
                    this.f48482x = codedInputByteBufferNano.readInt32();
                    break;
                case 218:
                    if (this.f48483y == null) {
                        this.f48483y = new C3771pm();
                    }
                    codedInputByteBufferNano.readMessage(this.f48483y);
                    break;
                case 226:
                    if (this.f48484z == null) {
                        this.f48484z = new C3746om();
                    }
                    codedInputByteBufferNano.readMessage(this.f48484z);
                    break;
                case 234:
                    if (this.A == null) {
                        this.A = new C3721nm();
                    }
                    codedInputByteBufferNano.readMessage(this.A);
                    break;
                case 242:
                    if (this.B == null) {
                        this.B = new C3920vm();
                    }
                    codedInputByteBufferNano.readMessage(this.B);
                    break;
                case 250:
                    int repeatedFieldArrayLength6 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 250);
                    C3870tm[] c3870tmArr = this.C;
                    int length6 = c3870tmArr == null ? 0 : c3870tmArr.length;
                    int i18 = repeatedFieldArrayLength6 + length6;
                    C3870tm[] c3870tmArr2 = new C3870tm[i18];
                    if (length6 != 0) {
                        System.arraycopy(c3870tmArr, 0, c3870tmArr2, 0, length6);
                    }
                    while (length6 < i18 - 1) {
                        C3870tm c3870tm = new C3870tm();
                        c3870tmArr2[length6] = c3870tm;
                        codedInputByteBufferNano.readMessage(c3870tm);
                        codedInputByteBufferNano.readTag();
                        length6++;
                    }
                    C3870tm c3870tm2 = new C3870tm();
                    c3870tmArr2[length6] = c3870tm2;
                    codedInputByteBufferNano.readMessage(c3870tm2);
                    this.C = c3870tmArr2;
                    break;
                case 258:
                    if (this.D == null) {
                        this.D = new C3820rm();
                    }
                    codedInputByteBufferNano.readMessage(this.D);
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                        return this;
                    }
                    break;
                    break;
            }
        }
    }

    public static C3970xm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C3970xm) MessageNano.mergeFrom(new C3970xm(), bArr);
    }
}
