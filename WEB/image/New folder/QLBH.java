class QLBH {
    public static void main(String[] args) {
        Dschitietphieunhaphang dsctpnh = new Dschitietphieunhaphang();
        Dsphieunhaphang dspnh = new Dsphieunhaphang();
        try {
            dsctpnh.docFile("Dschitietphieunhaphang.txt");
            dspnh.docFile("Dsphieunhaphang.txt");
        } catch (Exception e) {
            System.out.println("Loi doc file: " + e.getMessage());
        }
        for (int i = 0; i < dspnh.getSoLuong(); i++) {
            double tongTien = 0;
            String maPNH = dspnh.getDs()[i].getMaPNH();
            for (int j = 0; j < dsctpnh.getN(); j++) {
                if (dsctpnh.getDs()[j].getMaPNH().equals(maPNH)) {
                    tongTien += dsctpnh.getDs()[j].Thanhtien();
                }
            }
            dspnh.getDs()[i].setTongTien(tongTien);
        }

        dspnh.xuat();
    }
}
