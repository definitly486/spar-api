package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iobyxmoadg implements hkdspvbjdz {
    protected int memoizedHashCode = 0;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static abstract class AbstractC0414iobyxmoadg implements hkdspvbjdz.iobyxmoadg {
        protected static UninitializedMessageException zoijcleaow(hkdspvbjdz hkdspvbjdzVar) {
            return new UninitializedMessageException(hkdspvbjdzVar);
        }
    }

    private String ppxfxbqfkf(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    @Override // com.google.crypto.tink.shaded.protobuf.hkdspvbjdz
    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            CodedOutputStream codedOutputStreamNtlheqmsrt = CodedOutputStream.ntlheqmsrt(bArr);
            iobyxmoadg(codedOutputStreamNtlheqmsrt);
            codedOutputStreamNtlheqmsrt.ppxfxbqfkf();
            return bArr;
        } catch (IOException e13) {
            throw new RuntimeException(ppxfxbqfkf("byte array"), e13);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.hkdspvbjdz
    public nufgyqmvbu toByteString() {
        try {
            nufgyqmvbu.C0415nufgyqmvbu c0415nufgyqmvbuYggfygwlhe = nufgyqmvbu.yggfygwlhe(getSerializedSize());
            iobyxmoadg(c0415nufgyqmvbuYggfygwlhe.zoijcleaow());
            return c0415nufgyqmvbuYggfygwlhe.iobyxmoadg();
        } catch (IOException e13) {
            throw new RuntimeException(ppxfxbqfkf("ByteString"), e13);
        }
    }

    UninitializedMessageException wkgbmnqykc() {
        return new UninitializedMessageException(this);
    }

    abstract int zoijcleaow(jhduphickx jhduphickxVar);
}
