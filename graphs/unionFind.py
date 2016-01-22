__author__ = 'Chandu'

class Edge:
    src = -1
    dest = -1
    def __init__(self,src,dest):
        self.src = src
        self.dest = dest

class graph:
    v = 0
    e = 0
    edges = []

    def __init__(self,v,e):
        self.v = v
        self.e = e

    def find(self,parent, i):
        if parent[i] == -1:
            return i
        else:
            return self.find(parent,parent[i])

    def union(self,parent,par_x,par_y):
        parent[par_x] = par_y

    def isCycle(self):
        parent = [-1] * self.v

        for edge in self.edges:
            par_src = self.find(parent,edge.src)
            par_dest = self.find(parent,edge.dest)
            if par_src == par_dest:
                return True

            self.union(parent,par_src,par_dest)
        return False

if __name__ == "__main__":
    g = graph(3,3)
    g.edges.append(Edge(0,1))
    g.edges.append(Edge(1,2))
    g.edges.append(Edge(0,2))
    print(g.isCycle())
