package com.google.protobuf;

/* JADX INFO: loaded from: classes2.dex */
final class TextFormatEscaper {

    private interface ByteSequence {
        byte byteAt(int i13);

        int size();
    }

    private TextFormatEscaper() {
    }

    static String escapeBytes(ByteSequence byteSequence) {
        StringBuilder sb3 = new StringBuilder(byteSequence.size());
        for (int i13 = 0; i13 < byteSequence.size(); i13++) {
            byte bByteAt = byteSequence.byteAt(i13);
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

    static String escapeDoubleQuotesAndBackslashes(String str) {
        return str.replace("\\", "\\\\").replace("\"", "\\\"");
    }

    static String escapeText(String str) {
        return escapeBytes(ByteString.copyFromUtf8(str));
    }

    static String escapeBytes(final ByteString byteString) {
        return escapeBytes(new ByteSequence() { // from class: com.google.protobuf.TextFormatEscaper.1
            @Override // com.google.protobuf.TextFormatEscaper.ByteSequence
            public byte byteAt(int i13) {
                return byteString.byteAt(i13);
            }

            @Override // com.google.protobuf.TextFormatEscaper.ByteSequence
            public int size() {
                return byteString.size();
            }
        });
    }

    static String escapeBytes(final byte[] bArr) {
        return escapeBytes(new ByteSequence() { // from class: com.google.protobuf.TextFormatEscaper.2
            @Override // com.google.protobuf.TextFormatEscaper.ByteSequence
            public byte byteAt(int i13) {
                return bArr[i13];
            }

            @Override // com.google.protobuf.TextFormatEscaper.ByteSequence
            public int size() {
                return bArr.length;
            }
        });
    }
}
