package we;

/* JADX INFO: loaded from: classes2.dex */
final class wflxmlrfwp extends ppxfxbqfkf {
    wflxmlrfwp() {
    }

    @Override // we.ppxfxbqfkf
    public int eablkybsjg() {
        return 2;
    }

    @Override // we.ppxfxbqfkf
    int ppxfxbqfkf(char c13, StringBuilder sb3) {
        if (c13 == ' ') {
            sb3.append((char) 3);
            return 1;
        }
        if (c13 >= '0' && c13 <= '9') {
            sb3.append((char) (c13 - ','));
            return 1;
        }
        if (c13 >= 'a' && c13 <= 'z') {
            sb3.append((char) (c13 - 'S'));
            return 1;
        }
        if (c13 < ' ') {
            sb3.append((char) 0);
            sb3.append(c13);
            return 2;
        }
        if (c13 <= '/') {
            sb3.append((char) 1);
            sb3.append((char) (c13 - '!'));
            return 2;
        }
        if (c13 <= '@') {
            sb3.append((char) 1);
            sb3.append((char) (c13 - '+'));
            return 2;
        }
        if (c13 >= '[' && c13 <= '_') {
            sb3.append((char) 1);
            sb3.append((char) (c13 - 'E'));
            return 2;
        }
        if (c13 == '`') {
            sb3.append((char) 2);
            sb3.append((char) (c13 - '`'));
            return 2;
        }
        if (c13 <= 'Z') {
            sb3.append((char) 2);
            sb3.append((char) (c13 - '@'));
            return 2;
        }
        if (c13 > 127) {
            sb3.append("\u0001\u001e");
            return ppxfxbqfkf((char) (c13 - 128), sb3) + 2;
        }
        sb3.append((char) 2);
        sb3.append((char) (c13 - '`'));
        return 2;
    }
}
