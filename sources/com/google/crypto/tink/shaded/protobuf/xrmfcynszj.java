package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes2.dex */
abstract class xrmfcynszj {

    class iobyxmoadg implements zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ nufgyqmvbu f24078iobyxmoadg;

        iobyxmoadg(nufgyqmvbu nufgyqmvbuVar) {
            this.f24078iobyxmoadg = nufgyqmvbuVar;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.xrmfcynszj.zoijcleaow
        public byte byteAt(int i13) {
            return this.f24078iobyxmoadg.wkgbmnqykc(i13);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.xrmfcynszj.zoijcleaow
        public int size() {
            return this.f24078iobyxmoadg.size();
        }
    }

    private interface zoijcleaow {
        byte byteAt(int i13);

        int size();
    }

    static String iobyxmoadg(nufgyqmvbu nufgyqmvbuVar) {
        return zoijcleaow(new iobyxmoadg(nufgyqmvbuVar));
    }

    static String ppxfxbqfkf(String str) {
        return iobyxmoadg(nufgyqmvbu.ojitshcjhn(str));
    }

    static String zoijcleaow(zoijcleaow zoijcleaowVar) {
        StringBuilder sb3 = new StringBuilder(zoijcleaowVar.size());
        for (int i13 = 0; i13 < zoijcleaowVar.size(); i13++) {
            byte bByteAt = zoijcleaowVar.byteAt(i13);
            if (bByteAt == 34) {
                sb3.append("\\\"");
            } else if (bByteAt == 39) {
                sb3.append("\\'");
            } else if (bByteAt != 92) {
                switch (bByteAt) {
                    case 7:
                        sb3.append("\\a");
                        break;
                    case 8:
                        sb3.append("\\b");
                        break;
                    case 9:
                        sb3.append("\\t");
                        break;
                    case 10:
                        sb3.append("\\n");
                        break;
                    case 11:
                        sb3.append("\\v");
                        break;
                    case 12:
                        sb3.append("\\f");
                        break;
                    case 13:
                        sb3.append("\\r");
                        break;
                    default:
                        if (bByteAt < 32 || bByteAt > 126) {
                            sb3.append('\\');
                            sb3.append((char) (((bByteAt >>> 6) & 3) + 48));
                            sb3.append((char) (((bByteAt >>> 3) & 7) + 48));
                            sb3.append((char) ((bByteAt & 7) + 48));
                        } else {
                            sb3.append((char) bByteAt);
                        }
                        break;
                }
            } else {
                sb3.append("\\\\");
            }
        }
        return sb3.toString();
    }
}
