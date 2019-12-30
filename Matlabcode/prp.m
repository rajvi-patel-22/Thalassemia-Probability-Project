fid=fopen(['carrier.txt'])

s=textscan(fid,'%f %f %f %f')

fclose(fid)

x=s{1}

y=s{2}

z=s{3}

w=s{4}

subplot(2,2,1)

plot(x,y)

title('Unaffected Child')

subplot(2,2,2)

plot(x,z)

title('Carrier Child')

subplot(2,2,3)

plot(x,w)

title('affected Child')

subplot(2,2,4)

plot(x,y,x,z,x,w)

title('Combined')