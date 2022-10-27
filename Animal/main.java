package Animal;

public class main {
	public static void main(String[] args) {
		Meo meow = new Meo();
		meow.CanNang("10kg");
		meow.ChieuCao("1m");
		meow.MauLong("red");
		meow.MoiTruong("house");
		meow.tuoi("3 year");
		Chim bird = new Chim();
		bird.CanNang("10kg");
		bird.ChieuCao("1m");
		bird.Loai("chim");
		bird.MauLong("red");
		bird.SaiCanh("2m");
		Ca fish = new Ca();
		fish.CanNang("10kg");
		fish.ChieuCao("3m");
		fish.Loai("megalodon");
		fish.MauSac("red");
		fish.MoiTruong("red");
	}
}
