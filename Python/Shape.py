class Shape:
    _width = None
    _height = None

    def _init_(self, width, height):
        self._width = width
        self._height = height

    def area(self):
        return self._width * self._height

    def perimeter(self):
        return 2 * (self._width + self._height)


class Rectangle(Shape):
    def _init_(self, width, height):
        super()._init_(width, height)


class Sqaure(Shape):
    def _init_(self, size):
        super()._init_(size, size)


rect = Rectangle(2, 4)
ra = rect.area()
rp = rect.perimeter()

sq = Sqaure(2)
sa = sq.area()
sp = sq.area()

print("Rectangle area = " + str(ra))
print("Rectangle perimeter = " + str(rp))

print("Square area = " + str(sa))
print("Square perimeter = " + str(sp))
